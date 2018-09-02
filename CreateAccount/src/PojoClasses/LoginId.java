package PojoClasses;

public class LoginId  implements java.io.Serializable {


     private String userName;
     private String userPassword;

    public LoginId() {
    }

    public LoginId(String userName, String userPassword) {
       this.userName = userName;
       this.userPassword = userPassword;
    }
   
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LoginId) ) return false;
		 LoginId castOther = ( LoginId ) other; 
         
		 return ( (this.getUserName()==castOther.getUserName()) || ( this.getUserName()!=null && castOther.getUserName()!=null && this.getUserName().equals(castOther.getUserName()) ) )
 && ( (this.getUserPassword()==castOther.getUserPassword()) || ( this.getUserPassword()!=null && castOther.getUserPassword()!=null && this.getUserPassword().equals(castOther.getUserPassword()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUserName() == null ? 0 : this.getUserName().hashCode() );
         result = 37 * result + ( getUserPassword() == null ? 0 : this.getUserPassword().hashCode() );
         return result;
   }   


}


