package DBEmployee;

import DBConnection.HibernateUtil;
import org.hibernate.Session;

public class EmployeeRetrieve {
    
    public String retrieve(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        EmployeeFunctions emp = new EmployeeFunctions();
        Object e = emp.getEmployee();
        e = (PojoClasses.Employee)session.get(PojoClasses.Employee.class, id);
        emp.commitAndClose();
        
        return e.getClass().getName();
    }
}
