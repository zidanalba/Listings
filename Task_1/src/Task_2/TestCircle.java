package Task_2;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println("Circle1 : "
				+ " Color = " + c1.getColor()
				+ " Filled = " + c1.isFilled()
				+ " Radius = " + c1.getRadius()
				+ " Perimeter = " + c1.getPerimeter()
				+ " Area = "+ c1.getArea()
				+ c1.toString());
		
		Circle c2 = new Circle(10.0, "Ash Grey", false);
		System.out.println("Circle2 : "
				+ " Color = " + c2.getColor()
				+ " Filled = " + c2.isFilled()
				+ " Radius = " + c2.getRadius()
				+ " Perimeter = " + c2.getPerimeter()
				+ " Area = "+ c2.getArea()
				+ c2.toString());
	}
	
	

}
