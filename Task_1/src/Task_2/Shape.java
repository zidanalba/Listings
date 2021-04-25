package Task_2;

public class Shape {
	private String color;
	private boolean filled;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Shape() {
		color = "green";
		filled = true;
	}
	
	public Shape(String c, boolean f) {
		color = c;
		filled = f;
	}
	
	public String toString() {
		if (filled == true) {
			return "A Shape with color of " + color + " and filled";
	}
		else return "A Shape with color of " + color + " and not filled";
	}
	}
	

