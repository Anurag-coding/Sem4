class point {
    int x;
    int y;
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public point(point other) {
        this.x = other.x;
        this.y = other.y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
    public void calculateDist(point p1,point p2) {
    	int x1 = p1.x;
    	int x2 = p2.x;
    	int y1 = p1.y;
    	int y2 = p2.y;
    	double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    	System.out.println("Distance between "+"("+x1+","+x2+")"+" and "+"("+x1+","+x2+")"+" points is: " + dist);
    }
}
    class DistanceCalculator  {
    	  public void calculateDist(point p1, point p2) {
    	        int x1 = p1.x;
    	        int y1 = p1.y;
    	        int x2 = p2.x;
    	        int y2 = p2.y;

    	        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    	        System.out.println("Distance between points: " + dist);
    	    }
    public static void main(String[] args) {
    	  point p1 = new point(3, 4);
          point p2 = new point(7, 1);
          
          DistanceCalculator dc = new DistanceCalculator();
          dc.calculateDist(p1, p2);
    }
}
