package Hibernate;

public class User {
    private int id;
    private String User_Name;
    private String User_Password;
    
    public int getId(){
      return id;
    }
    
     public void setId(int id) {
        this.id = id;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String userName) {
        this.User_Name = userName;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String password) {
        this.User_Password = password;
    }
    
}
