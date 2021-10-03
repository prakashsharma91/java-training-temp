package org.besidescollege.corejava.datatypes;

public class UserDefindedDateType {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.employeeFirstName = "Suresh";
		emp1.employeeLastName = "Sharma";
		
		System.out.println(emp1.employeeFirstName);
	}
}

class Employee {
	String employeeFirstName;
	String employeeLastName;
	int employeeId;
	double salary;
	char level;
	boolean joinedAsFresher;
}
