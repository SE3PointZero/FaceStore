package DBretrieve;

import Hibernate.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;

public class retrieveEmployee {
       
//    public void getemp(){
//   
//        Transaction transaction = null;
//        
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//           transaction = session.beginTransaction();
//           CriteriaBuilder builder = session.getCriteriaBuilder();
//           CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
//           Root<Employee> root = query.from(Employee.class);
//           query.select(root);
//           Query<Employee> q;
//              q = session.createQuery(query);
//           List<Employee> employee;
//          employee = q.getResultList();
//           }
//           transaction.commit();
//        }
//        catch(HibernateException e) static {
//           
//        } 
}
