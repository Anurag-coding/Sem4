class Rectangle{
	private double length;
	private double width;
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double calculateArea() {
	    return length * width;
	}
	public double calculatePerimeter() {
	    return 2 * (length + width);
	}
}
public class q2{
    public static void main(String[]args) {
        Rectangle R1 = new Rectangle(23.7,89.9);
		Rectangle R2 = new Rectangle(24.7,45.9);
		System.out.println("Area of 1st Rectangle is: "+R1.calculateArea());
        System.out.println("Perimeter of 1st Rectangle is: "+R1.calculatePerimeter());
        System.out.println("-----------------------");
        System.out.println("Area of 2nd Rectangle is: "+R2.calculateArea());
        System.out.println("Perimeter of 2nd Rectangle is: "+R2.calculatePerimeter());
    }
}
/* output:-
   Area of 1st Rectangle is: 2130.63
   Perimeter of 1st Rectangle is: 227.20000000000002
   ---------------------
   Area of 2nd Rectangle is: 1133.73
   Perimeter of 2nd Rectangle is: 141.2
*/
   
