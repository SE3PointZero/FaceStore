package DBConnection;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Connection {
    
    static Session session = null;
    static Transaction tx = null;

    public Connection() {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
    
    public void commitAndClose(){
        tx.commit();
        session.close();
    }
}
