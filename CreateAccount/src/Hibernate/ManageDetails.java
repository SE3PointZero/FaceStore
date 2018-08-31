package Hibernate;
 
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class ManageDetails {
    
    private StandardServiceRegistry ssr;
    private Metadata meta;
    private SessionFactory factory;
    private Session session;
    private Transaction t;

    public ManageDetails() {
    }

    public ManageDetails(StandardServiceRegistry ssr, Metadata meta, SessionFactory factory, Session session, Transaction t) {
        this.ssr = ssr;
        this.meta = meta;
        this.factory = factory;
        this.session = session;
        this.t = t;
    }

    public StandardServiceRegistry getSsr() {
        return ssr;
    }

    public void setSsr(StandardServiceRegistry ssr) {
        this.ssr = ssr;
    }

    public Metadata getMeta() {
        return meta;
    }

    public void setMeta(Metadata meta) {
        this.meta = meta;
    }

    public SessionFactory getFactory() {
        return factory;
    }

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getT() {
        return t;
    }

    public void setT(Transaction t) {
        this.t = t;
    }
    
   public void Configuration(){
       setSsr(new StandardServiceRegistryBuilder().configure("src/hibernate.cfg.xml").build());
       setMeta(new MetadataSources(ssr).getMetadataBuilder().build());
       setFactory(meta.getSessionFactoryBuilder().build());
       setSession(factory.openSession());
       setT(session.beginTransaction());    
    }    
}
