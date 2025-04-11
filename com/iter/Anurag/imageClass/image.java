package com.iter.Anurag.imageClass;
public class image {
	private int imageWidth;
	private int imageHeight;
	private String colorCode;
	public image(int imageWidth,int imageHeight,String colorCode) {
		this.imageWidth = imageWidth;
		this.imageHeight = imageHeight;
		this.colorCode = colorCode;
	}
	public int getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}
	public int getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	@Override
	public String toString() {
		return "image [imageWidth=" + imageWidth + ", imageHeight=" + imageHeight + ", colorCode=" + colorCode + "]";
	}
	
}
