/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_io;

import com.sun.tools.javac.Main;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phuong Nam
 */
public class JavaIO_thuchanh {
    private static void createFile(File folder, File file){
        if(!folder.exists()){
            folder.mkdirs();
            System.out.println("create folder success");
        }else{
            System.out.println("create folder fail");
        }
        
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("tao thanh cong");
            }catch(IOException ex){
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("khong tao duoc file");
        }
    }
    public static void main(String[] args) throws IOException {
//        File dir = new File("D://pnamm//test");
//        dir.mkdirs();
//        
//        File file = new File(dir, "pnam.java");
//        file.createNewFile();
//        
//        String curDir = System.getProperty("user.dir");
        String curDir = System.getProperty("user.dir");
        
        
        System.out.println("curdir: " + curDir);
        String seperate = File.separator;
        String folder = curDir + seperate + "data1";
        System.out.println("folder: "+ folder);
        File dir = new File(curDir + "/" + "phuongnamm");
        File file = new File(dir, "oneday.txt");
        createFile(dir, file);
    }
}
