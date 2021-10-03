package org.besidescollege.decisionmaking;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		if (userInput < 18) {
			System.out.println("Below 18");
		} else {
			System.out.println("18 and above");
		}

	}
}
