package PojoClasses;

public class Login  implements java.io.Serializable {


     private LoginId id;

    public Login() {
    }

    public Login(LoginId id) {
       this.id = id;
    }
   
    public LoginId getId() {
        return this.id;
    }
    
    public void setId(LoginId id) {
        this.id = id;
    }
    
}


