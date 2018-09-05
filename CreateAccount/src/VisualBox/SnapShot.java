package VisualBox;

import javax.swing.JOptionPane;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class SnapShot {
    
    private String imageLocation;
    private static final String workingDir = System.getProperty("user.dir");

    Classes.NamingImage imgName = new Classes.NamingImage();
    VideoCapture camera = new VideoCapture(0);
    
    public void SentCount(int count){
        imgName.setLoopNumber(count);
    }
    
    public void TakeSnapShot(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        //VideoCapture camera = new VideoCapture(0);
        
        if(!camera.isOpened()){
            System.out.println("Error");
        }else{
            Mat frame = new Mat();            
            while(true){
                if(camera.read(frame)){
                    System.out.println("Frame obtained");
                    JOptionPane.showMessageDialog(null, "Storing on proces.......Please continue caputuring your image");
                    System.out.println("" + imgName.name());
                    Imgcodecs.imwrite(imgName.name(),frame);
                    setImageLocation(imgName.name());
                    break;
                }
            }
        }
        //camera.release();
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageName) {
        this.imageLocation = (getWorkingDir() + "\\" + imageName);
    }

    public static String getWorkingDir() {
        return workingDir;
    }

}
