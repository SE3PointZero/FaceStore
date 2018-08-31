package DBUpdates;

public class SetUser extends SetDatas{
    
    public void setUser(){
        
        Hibernate.User u1 = new Hibernate.User();
        u1.setId(1);
        u1.setUser_Name("uthaya");
        u1.setUser_Password("12345");
        
        manageDetail.getSession().save(u1);
        manageDetail.getT().commit(); 
        
        Close();
    }
}
