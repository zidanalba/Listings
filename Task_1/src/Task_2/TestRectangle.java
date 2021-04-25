package Task_2;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();
		 System.out.println("Square:"
		 + " Color=" + s1.getColor()
		 + " Filled=" + s1.isFilled()
		 + " "
		 + " Side" + s1.getSide()
		 + " Area=" + s1.getArea()
		 + " Perimeter=" + s1.getPerimeter()
		 + "\n"
		 + s1.toString());
		 
		 Square s2 = new Square(10);
		 System.out.println("Square:"
		 + " Color=" + s2.getColor()
		 + " Filled=" + s2.isFilled()
		 + " "
		 + " Side" + s2.getSide()
		 + " Area=" + s2.getArea()
		 + " Perimeter=" + s2.getPerimeter()
		 + "\n"
		 + s2.toString());
		 
		 Square s3 = new Square(5, "grey", false);
		 System.out.println("Square:"
		 + " Color=" + s3.getColor()
		 + " Filled=" + s3.isFilled()
		 + " "
		 + " Side" + s3.getSide()
		 + " Area=" + s3.getArea()
		 + " Perimeter=" + s3.getPerimeter()
		 + "\n"
		 + s3.toString());
	}

}
