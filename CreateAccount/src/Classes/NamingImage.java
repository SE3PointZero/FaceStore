package Classes;

public class NamingImage {
    
    private int loopNumber;
    private String imageName;

    public int getLoopNumber() {
        return loopNumber;
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
        setImageName(String.valueOf(getLoopNumber()));
        return (getImageName() + ".jpeg");
    }

}
