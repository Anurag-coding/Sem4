import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer s3 = new StringBuffer();
        int choice;
            System.out.println("\nSimple Text Editor Menu:");
            System.out.println("1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Reverse");
            System.out.println("5. Replace");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1: System.out.println(s3.append("helloworld"));
                        break;
                case 2: System.out.println(s3.insert(1,"hh"));
                        break;
                case 3: System.out.println(s3.delete(0,2));
                        break;
                case 4: System.out.println(s3.reverse());
                        break;
                case 5: System.out.println(s3.replace(0, 2, "oo"));
                	    break;
				default:System.out.println("Invalid choice. Please try again.");
		    }
    }
}
                        