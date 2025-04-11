class Student{
	private String name;
	private String courseName;
	private int rollno;
	public Student(String name, String courseName, int rollno) {
		this.name = name;
		this.courseName = courseName;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getId() {
		return rollno;
	}
	public void setId(int id) {
		this.rollno = id;
	}
	@Override
	protected void finalize() {
        System.out.println("Garbage Collected: " + name);
    }
}
public class q7 {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Memory before object creation:");
		System.out.println("Total Memory: " + runtime.totalMemory());
		System.out.println("Free Memory: " + runtime.freeMemory());
		Student s = new Student("Anurag","Btech",76854);
		System.out.println("Memory after object creation:");
		System.out.println("Total Memory: " + runtime.totalMemory());
		System.out.println("Free Memory: " + runtime.freeMemory());
		System.out.println("Student detail :\n"+s.getName()+"\n"+s.getCourseName()+"\n"+s.getId());
		s = null;
		System.gc();
		System.out.println("Memory after GC:");
		System.out.println("Total Memory: " + runtime.totalMemory());
		System.out.println("Free Memory: " + runtime.freeMemory());
	}
}