package DBdelete;

import DBUpdates.SetDatas;

public class DeleteEmployee extends SetDatas{
    
    Hibernate.ManageDetails manageDetail = new Hibernate.ManageDetails();
        
    public void delEmp(String nic){
        
        Hibernate.Employee e1=new Hibernate.Employee();    
        e1 = (Hibernate.Employee) manageDetail.getSession().get(Hibernate.Employee.class, nic);
        manageDetail.getSession().delete(e1);
        manageDetail.getT().commit();
        
        Close();
    } 
    
}
