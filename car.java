class text{
	private String make;private String model;
	text(String make,String model){
		this.make=make;this.model=model;
	}
	public void setter(String make,String model) {
		this.make=make;this.model=model;
	}
	public String toString() {
		return("Make : "+make+"  Model : "+model);
	}
}
public class car {
	public static void main(String[] args) {
		car car1=new car("farari","xyz");
		car car2 = new car(null,null);
		System.out.println("make and model for car-1 : "+car1.toString());
		System.out.println("make and model for car-2 : "+car2.toString());
		car2.setter("bmw", "abc");
		System.out.println("make and model for car-2 : "+car2.toString());
	}
}
