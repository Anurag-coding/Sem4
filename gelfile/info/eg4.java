package gelfile.info;
import java.io.FileInputStream;
public class eg4 {
	public static void main(String[] args) {
		try {
			FileInputStream ob =  new FileInputStream("D:\\234101114\\file info\\int.txt");
			int i;
			while((i = ob.read())!= -1) {
				System.out.println((char)i);
			}
			ob.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
