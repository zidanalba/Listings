package Listing4_6;
import Listing4_2.*;
// di mana ada Employee

import static java.lang.System.*;

/*
 * Author : Cay Horstmann
 */

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicEmployee harry = new PublicEmployee("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		// because of the static import statement, we don't have to use System.out here
		out.println(("name=" + harry.getName() + ",salary=" + harry.getSalary()));

	}

}
