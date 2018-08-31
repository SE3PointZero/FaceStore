package DBUpdates;

public class SetEmployee extends SetDatas{
    
    public void setEmp(){
        
        Hibernate.Employee e1=new Hibernate.Employee();    
        e1.setId(1);
        e1.setEm_Fullname("Ramakrishnan");    
        e1.setEm_NIC("960470257v");
        
        manageDetail.getSession().save(e1);
        manageDetail.getT().commit();
        
        Close();
    }
}
