package chapter_4;

import java.util.Scanner;

public class Exercise_4_9__FindTheUnicodeOfACharacter {
	
	/*
(Find the Unicode of a character) Write a program that receives a character and
displays its Unicode. Here is a sample run:

Enter a character: E
The Unicode for the character E is 69
	 */

	public static void main(String[] args) {

		String theCharacter;
		
		System.out.print("Enter a character: ");
		Scanner input = new Scanner(System.in);
		theCharacter = input.nextLine();
		input.close();
		System.out.printf("The Unicode for the character %c is %d", theCharacter.charAt(0), (int)theCharacter.charAt(0));

	}
	
}

// Completed on 4/8/2016 by William ODieLag Pennington;