package Connection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
    
    //Login Object functions
    private static final int id = 1;
    
    public String retrieveLoginName(){ 
        login = (pojoClass.Login)session.get(pojoClass.Login.class,id);
        commitAndClose();
        return login.getUser_Name();
    }

    public String retrieveLoginPassword(){ 
        login = (pojoClass.Login)session.get(pojoClass.Login.class,id);
        commitAndClose();
        return login.getUser_Password();
    }
    
    //PasswordChanging
    public void updateLoginInfo(String name, String password){
        pojoClass.Login loginUpdate = new pojoClass.Login(name, password);
        session.update(loginUpdate);
        commitAndClose();
    }
    
    //Vip Object functions
    public void insertVip(String name, String nic, int card){
        vip.setFullname(name);
        vip.setIdNumber(nic);
        vip.setCardNumber(card);
        
        for(int i = 0; i<5; i++){
               
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
    
    public void getImage(){//To get the image from the project to store on the database
        Path path = Paths.get("");
        byte[] data = null;
        try{
            data = Files.readAllBytes(path);
            //session.doWork(conn -> {vip.setImage1(BlobProxy.generateProxy(getImage()));});
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }
    
    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void retrieveVip(String id){
        vip = (pojoClass.VipInfo)session.get(pojoClass.VipInfo.class, id);
        
        vip.getFullname();
        vip.getIdNumber();
        vip.getCardNumber();
        vip.getId();
        
        byte[] image = vip.getImage1();
    }
}
