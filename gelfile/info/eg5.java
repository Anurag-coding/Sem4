package gelfile.info;
import java.io.*;
import java.time.LocalDate;
import java.util.*;
public class eg5 {
	public static void main(String[] args) {
		try {
			FileOutputStream ob = new FileOutputStream("D:\\234101114\\file info\\dairy.txt");
			Scanner sc =new Scanner(System.in);
			LocalDate dt = LocalDate.now();
			String s1 = dt.toString();
			byte b1[]=s1.getBytes();
			ob.write(b1);
			System.out.println("enter the content : ");
			String s = sc.nextLine()+"\n";
			byte b[]=s.getBytes();
			ob.write(b);
			ob.close();
			System.out.println("file saved successfully.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}