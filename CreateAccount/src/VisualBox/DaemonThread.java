package VisualBox;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

public class DaemonThread implements Runnable{
    
    Mat frame = new Mat();
    MatOfByte mem = new MatOfByte();
    CascadeClassifier faceDetector = new CascadeClassifier(DaemonThread.class.getResource("haarcascade_frontalface_alt.xml").getPath().substring(1));
    MatOfRect faceDetections = new MatOfRect();
    
    private VideoCapture webSource;
    private JPanel panel;

    public VideoCapture getWebSource() {
        return webSource;
    }

    public void setWebSource(VideoCapture webSource) {
        this.webSource = webSource;
    }

    public DaemonThread(VideoCapture webSource, JPanel panel) {
        this.webSource = webSource;
        this.panel = panel;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    protected volatile boolean runnable = false;

    @Override
        public void run(){
            synchronized (this){
                while(runnable){
                    if(getWebSource().grab()){
                        try{
                            getWebSource().retrieve(frame);
                            Graphics g = getPanel().getGraphics();
                            faceDetector.detectMultiScale(frame, faceDetections);
                            for(Rect rect : faceDetections.toArray()){
                                Imgproc.rectangle(frame, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));   
                            }
                            Imgcodecs.imencode(".bmp", frame, mem);
                            Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray()));
                            BufferedImage buff = (BufferedImage) im;
                            if(g.drawImage(buff, 0, 0, panel.getWidth(), panel.getHeight(), 0, 0, buff.getWidth(), buff.getHeight(), null)){
                                if(runnable == false){
                                    System.out.println("Paused .......");
                                    this.wait();
                                }
                            }
                        }catch(Exception ex){
                            System.out.println("Error");
                        }
                    }
                }
            }
        }      
}
