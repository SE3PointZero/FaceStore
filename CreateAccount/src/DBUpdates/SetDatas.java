package DBUpdates;

public class SetDatas{
    
    Hibernate.ManageDetails manageDetail = new Hibernate.ManageDetails();

    public SetDatas() {
         manageDetail.Configuration();
    }
    
    public void Close(){
        manageDetail.getFactory().close();  
        manageDetail.getSession().close();
    }
}
