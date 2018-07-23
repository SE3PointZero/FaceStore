package Classes;

import java.awt.Toolkit;

public class FullScreen {
    
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public FullScreen() {
        
    }
    
    public void SetResolution(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        setWidth((int) tk.getScreenSize().getWidth());
        setHeight((int) tk.getScreenSize().getHeight());
    }
}
