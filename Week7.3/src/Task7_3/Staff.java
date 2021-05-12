package Task7_3;

public class Staff {
	StaffMember [] stafflist;
	
	public Staff () {
		stafflist = new StaffMember[6];
		
		stafflist[0] = new Executive ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
		stafflist[1] = new Employee ("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
		stafflist[2] = new Employee ("Woody", "789 0ff Rocker", "555-0000", "010-20-3040", 1169.23);
		stafflist[3] = new Hourly ("Diane", "678 Fifth Ave", "555-0690", "958-47-3625", 10.55);
		stafflist[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8734");
		stafflist[5] = new Volunteer ("Cliff", "321 Dude Lane", "555-7282");
	}
	

public void payday() {
	double amount;
	
	for (int count = 0; count < stafflist.length; count++)
	{
		System.out.println(stafflist[count]);
		
		amount = stafflist[count].pay();	//polymorphic
		
		if (amount == 0.0)
			System.out.println("Thanks");
		else
			System.out.println("Paid : "+ amount);
		System.out.println("-----------------------------------");
		
		
	}

}
}

