package VisualBox;

import javax.swing.JOptionPane;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class SnapShot {
    
    Classes.NamingImage imgName = new Classes.NamingImage();
    //Classes.Imagetransfer imgTransfer = new Classes.Imagetransfer();
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
                    JOptionPane.showMessageDialog(null, "Storing on proces.......");
                    System.out.println("" + imgName.name());
                    Imgcodecs.imwrite(imgName.name(),frame);
                    //imgTransfer.transfer(imgName.name());
                    break;
                }
            }
        }
        //camera.release();
    }
    
}
