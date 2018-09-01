package DBdelete;

import DBUpdates.SetDatas;

public class DeleteEmployee extends SetDatas{
    
    Hibernate.ManageDetails manageDetail = new Hibernate.ManageDetails();
        
    public void delEmp(String nic){
        
        Hibernate.Employee e1=new Hibernate.Employee();    
        
        manageDetail.getSession().delete(e1);
        manageDetail.getT().commit();
        
        Close();
    }
    
}
