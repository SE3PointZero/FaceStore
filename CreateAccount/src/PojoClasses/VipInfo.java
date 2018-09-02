package PojoClasses;

public class VipInfo  implements java.io.Serializable {


     private Integer id;
     private String fullname;
     private String idNumber;
     private int cardNumber;
     private byte[] image1;
     private byte[] image2;
     private byte[] image3;
     private byte[] image4;
     private byte[] image5;

    public VipInfo() {
    }

    public VipInfo(String fullname, String idNumber, int cardNumber, byte[] image1, byte[] image2, byte[] image3, byte[] image4, byte[] image5) {
       this.fullname = fullname;
       this.idNumber = idNumber;
       this.cardNumber = cardNumber;
       this.image1 = image1;
       this.image2 = image2;
       this.image3 = image3;
       this.image4 = image4;
       this.image5 = image5;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getIdNumber() {
        return this.idNumber;
    }
    
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public int getCardNumber() {
        return this.cardNumber;
    }
    
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public byte[] getImage1() {
        return this.image1;
    }
    
    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }
    public byte[] getImage2() {
        return this.image2;
    }
    
    public void setImage2(byte[] image2) {
        this.image2 = image2;
    }
    public byte[] getImage3() {
        return this.image3;
    }
    
    public void setImage3(byte[] image3) {
        this.image3 = image3;
    }
    public byte[] getImage4() {
        return this.image4;
    }
    
    public void setImage4(byte[] image4) {
        this.image4 = image4;
    }
    public byte[] getImage5() {
        return this.image5;
    }
    
    public void setImage5(byte[] image5) {
        this.image5 = image5;
    }




}


