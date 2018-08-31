package Classes;

public class NamingImage {
    
    private int loopNumber;
    private String idName, imageName;

    public int getLoopNumber() {
        return loopNumber;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    
    public void setLoopNumber(int loopNumber) {
        this.loopNumber = loopNumber;
    }
    
    public String name(){        
        //get the id of the customer and assign to idName
        return getImageName();
    }

}
