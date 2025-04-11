class AnonymousObject {
    private String name;
    public AnonymousObject(String name) {
        this.name = name;
    }
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected: " + name);
    }
}
public class q4{
    public static void main(String[] args) {
    	new AnonymousObject("TempObject");
        System.gc();
      
    }
}
