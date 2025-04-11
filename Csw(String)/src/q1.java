public class q1 {
	public static void main(String[] args) {
        String strLiteral1 = "Hello";
        String strLiteral2 = "Hello";
        String strOb1 = new String("Hello");
        String strOb2 = new String("Hello");
        System.out.println("Using literals:");
        System.out.println("strLiteral1 == strLiteral2: " + (strLiteral1 == strLiteral2)); 
        System.out.println("Using new keyword:");
        System.out.println("strObject1 == strObject2: " + (strOb1 == strOb2)); 
        System.out.println("Comparing values:");
        System.out.println("strLiteral1.equals(strLiteral2): " + strLiteral1.equals(strLiteral2)); 
        System.out.println("strObject1.equals(strObject2): " + strOb1.equals(strOb2)); 
        System.out.println("Comparing literal with new object:");
        System.out.println("strLiteral1 == strObject1: " + (strLiteral1 == strOb1)); 
        System.out.println("strLiteral1.equals(strObject1): " + strLiteral1.equals(strOb1)); 
    }
}
