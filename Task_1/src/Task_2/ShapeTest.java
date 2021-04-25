package Task_2;

public class ShapeTest {
	public static void main (String [] args) {
		Shape shape1 = new Shape();
		System.out.println("Shape : "
				+ "Color = " + shape1.getColor()
				+ " Filled = " + shape1.isFilled()
				+ " " + shape1.toString());
		
		Shape shape2 = new Shape("Magenta", false);
		System.out.println("Shape : "
				+ "Color = " + shape2.getColor()
				+ " Filled = " + shape2.isFilled()
				+ " " + shape2.toString());
		
	}
	
}
