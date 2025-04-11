package com.iter.Anurag.imageClass;
public class imageapp {
	public static void main(String[] args) {
		imagelibraray ob = new imagelibraray(2);
		image obj = new image(100,50,"blue");
		image obj1 = new image(120,60,"yellow");
		ob.addimage(obj);
		ob.addimage(obj1);
		ob.display();
		System.out.println("If the image found ? "+ob.searchimage(obj1));
		image o = ob.getimage(1);
		System.out.println("Get image at position 2 :\timage-width : "+o.getImageWidth()+"\timage-height : "+o.getImageHeight()+"\tColorcode : "+o.getColorCode());
	}
}
