package DBdelete;

import DBUpdates.SetDatas;

public class DeleteVip extends SetDatas {
       
    Hibernate.ManageDetails manageDetail = new Hibernate.ManageDetails();
       
    public void delVIP(String nic){
        
        Hibernate.vip customer = new Hibernate.vip();
        
        manageDetail.getSession().delete(customer);
        manageDetail.getT().commit(); 
        
        Close();
    }
}
