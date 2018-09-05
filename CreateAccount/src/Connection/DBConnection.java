package Connection;

import java.sql.Blob;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Login Object functions
    private static final int id = 1;
    
    public String retrieveLoginName(){ 
        login = (pojoClass.Login)session.get(pojoClass.Login.class,id);
        String name = login.getUser_Name();
        commitAndClose();
        login = null;
        return name;
    }

    public String retrieveLoginPassword(){ 
        login = (pojoClass.Login)session.get(pojoClass.Login.class,id);
        String password = login.getUser_Password();
        commitAndClose();
        login = null;
        return password;
    }
    
    //PasswordChanging
    public void updateLoginInfo(String name, String password){
        pojoClass.Login loginUpdate = new pojoClass.Login(name, password);
        session.update(loginUpdate);
        commitAndClose();
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
        session.delete(vip);
        commitAndClose();
        vip = null;
    }
    
    public void retrieveVipOnProject(int id){
        vip = (pojoClass.VipInfo)session.get(pojoClass.VipInfo.class, id);
        Blob image = vip.getImage1();
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
