package gelfile.info;
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
public class eg7 {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D:\\234101114\\file info\\dairy.txt");
			int i;
			while((i=f.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception e) {
			System.out.println("error");
		}
	}
}
/* output:-
   Date: 2025-04-02
   hello world
   welcome
*/