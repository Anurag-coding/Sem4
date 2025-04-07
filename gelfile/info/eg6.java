package gelfile.info;
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
public class eg6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("D:\\234101114\\file info\\dairy.txt");
		if(!file.exists()) {
			System.out.println(" diary dosnot exist");
        }
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file , true))){
		System.out.println("Enter the new diary entry ");
		String entry = sc.nextLine();
		String timestamp = LocalDateTime.now().toString();
		writer.write("\nDate: " + "\n" + entry + "\n");
		System.out.println("new entry added successfully");
	}
		catch(IOException e) {
		System.out.println("error appending to file : " + e.getMessage());
	}
	
}

}
/* output:-
   Enter the new diary entry 
   This is file program
   new entry added successfully
*/
/* it will save in dairy.txt file.
*/ 
