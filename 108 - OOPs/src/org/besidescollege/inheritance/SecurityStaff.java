package org.besidescollege.inheritance;

import org.besidescollege.ecapsulation.Employee;

public class SecurityStaff extends Employee {

	String uniform;
	
	public SecurityStaff(String firstName, String lastName, Integer empId, Double salary) {
		super(firstName, lastName, empId, salary);
		this.uniform = "blue";
	}
	
	public SecurityStaff(String firstName, String lastName, Integer empId, Double salary, String uniform) {
		super(firstName, lastName, empId, salary);
		this.uniform = uniform;
	}
	
	// Does not make sense in this case
	public SecurityStaff() {
		// super();
		this.uniform = "blue";
	}

	public String getUniform() {
		return uniform;
	}

	public void setUniform(String uniform) {
		this.uniform = uniform;
	}

	@Override
	public String getTimming() {
		return "8pm to 4pm";
	}

	@Override
	public String toString() {
		return super.toString() + " " + "SecurityStaff [uniform=" + uniform + ", getTimming()=" + getTimming() + "]";
	}
}
