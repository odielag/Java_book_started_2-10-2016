package chapter_4;

import java.util.Scanner;

public class Exercise_4_13__VowelOrConsonant {

	/*
(Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant. Here is a sample run:

Enter a letter: B
B is a consonant

Enter a letter grade: a
a is a vowel

Enter a letter grade: #
# is an invalid input
	 */

	public static void main(String[] args) {

		// input
		Scanner input = new Scanner(System.in);
		char letter;
		char capitalizedLetter;
		String output;

		System.out.print("Enter a letter: ");
		letter = input.next().charAt(0);
		input.close();


		//System.out.print("\n" + (int)'a');		
		//System.out.print("\n" + (int)'E');		
		//System.out.print("\n" + (int)'I');		
		//System.out.print("\n" + (int)'O');		
		//System.out.print("\n" + (int)'U');		
		//System.out.print("\n" + (int)'Y');
		//System.out.print("\n" + (int)'z');
		// I just wanted to get their int values

		// processing
		capitalizedLetter = Character.toUpperCase(letter);
		switch (capitalizedLetter) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'Y':	output = letter + " is a vowel";
					break;
		default:	output = letter + " is a consonant";
		}

		// output
		if ((int)capitalizedLetter < 65 || 90 < (int)capitalizedLetter)
			System.out.print("Uhoh, did you use a letter?\nDid you input... " + letter);
		else System.out.print(output);
	}

}

// Completed on 4/8/2016 by William and peeps.