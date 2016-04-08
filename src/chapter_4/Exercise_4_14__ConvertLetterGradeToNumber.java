package chapter_4;

import java.util.Scanner;

public class Exercise_4_14__ConvertLetterGradeToNumber {

	/*
(Convert letter grade to number) Write a program that prompts the user to enter a
letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
1, or 0. Here is a sample run:

Enter a letter grade: B
The numeric value for grade B is 3

Enter a letter grade: T
T is an invalid grade
	 */

	public static void main(String[] args) {

		// input
		char letter;
		Scanner input = new Scanner(System.in);
		int number = 0;
		String output = "null";

		System.out.print("Enter a letter grade: ");
		letter = Character.toUpperCase(input.next().charAt(0));
		input.close();

		// processing
		switch (letter) {
		case 'A': number = 4; break;
		case 'B': number = 3; break;
		case 'C': number = 2; break;
		case 'D': number = 1; break;
		case 'F': number = 0; break;
		default: output = letter + " is an invalid grade";
		}
		if (!output.equals(letter + " is an invalid grade"))
		output = String.format("The numeric value for grade %c is %d", letter, number);

		// output
		System.out.printf(output);

	}

}
