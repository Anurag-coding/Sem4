class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;
    public Image(int imageWidth, int imageHeight, String colorCode) {
       this.imageWidth = imageWidth;
       this.imageHeight = imageHeight;
       this.colorCode = colorCode;
   }
   // Default Constructor
   public Image() {
       this.imageWidth = 4;
       this.imageHeight = 9;
       this.colorCode = "#ff5733";
   }
   @Override
   public String toString() {
       return "Height:" + imageHeight + "  Width:" + imageWidth + "  ColorCode:" + colorCode;
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
       public boolean equals(Object o) {
           Image obj=(Image)o; //Object o type casted to Image type and stored in obj
           return imageWidth==obj.imageWidth && imageHeight==obj.imageHeight && colorCode.equals(obj.colorCode);
       }
       
}
public class q4 {
   public static void main(String[] args) {
       Image img1 = new Image(); // Default Constructor
       Image img2 = new Image(35, 48, "#b0786c"); // Parameterized Constructor
       System.out.println("Image 1: " + img1.toString()); // Automatically calls toString()
       System.out.println("Image 2: " + img2.toString());
   }
}
/* output:-
   Image 1: Height:9  Width:4  ColorCode:#ff5733
   Image 2: Height:48  Width:35  ColorCode:#b0786c
*/