package gelfile.info;
import java.io.*;
import java.util.*;
public class q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the file path to find if it is a directory : ");
		String s = sc.nextLine();
		File ob = new File(s);
		if(ob.exists()) {
			System.out.println(ob.isDirectory());
			File[] f = ob.listFiles();
			if(!(f==null)) {
				for(File i:f) {
					System.out.println(i.getName());
				}
			}			
		}
	}
}