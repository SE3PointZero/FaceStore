package Connection;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBConnection {

    Session session =  HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    
    pojoClass.Employee emp = new pojoClass.Employee();
    
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
    }
    
    public void deleteEmp(int id){
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, id);
        session.delete(emp);
        commitAndClose();
    }
    
    public String retrieveEmp(int id){ 
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, id);
        commitAndClose();
        return emp.getEmFullname();
    }
    
    //Login Object functions
    private static final int id = 1;
    
    public String retrieveLoginName(){ 
        pojoClass.Login login = new pojoClass.Login();
        login = (pojoClass.Login)session.get(pojoClass.Login.class,id);
        commitAndClose();
        return login.getUser_Name();
    }

    public String retrieveLoginPassword(){ 
        pojoClass.Login login = new pojoClass.Login();
        login = (pojoClass.Login)session.get(pojoClass.Login.class,id);
        commitAndClose();
        return login.getUser_Password();
    }
    
    //PasswordChanging
    public void updateLoginInfo(String name, String password){
        pojoClass.Login login = new pojoClass.Login(name, password);
        session.update(login);
        commitAndClose();
    }
}
