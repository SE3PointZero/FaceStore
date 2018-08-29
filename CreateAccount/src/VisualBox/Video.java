package VisualBox;

import org.opencv.videoio.VideoCapture;

public class Video {
    
    VisualVariables variable = new VisualVariables();
    protected volatile boolean runnable = false;
    
    public void RunVideo(){
        variable.webSource = new VideoCapture(0);
        variable.myThread = new DaemonThread();
        Thread t = new Thread((Runnable) variable.myThread);
        t.setDaemon(true);
        variable.myThread.runnable = true;
        t.start();
    } 
}
