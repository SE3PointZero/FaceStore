package DBUpdates;

public class SetEmployee extends SetDatas{
    
    public void setEmp(int id, String name, String nic){
        
        Hibernate.Employee e1=new Hibernate.Employee();    
        e1.setId(id);
        e1.setEm_Fullname(name);    
        e1.setEm_NIC(nic);
        
        manageDetail.getSession().save(e1);
        manageDetail.getT().commit();
        
        Close();
    }
}
