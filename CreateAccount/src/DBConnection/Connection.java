package DBConnection;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Connection {
    
    static Session session = null;
    static Transaction tx = null;

    public void makeConnection() {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
    
    public void save(Object objSave){
        session.save(objSave);
    }
    
    public void delete(Object objDel){
        session.delete(objDel);
    }
    
    public void commitAndClose(){
        tx.commit();
        session.close();
    }
}
