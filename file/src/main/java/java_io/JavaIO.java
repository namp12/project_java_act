package java_io;

import com.sun.tools.javac.Main;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaIO {   
    private static void createFile(File folder, File file){
        if(!folder.exists()){
            folder.mkdirs();
            System.out.println("create folder successfully");
        }else{
            System.out.println("create folder false");
        }
        
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("create file successfully");
            }catch(IOException ex){
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("create file false");
        }
    }
    
    private static void renamefile(File src, File target){
        if(src.renameTo(target)){
            System.out.println("renameto successfully");
        }else{
            System.out.println("rename fail");
        }
    }
    public static void main(String[] args) throws IOException {
//        File dir = new File("D:\\test\\JavaIO");   // truyền vào đường dẫn tuyệt đối của forder
//        // khởi tạo đối tượng folder có đường dẫn tuyệt đối là:....
//        // dir.mkdir();    // tạo một thư mục con trong đường dẫn hiện tại
//        dir.mkdirs();       // tạo thư mục cha con
//        
//        var file = new File(dir, "data.txt");
//        file.createNewFile();

        File dir = new File("D:\\test\\JavaIO"); 
        File file = new File(dir, "data.txt");
        createFile(dir, file);
        
        File renameFile = new File(dir, "data2.txt");
        renamefile(file, renameFile);
        
        String cuDir = System.getProperty("user.dir");
        System.out.println("curdir: " + cuDir);
        File moi = new File(cuDir + "/" + "Data");
        File filee = new File(moi, "pnam.txt");
        createFile(moi, filee);
        
        
    }
}
