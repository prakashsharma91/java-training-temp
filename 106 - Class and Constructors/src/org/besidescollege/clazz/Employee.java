package org.besidescollege.clazz;

public class Employee {
	public String firstName;
	public String lastName;
	public Address address;
	public Integer empId;
	public Double salary;
	
	// default value
	Employee(){
	}

	// diagram
	public Employee(String firstName, String lastName, Address address, Integer empId, Double salary) {
		// super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.empId = empId;
		this.salary = salary;
	}
}
