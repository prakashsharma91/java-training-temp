package org.besidescollege.outside;

import org.besidescollege._protected.ProtectedEmployee;

public class ProtectedDemo {

	public static void main(String[] args) {
		ProtectedEmployee emp1 = new ProtectedEmployee();
		// emp1.empId = 1;
		
		Staff emp2 = new Staff();
		// emp2.empId = 1;
		emp2.getEmployeeName();
	}
}
