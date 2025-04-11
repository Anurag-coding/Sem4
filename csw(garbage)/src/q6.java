import java.util.ArrayList;
class collectionFrameWork {
    private String name;
    private int age;

    public collectionFrameWork(String name,int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected: " + name +" "+ age);
    }
}
public class q6 {
	public static void main(String[] args) {
		ArrayList<collectionFrameWork> al= new ArrayList<>();
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Memory before object creation:");
		System.out.println("Total Memory: " + runtime.totalMemory());
		System.out.println("Free Memory: " + runtime.freeMemory());
		al.add(new collectionFrameWork("Somaya",19));
		al.add(new collectionFrameWork("Anurag",20));
		System.out.println("Memory after object creation:");
		System.out.println("Total Memory: " + runtime.totalMemory());
		System.out.println("Free Memory: " + runtime.freeMemory());
		al.clear();;
		System.gc();
		System.out.println("Memory after GC:");
		System.out.println("Total Memory: " + runtime.totalMemory());
		System.out.println("Free Memory: " + runtime.freeMemory());
	}
}