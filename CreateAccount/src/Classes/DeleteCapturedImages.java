package Classes;

import java.io.File;

public class DeleteCapturedImages {
    
    File file;
    private static final String workingDir = System.getProperty("user.dir");

    public static String getWorkingDir() {
        return workingDir;
    }
    
    public void deletePicOnProject(){
        for(int i=0; i<5; i++){
            file = new File(getWorkingDir() + "\\" + "" + (i+1) + ".jpeg");
            file.delete();
        }
    }
}
