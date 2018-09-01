/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBretrieve;

/**
 *
 * @author SP.SHARMILA
 */
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
        private static SessionFactory sessionFactory;
     
    static{
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
 
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
     
    public static void shutDown(){
        //closes caches and connections
        getSessionFactory().close();
    }
    
}
