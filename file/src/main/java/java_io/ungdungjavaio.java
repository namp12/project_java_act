package java_io;

import com.sun.tools.javac.Main;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ungdungjavaio {

    private static void createFile(File folder, File file) {
        if (!folder.exists()) {
            if (folder.mkdirs()) {
                System.out.println("Create folder successfully");
            } else {
                System.out.println("Create folder failed");
            }
        } else {
            System.out.println("Folder already exists");
        }

        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Create file successfully");
                } else {
                    System.out.println("Create file failed");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File already exists");
        }
    }

    private static void renamefile(File src, File target) {
        if (src.renameTo(target)) {
            System.out.println("Rename successfully");
        } else {
            System.out.println("Rename fail");
        }
    }

    private static void listchild(File dir, int level) {
        String indent = " ".repeat(level * 2);
        if (dir.isDirectory()) {
            System.out.println(indent + "[Folder] " + dir.getName());
            String[] list = dir.list();
            if (list != null) {
                for (String item : list) {
                    File child = new File(dir, item); // ✅ fix lỗi
                    listchild(child, level + 1);
                }
            }
        } else {
            System.out.println(indent + "- " + dir.getName());
        }
    }

    public static void main(String[] args) throws IOException {
        String cuDir = System.getProperty("user.dir");
        System.out.println("Current dir: " + cuDir);

        File dir = new File(cuDir);
        File filee = new File(dir, "pnam.txt");
        createFile(dir, filee);

        System.out.println("Files in folder:");
        String[] list = dir.list();
        if (list != null) {
            for (String item : list) {
                System.out.println(item);
            }
        }

        System.out.println("\nFolder structure:");
        listchild(dir, 0);
    }
}
