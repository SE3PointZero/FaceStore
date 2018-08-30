package Hibernate;

import java.awt.image.BufferedImage;

public class vip {
    private int id;
    private String fullname;
    private String Id_Number;
    private int Card_Number;
    private BufferedImage[] Image; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getId_Number() {
        return Id_Number;
    }

    public void setId_Number(String Id_Number) {
        this.Id_Number = Id_Number;
    }

    public int getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(int Card_Number) {
        this.Card_Number = Card_Number;
    }

    public BufferedImage[] getImage() {
        return Image;
    }

    public void setImage(BufferedImage[] Image) {
        this.Image = Image;
    }
    
    
    
}
