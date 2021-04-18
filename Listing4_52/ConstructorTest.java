package Listing4_52;

import java.util.Random;

public class ConstructorTest {
	public static void main(String [] args)
	{
		// Fill the staff array with three objects
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		// print out all information about Employee objects
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="+ e.getSalary());
		
	}
}

class Employee
{
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	// static initialization block
	static {
		Random generator = new Random();
		// set nextID to a random number
		nextId = generator.nextInt(10000);
	}
	// object initialization block
	{
		id = nextId;
		nextId++;
	}
	
	// three overloaded constructors
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public Employee (double s)
	{
		this("Employee #" + nextId, s);
	}
	
	//default constructor
	public Employee()
	{
		// name initialized to ""--see above
		// salary not explicitly set--initialized to 0
		// id initialized in initialization block
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary ()
	{
		return salary;
	}
	
	public int getId ()
	{
		return id;
	}

}
