package gelfile.info;
import java.io.File;
public class eg1 {
	public static void main(String[] args) {
		File ob = new File("D:\\234101114\\file info\\abc.txt");
		if(ob.exists()) {
			System.out.println("File found.");
		}
		else { 
			System.out.println("File not found.");
		}
		System.out.println("File name: "+ob.getName());
		System.out.println("Absolute path name: "+ob.getAbsolutePath());
		System.out.println("To write: "+ob.canWrite());
		System.out.println("To read: "+ob.canRead());
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            