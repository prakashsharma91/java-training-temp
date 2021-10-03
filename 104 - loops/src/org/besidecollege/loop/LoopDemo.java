package org.besidecollege.loop;

public class LoopDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("for-loop");
		}

		int i = 0;

		while (i < 3) {
			System.out.println("while-loop");
			i++;
		}

		// Send email
		int attempts = 3;
		do {
			
			// Email send operation
			System.out.println("email sent failed");
			
			attempts--;
		} while (attempts > 0);
	}
}
