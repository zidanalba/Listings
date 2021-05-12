package dynamicPolymorphism;

public class Horse extends Animal{
	public void sound() {
		System.out.println ("Neighh");
	}
	
	public static void main (String [] args) {
		Animal obj = new Horse();
		obj.sound();
	}
}
