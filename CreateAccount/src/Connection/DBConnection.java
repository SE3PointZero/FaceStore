package Connection;

import java.awt.List;
import java.util.ArrayList;
import net.bytebuddy.agent.builder.AgentBuilder.RawMatcher.Disjunction;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojoClass.Employee;
import pojoClass.LoginId;

public class DBConnection {

    Session session = session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    
    //Employee Object functions
    public void insertEmp(Employee e){
        session.save(e);
        tx.commit();
        session.close();
    }
    
    public void deleteEmp(int id){
        pojoClass.Employee emp = new pojoClass.Employee();
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, id);
        session.delete(emp);
        tx.commit();
        session.close();
    }
    
    public String retrieveEmp(int id){ 
        pojoClass.Employee emp = new pojoClass.Employee();
        emp = (pojoClass.Employee)session.get(pojoClass.Employee.class, id);
        tx.commit();
        session.close();
        return emp.getEmFullname();
    }
    
    //Login Object functions
    public String retrieveName(){       
        pojoClass.LoginId login = new pojoClass.LoginId(); 
        tx.commit();
        session.close();
        return login.getUserName();
    }

}
