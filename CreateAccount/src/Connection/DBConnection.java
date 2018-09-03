package Connection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pojoClass.Employee;

public class DBConnection {
    
    Session session = null;
    
    public void insert(Employee e){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
    }
    
    public void delete(int id){
        
        pojoClass.Employee emp = new pojoClass.Employee();
        
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, id);
        session.delete(emp);
        tx.commit();
        session.close();
    }
    
    public String retrieve(int id){
        
        pojoClass.Employee emp = new pojoClass.Employee();
        
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, id);
        tx.commit();
        session.close();
        
        return emp.getEmFullname();
    }
}
