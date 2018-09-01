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
public class DeleteEmployee extends SetDatas{
    Hibernate.ManageDetails manageDetail = new Hibernate.ManageDetails();
        public void setEmp(int id, String name, String nic){
        
        Hibernate.Employee e1=new Hibernate.Employee();    
        e1.setId(id);
        e1.setEm_Fullname(name);    
        e1.setEm_NIC(nic);
        
        manageDetail.getSession().delete(e1);
        manageDetail.getT().commit();
        
        Close();
    }
    
}
