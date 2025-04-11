import java.util.*;
class stud implements Comparable <stud> {
    private String name;
    private int rollNumber;
    private int totalMark;
    public stud(String name, int rollNumber, int totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public int getTotalMark() {
        return totalMark;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + ", totalMark=" + totalMark + "}";
    }
	@Override
	public int compareTo(stud o) {
		return Integer.compare(this.rollNumber, o.rollNumber);
	}
}
public class q5 {
    public static void bubbleSort (stud[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    stud temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        stud[] students = {
            new stud("Alice", 3, 85),
            new stud("Bob", 1, 90),
            new stud("Charlie", 2, 75),
            new stud("David", 4, 95)
        };
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(students));
        bubbleSort(students);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(students));
    }
}