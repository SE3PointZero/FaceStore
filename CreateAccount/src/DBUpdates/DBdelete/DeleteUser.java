/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUpdates.DBdelete;

import DBUpdates.SetDatas;

/**
 *
 * @author SP.SHARMILA
 */
public class DeleteUser extends SetDatas {
     Hibernate.ManageDetails manageDetail = new Hibernate.ManageDetails();
        public void setUser(int id, String name, String pass){
        
        Hibernate.User u1 = new Hibernate.User();
        u1.setId(id);
        u1.setUser_Name(name);
        u1.setUser_Password(pass);
        
        manageDetail.getSession().delete(u1);
        manageDetail.getT().commit(); 
        
        Close();
    }
}
