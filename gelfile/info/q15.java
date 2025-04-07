package gelfile.info;
import java.io.*;
public class q15{
    public static void main(String[] args) {
        String x= "D:\\234101114\\file info\\abc.txt";
        String y= "D:\\234101114\\file info\\a.txt";
        File ob1 = new File(x);
        File ob2 = new File(y);
        if (ob1.exists()) {
            boolean success = ob1.renameTo(ob2);
            if (success) {
                System.out.println("File renamed successfully to: " + ob2.getAbsolutePath());
            } else {
                System.out.println("Failed to rename the file. Please check if the new file name is valid.");
            }
        } else {
            System.out.println("The specified current file does not exist.");
        }
    }
}