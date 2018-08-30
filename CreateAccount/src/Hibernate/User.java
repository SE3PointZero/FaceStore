/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author SP.SHARMILA
 */
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
