package VisualBox;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.videoio.VideoCapture;
import org.opencv.objdetect.CascadeClassifier;

public class Video {
    
    DaemonThread myThread = null;
    VideoCapture webSource = null;
    Mat frame = new Mat();
    MatOfByte mem = new MatOfByte();
    //CascadeClassifier faceDetector = new CascadeClassifier(VisualVariables.class.getResource("haarcascade_frontalface_alt.xml").getPath().substring(1));
    MatOfRect faceDetections = new MatOfRect();
    
    public void RunVideo(){
        this.webSource = new VideoCapture(0);
        this.myThread = new DaemonThread();
        Thread t = new Thread();
        t.setDaemon(true);
        this.myThread.runnable = true;
        t.start();
    }
}
