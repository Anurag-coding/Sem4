package gelfile.info;
import java.io.*;
public class q14 {
	public static void main(String[] args) {
		try {
			FileInputStream ob1 = new FileInputStream("D:\\234101114\\file info\\input.txt");
			FileOutputStream ob2 = new FileOutputStream("D:\\234101114\\file info\\output.txt");
			int c;
			while((c=ob1.read())!=-1) {
				ob2.write((char)c);
			}
		} catch (Exception e) {
			System.out.println("error : "+e.getMessage());
		}
	}
}
/* output:-
   anything written in input.txt should be copy to output.txt
*/
