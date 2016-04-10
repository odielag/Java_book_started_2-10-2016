package chapter_4;

import java.util.Scanner;

public class Exercise_4_15__PhoneKeyPads {

	/*
(Phone key pads) The international standard letter/number mapping found on the
telephone is shown below:

Write a program that prompts the user to enter a letter and displays its correspond-
ing number.

Enter a letter: A
The corresponding number is 2

Enter a letter: a
The corresponding number is 2

Enter a letter: +
+ is an invalid input
	 */

	public static void main(String[] args){

		// input
		char letter;
		int key = 999;

		System.out.println("Enter a letter: ");
		Scanner input = new Scanner(System.in);
		letter = Character.toUpperCase(input.next().charAt(0));
		input.close();

		// processing
		switch (letter) {
		case 'A': case 'B': case 'C': key = 2; break;
		case 'D': case 'E': case 'F': key = 3; break;
		case 'G': case 'H': case 'I': key = 4; break;
		case 'J': case 'K': case 'L': key = 5; break;
		case 'M': case 'N': case 'O': key = 6; break;
		case 'P': case 'Q': case 'R': case 'S': key = 7; break;
		case 'T': case 'U': case 'V': key = 8; break;
		case 'W': case 'X': case 'Y': case 'Z': key = 9; break;
		default: System.out.print(letter + " is an invalid input"); System.exit(0);
		}

		// output
		System.out.print("The corresponding number is " + key);
		
	}

}

// Completed by William ODieLag Pennington on 4/10/2016;