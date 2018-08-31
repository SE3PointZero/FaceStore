package DBUpdates;

public class SetUser extends SetDatas{
    
    public void setUser(int id, String name, String pass){
        
        Hibernate.User u1 = new Hibernate.User();
        u1.setId(id);
        u1.setUser_Name(name);
        u1.setUser_Password(pass);
        
        manageDetail.getSession().save(u1);
        manageDetail.getT().commit(); 
        
        Close();
    }
}
