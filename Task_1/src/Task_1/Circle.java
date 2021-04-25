package Task_1;

public class Circle {
	private double radius;
	private String color;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Circle () {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) { // 2nd constructor
		 radius = r;
		 color = "red";
		 }
	
	public Circle (double r, String c) {
		radius = r;
		color = c;
	}
		 
		 /** Returns the radius */
		 public double getRadius() {
		 return radius; 
		 }
		 
		 /** Returns the area of this Circle instance */
		 public double getArea() {
		 return radius*radius*Math.PI;
		 }
		 
		 /** Return a self-descriptive string of this instance in the form of 
		Circle[radius=?,color=?] */
		 
		 public String toString() {
		 return "Circle[radius=" + radius + " color=" + color + "]";
		 }

}
