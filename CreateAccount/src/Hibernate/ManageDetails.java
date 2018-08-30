package Hibernate;
 
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class ManageDetails {
  
   public static void main(String[] args) {
    
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction();   
            
    Employee e1=new Employee();    
    e1.setId(1);
    e1.setEm_Fullname("Ramakrishnan");    
    e1.setEm_NIC("960470257v"); 
    
    User u1 = new User();
    u1.setId(1);
    u1.setUser_Name("uthaya");
    u1.setUser_Password("12345");
    
    vip customer = new vip();
    customer.setId(1);
    customer.setFullname("sharmila");
    customer.setId_Number("955111172v");
    //customer.setImage("Face.jpg");
       
    session.save(e1);
    session.save(u1);
    session.save(customer);
    t.commit();  
    System.out.println("successfully saved");    
    factory.close();  
    session.close();    
        
}    
}
