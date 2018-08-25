package VisualBox;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class SnapShot {
    
    public void TakeSnapShot(){
        
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        VideoCapture camera = new VideoCapture(0);
        
        if(!camera.isOpened()){
            System.out.println("Error");
        }else{
            Mat frame = new Mat();
            while(true){
                if(camera.read(frame)){
                    System.out.println("Frame obtained");
                    Imgcodecs.imwrite("camera.jpg",frame);
                    break;
                }
            }
        }
        camera.release();
    }
}
