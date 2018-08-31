package DBUpdates;

public class SetVip extends SetDatas{
    
    public void setVIP(){
        
        Hibernate.vip customer = new Hibernate.vip();
        customer.setId(1);
        customer.setFullname("sharmila");
        customer.setId_Number("955111172v");
        //customer.setImage("Face.jpg");
        
        manageDetail.getSession().save(customer);
        manageDetail.getT().commit(); 
        
        Close();
    }
}
