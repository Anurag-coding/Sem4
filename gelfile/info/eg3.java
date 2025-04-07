package gelfile.info;
import java.io.FileOutputStream;
import java.util.Scanner;
public class eg3 {
	public static void main(String[] args) {
		try {
			FileOutputStream ob=new FileOutputStream("D:\\234101114\\file info\\output.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the content: ");
			String s = sc.nextLine()+"\n";
			byte b[]=s.getBytes();
			ob.write(b);
			sc.close();
			ob.close();
		}
		catch(Exception e){
			System.out.println("File not found");
		}
	}
}
