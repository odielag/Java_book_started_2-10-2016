package chapter_4;

import java.util.Scanner;

public class Exercise_4_8__FindTheCharacterOfAnASCIICode {

	/*
(Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127 ) and displays its character. Here is a sample run:

Enter an ASCII code: 69
The character for ASCII code 69 is E
	 */

	public static void main(String[] args) {

		int theCharacter;
		
		System.out.print("Enter an ASCII code: ");
		Scanner input = new Scanner(System.in);
		theCharacter = input.nextInt();
		input.close();
		System.out.printf("The character for ASCII code %d is %c", theCharacter, (char)theCharacter);

	}
}

// Completed by William ODieLag Pennington and peeps on 4/8/2016;