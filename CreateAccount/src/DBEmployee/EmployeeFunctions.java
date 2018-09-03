package DBEmployee;

import DBConnection.Connection;
import PojoClasses.Employee;

public class EmployeeFunctions extends Connection{

    private PojoClasses.Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public EmployeeFunctions() {       
        makeConnection();
        setEmployee(new PojoClasses.Employee());       
    }      
}
