package Classes;

import java.io.File;

public class Imagetransfer {
    
    String cwd = System.getProperty("user.dir");
    
    public void transfer(String name){
        File file = new File(cwd + name);
        
        //wants to connect to the db
        
//        if(file.renameTo(new File("C:\\Users\\prasanth\\Desktop\\FaceStore-master\\ImageCache\\" + name))){
//            file.delete();
//            System.out.println("File moved successfully");
//        }
//        else{
//            System.out.println("Failed to move the file");
//        }
    }
}
