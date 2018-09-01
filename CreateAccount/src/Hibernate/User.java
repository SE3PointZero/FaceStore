package Hibernate;

public class User {

    private String User_Name;
    private String User_Password;

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

    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
