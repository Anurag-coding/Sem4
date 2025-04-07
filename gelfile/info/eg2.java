package gelfile.info;
import java.io.File;
import java.util.Scanner;
public class eg2 {
	public static void main(String[] args) {
		try {
			File ob=new File("D:\\234101114\\file info\\input.txt");
	        System.out.println(ob.exists());
		    Scanner sc = new Scanner(ob);
		    while(sc.hasNextLine()) {
			   String s1 = sc.nextLine();
			   System.out.println(s1);
		    }
		    sc.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());  
		}
	}
}
