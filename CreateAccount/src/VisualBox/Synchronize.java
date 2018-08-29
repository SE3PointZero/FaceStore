package VisualBox;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Synchronize {
    
    protected volatile boolean runnable = false; 
    
    VisualVariables variable = new VisualVariables();
    
    public void ChangeOver(){
        
        while(runnable){
                    if(variable.webSource.grab()){
                        try{
                            variable.webSource.retrieve(variable.frame);
                            //Graphics g = jPanel1.getGraphics();
                            variable.faceDetector.detectMultiScale(variable.frame, variable.faceDetections);
                            
                            for(Rect rect : variable.faceDetections.toArray()){
                                Imgproc.rectangle(variable.frame, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));   
                            }
                            
                            Imgcodecs.imencode(".bmp", variable.frame, variable.mem);
                            Image im = ImageIO.read(new ByteArrayInputStream(variable.mem.toArray()));
                            BufferedImage buff = (BufferedImage) im;
                            
//                            if(g.drawImage(buff, 0, 0, getWidth(), getHeight() - 150, 0, 0, buff.getWidth(), buff.getHeight(), null)){
//                                if(runnable == false){
//                                    System.out.println("Paused .......");
//                                    this.wait();
//                                }
//                            }
                        }catch(Exception ex){
                            System.out.println("Error");
                        }
                    }
        }
    }
}
    
    

