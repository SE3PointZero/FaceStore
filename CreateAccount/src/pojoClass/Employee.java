package pojoClass;
// Generated Sep 3, 2018 7:40:07 AM by Hibernate Tools 4.3.1



/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private Integer id;
     private String emFullname;
     private String emNic;

    public Employee() {
    }

    public Employee(String emFullname, String emNic) {
       this.emFullname = emFullname;
       this.emNic = emNic;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmFullname() {
        return this.emFullname;
    }
    
    public void setEmFullname(String emFullname) {
        this.emFullname = emFullname;
    }
    public String getEmNic() {
        return this.emNic;
    }
    
    public void setEmNic(String emNic) {
        this.emNic = emNic;
    }




}


