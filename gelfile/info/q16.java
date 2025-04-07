package gelfile.info;
import java.io.*;
public class q16 {
    public static void main(String[] args) {
        String fileName = "D:\\234101114\\file info\\output.txt";
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File Metadata:");
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Last Modified: " +file.lastModified());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Is Hidden: " + file.isHidden());
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
/* output:-
   File Metadata:
   File Name: output.txt
   Absolute Path: D:\234101114\file info\output.txt
   File Size: 11 bytes
   Readable: true
   Writable: true
   Executable: true
   Last Modified: 1744004920238
   Is Directory: false
   Is File: true
   Is Hidden: false
*/

   
