package org.besidescollege.staticandfinal;

public class CountDemo {
	
	// Explain main method
	public static void main(String[] args) {
		Employee emp1 = new Employee("Suresh", "Sharma", 101, 40000.00);
		System.out.println(emp1.getCount());
		System.out.println(Employee.getCount());
		
		System.out.println("****");
		
		Employee emp2 = new Employee("Ramesh", "Sharma", 101, 40000.00);
		System.out.println(emp1.getCount());
		System.out.println(emp2.getCount());
		System.out.println(Employee.getCount());
	}
}
