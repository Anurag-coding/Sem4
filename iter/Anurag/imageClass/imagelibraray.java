package com.iter.Anurag.imageClass;
public class imagelibraray {
	image ArrayOfImageObject[]; int maxsize;int imagecount;
	public imagelibraray(int maxsize) {
		this.maxsize = maxsize;
		this.imagecount = 0;
		ArrayOfImageObject = new image[maxsize];
	}
	public void addimage(image ob) {
		ArrayOfImageObject[imagecount]= new image(ob.getImageWidth(),ob.getImageHeight(),ob.getColorCode());
		imagecount++;
	}
	public String searchimage(image ob) {
		for(int i=0;i<maxsize;i++) {
			if (ArrayOfImageObject[i].getImageHeight()==ob.getImageHeight() && ArrayOfImageObject[i].getImageWidth()==ob.getImageWidth() && ArrayOfImageObject[i].getColorCode()==ob.getColorCode()) {
				return ("yes image found at position : "+(i+1));
			}
		}
		return ("No image not found ");
	}
	public image getimage(Integer n) {
		n--;
		for(int i=0;i<maxsize;i++) {
			if (i==n) {
				return ArrayOfImageObject[i];
			}
		}
		return null;
	}
	public void display() {
		for(int i=0;i<maxsize;i++) {
			System.out.println("image-width : "+ArrayOfImageObject[i].getImageWidth()+"\nimage-height : "+ArrayOfImageObject[i].getImageHeight()+"\nColorcode : "+ArrayOfImageObject[i].getColorCode());
		}
	}
	
}