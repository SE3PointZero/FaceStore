package Hibernate;

public class Employee {

   private int id;
   private String Em_Fullname;
   private String Em_NIC;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEm_Fullname() {
        return Em_Fullname;
    }

    public void setEm_Fullname(String Em_Fullname) {
        this.Em_Fullname = Em_Fullname;
    }

    public String getEm_NIC() {
        return Em_NIC;
    }

    public void setEm_NIC(String Em_NIC) {
        this.Em_NIC = Em_NIC;
    }
}

