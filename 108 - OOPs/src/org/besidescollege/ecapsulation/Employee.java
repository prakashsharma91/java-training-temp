package org.besidescollege.ecapsulation;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private Integer empId;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, Integer empId, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.salary = salary;
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
	
	public Double getAnnualSalary() {
		//return salary * 12;
		return this.getSalary() * 12;
	}
	
	public abstract String getTimming();

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", salary=" + salary
				+ "]";
	}
}
