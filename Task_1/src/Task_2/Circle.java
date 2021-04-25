package Task_2;

public class Circle extends Shape {
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle() {
		super();
		radius = 1.0;
	}
	public Circle(double r) {
		super();
		radius = r;
	}
	public Circle(double r, String color, boolean filled) {
		super(color, filled);
		radius = r;
	}
	
	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * getRadius();
	}
	
	public String toString() {
		return "A Circle with radius " + radius + ", which is a subclass of " + super.toString();
	}
}
