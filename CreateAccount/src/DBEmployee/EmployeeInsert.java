package DBEmployee;

public class EmployeeInsert {
    
    public void insert(){
        EmployeeFunctions emp = new EmployeeFunctions();
        emp.save(emp.getEmployee());
        emp.commitAndClose();
    }
}
