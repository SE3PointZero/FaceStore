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
public class DeleteVip extends SetDatas {
       Hibernate.ManageDetails manageDetail = new Hibernate.ManageDetails();
       public void setVIP(int id, String name, String nic, int card){
        
        Hibernate.vip customer = new Hibernate.vip();
        customer.setId(id);
        customer.setFullname(name);
        customer.setId_Number(nic);
        customer.setCard_Number(card);
//        customer.setImage1(img1);
//        customer.setImage2(img2);
//        customer.setImage3(img3);
//        customer.setImage4(img4);
//        customer.setImage5(img5);
        
        manageDetail.getSession().delete(customer);
        manageDetail.getT().commit(); 
        
        Close();
    }
}
