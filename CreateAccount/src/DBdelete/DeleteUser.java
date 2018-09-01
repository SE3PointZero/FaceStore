package DBdelete;

import DBUpdates.SetDatas;

public class DeleteUser extends SetDatas {
     
    Hibernate.ManageDetails manageDetail = new Hibernate.ManageDetails();
        
    public void delUser(int id, String name, String pass){
        
        Hibernate.User u1 = new Hibernate.User();
        u1.setId(id);
        u1.setUser_Name(name);
        u1.setUser_Password(pass);
        
        manageDetail.getSession().delete(u1);
        manageDetail.getT().commit(); 
        
        Close();
    }
}
