package org.besidescollege.corejava;

import java.util.Scanner;

// 1. Diagram of class in memory
public class FirstClass {
 
	// 2. Main method
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner sc = new Scanner(System.in);	
		String userInput = sc.next();
		
		// 3. Print method
		System.out.println("Hello, "+ userInput);
	}
}
