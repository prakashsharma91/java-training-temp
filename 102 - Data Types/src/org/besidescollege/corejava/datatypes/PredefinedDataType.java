package org.besidescollege.corejava.datatypes;

import java.sql.Date;

public class PredefinedDataType {

	public static void main(String[] args) {
		// 1. Premitive
		int var1 = 0;
		double var2 = 0;
		String var3 = "";
		char var4 = 'a';
		boolean var5 = false;
		
		// byte, short, int, long, float, double, char, boolean
		
		// Use variables
		String employeeFirstName = "Suresh";
		String employeeLastName = "Sharma";
		int employeeId = 101;
		double salary = 40000;
		char level = 'B';
		boolean joinedAsFresher = true;
		
		// 2. Object
		Integer obj1 = 128;
		Double obj2 = 0.0;
		String obj3 = "";
		Character obj4 = 'a';
		Boolean obj5 = false;
		Date date;
		
		// Functionality of Object
		System.out.println(obj1.byteValue());
	}
}
