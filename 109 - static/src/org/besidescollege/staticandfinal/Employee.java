package org.besidescollege.staticandfinal;

public class Employee {

	String firstName;
	String lastName;
	Integer empId;
	Double salary;
	static Integer count = 0;
	
	public Employee(String firstName, String lastName, Integer empId, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.salary = salary;
		count++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public static Integer getCount() {
		return count;
	}

	public static void setCount(Integer count) {
		Employee.count = count;
	}
}
