package DBUpdates;

public class SetEmployee extends SetDatas{
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setEmp(String name, String nic){
        
        Hibernate.Employee e1=new Hibernate.Employee();    
        e1.setId(getId());
        e1.setEm_Fullname(name);    
        e1.setEm_NIC(nic);
        
        manageDetail.getSession().save(e1);
        manageDetail.getT().commit();
        
        Close();
    }
}
