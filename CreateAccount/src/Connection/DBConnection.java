package Connection;

import java.awt.Image;
import java.sql.Blob;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.BlobProxy;

public class DBConnection {
    
    private String array[] = new String[5];

    Session session =  HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    
    pojoClass.Employee emp = new pojoClass.Employee();
    pojoClass.Login login = new pojoClass.Login();
    pojoClass.VipInfo vip = new pojoClass.VipInfo();
    
    public void commitAndClose(){
        tx.commit();
        session.close();
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Employee Object functions
    public void insertEmp(String name, String nic){
        emp.setEmFullname(name);
        emp.setEmNic(nic);
        session.save(emp);
        commitAndClose();
        emp = null;
    }
    
    public void deleteEmp(int id){
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, id);
        session.delete(emp);
        commitAndClose();
        emp = null;
    }
    
    public String retrieveEmp(int id){ 
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, id);
        commitAndClose();
        return emp.getEmFullname();
    }
    
    public List retrieveIdColumn(){
        List<Integer> empId = new ArrayList<Integer>();
        Query qry = session.createSQLQuery("select e.id from employee e");
        List idList = qry.list();
        Iterator itr = idList.iterator();
        while(itr.hasNext()){
            int ids = (int)itr.next();
            empId.add(ids);
        }
        return empId;
    }
        public String retrieveEmpNIC(String nic){
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, nic);
        commitAndClose();
        return emp.getEmNic();
       }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Login Object functions
    private static final int id = 1;
    
    public Object retrieveLogin(){ 
        login = (pojoClass.Login)session.get(pojoClass.Login.class,id);
        commitAndClose();
        return login;
    }

    public void updateLoginInfo(String name, String password){
        login = (pojoClass.Login)session.get(pojoClass.Login.class,id);
        login.setUser_Name(name);
        login.setUser_Password(password);
        session.update(login);
        commitAndClose();
        login = null;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Vip Object functions
    public void insertVip(String name, String nic){
        vip.setFullname(name);
        vip.setIdNumber(nic);
        
        for(int i = 0; i<5; i++){
            imageCondtions(i, vip);
        }
        
        session.save(vip);
        commitAndClose();
        vip = null;
    }
    
    public void deleteVip(int id){
        vip = (pojoClass.VipInfo)session.get(pojoClass.VipInfo.class, id);
        session.delete(vip);
        commitAndClose();
        vip = null;
    }
    
    public Object retrieveVipInfo(int num){
        vip = (pojoClass.VipInfo)session.get(pojoClass.VipInfo.class, num);
        commitAndClose();
        return vip;
    }
    public String retrieveVip(int id){
        vip = (pojoClass.VipInfo)session.get(pojoClass.VipInfo.class, id);
        commitAndClose();
        return vip.getFullname();
    }
      public String retrieveVipNIC(String nic){
        vip = (pojoClass.VipInfo)session.get(pojoClass.VipInfo.class, nic);
        commitAndClose();
        return vip.getIdNumber();
       }
    
    public ImageIcon retrieveVipOnProject(int num, int width, int height){
        vip = (pojoClass.VipInfo)session.get(pojoClass.VipInfo.class, num);
        
        Blob image = vip.getImage1();
        vip = null;
        
        try {
            InputStream inputStream = image.getBinaryStream();
            try {
                Files.copy(inputStream, Paths.get("ImageCache/1.jpeg"), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ImageIcon img = new ImageIcon("ImageCache/1.jpeg");
        Image photo = img.getImage();
        Image newPhoto = photo.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon profile = new ImageIcon(newPhoto);
        return profile;
    }
    
    public byte[] getImage(String imagePath){//To get the image from the project to store on the database
        Path path = Paths.get(imagePath);
        byte[] data = null;
        try{
            data = Files.readAllBytes(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
        return data;
    }
    
    public String getArray(int index) {
        return array[index];
    }

    public void setArray(String[] array) {
        this.array = array;
    }
    
    private void imageCondtions(int num, Object b){
        String loc = getArray(num);
        pojoClass.VipInfo vipI = (pojoClass.VipInfo) b ;
        switch(num){
            case 0:
                session.doWork(conn -> {vipI.setImage1(BlobProxy.generateProxy(getImage(loc)));});
                break;
            case 1:
                session.doWork(conn -> {vipI.setImage2(BlobProxy.generateProxy(getImage(loc)));});
                break;
            case 2:
                session.doWork(conn -> {vipI.setImage3(BlobProxy.generateProxy(getImage(loc)));});
                break;
            case 3:
                session.doWork(conn -> {vipI.setImage4(BlobProxy.generateProxy(getImage(loc)));});
                break;
            case 4:
                session.doWork(conn -> {vipI.setImage5(BlobProxy.generateProxy(getImage(loc)));});
                break;
            default:
                System.out.println("Error while sending images to the database");
                break;
        }
    }
}
