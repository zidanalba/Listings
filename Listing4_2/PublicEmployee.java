package Listing4_2;

import java.time.LocalDate;

public class PublicEmployee {
	
		private String name;
		private double salary;
		private LocalDate hireDay;
		
		public PublicEmployee (String n, double s, int year, int month, int day)
		{
			name = n;
			salary = s;
			hireDay = LocalDate.of(year, month, day);
		}
		
		public String getName ()
		{
			return name;
		}
		
		public double getSalary()
		{
			return salary;
		}
		
		public LocalDate getHireDay()
		{
			return hireDay;
		}
		
		public void raiseSalary(double byPercent)
		{
			double raise = salary * byPercent / 100;
			salary += raise;
		}
	

}
