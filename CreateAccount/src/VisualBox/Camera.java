package VisualBox;

import javax.swing.JPanel;
import org.opencv.videoio.VideoCapture;

public class Camera {
    
    private DaemonThread myThread = null;
    private VideoCapture webSource = null;
    private JPanel panel;
    
    public void camera(JPanel panel){
        
        this.panel = panel;
        
        webSource = new VideoCapture(0);
        myThread = new DaemonThread(this.getWebSource(), this.getPanel());
        Thread t = new Thread(myThread);
        t.setDaemon(true);
        myThread.runnable = true;
        t.start();
    }

    public VideoCapture getWebSource() {
        return webSource;
    }

    public void setWebSource(VideoCapture webSource) {
        this.webSource = webSource;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
}
