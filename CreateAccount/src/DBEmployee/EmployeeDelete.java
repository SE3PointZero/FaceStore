package DBEmployee;

import DBConnection.HibernateUtil;
import org.hibernate.Session;

public class EmployeeDelete {
    
    public void delete(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        EmployeeFunctions emp = new EmployeeFunctions();
        Object e = emp.getEmployee();
        e = (PojoClasses.Employee)session.get(PojoClasses.Employee.class, id);
        emp.delete(e);
        emp.commitAndClose();
    }
    
}
