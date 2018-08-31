package DBUpdates;

public class SetUser extends SetDatas{
    
    public void setUser(String name, String pass){
        
        Hibernate.User u1 = new Hibernate.User();
        u1.setUser_Name(name);
        u1.setUser_Password(pass);
        
        manageDetail.getSession().save(u1);
        manageDetail.getT().commit(); 
        
        Close();
    }
}
