package Connection;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBConnection {

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
    public void insertVip(String name, String nic, int card, byte[] image1, byte[] image2, byte[] image3, byte[] image4, byte[] image5){
        vip.setFullname(name);
        vip.setIdNumber(nic);
        vip.setCardNumber(card);
        vip.setImage1(image1);
        vip.setImage2(image2);
        vip.setImage3(image3);
        vip.setImage4(image4);
        vip.setImage5(image5);
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
}
