package chapter_4;

import java.util.Scanner;

public class Exercise_4_20__ProcessAString {
	
	/*
(Process a string) Write a program that prompts the user to enter a string and dis-
plays its length and its first character.
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Enter a string: ");
		Scanner input = new Scanner(System.in);
		String theString = input.nextLine();
		input.close();
		System.out.printf("String length: %d\nFirst letter: %c", 
				theString.length(), theString.charAt(0));
	}

}
