package chapter_5;

import java.util.Scanner;		// imported scanner to simplify user input code.

public class Listing_5_14__Palindrome {

	/*
A string is a palindrome if it reads the same forward and backward. The words “mom,” “dad,”
and “noon,” for instance, are all palindromes.
The problem is to write a program that prompts the user to enter a string and reports
whether the string is a palindrome. One solution is to check whether the first character in the
string is the same as the last character. If so, check whether the second character is the same
as the second-to-last character. This process continues until a mismatch is found or all the
characters in the string are checked, except for the middle character if the string has an odd
number of characters.
	 */

	public static void main(String[] args)
	{
		// input	declare variables and do pre-processing work.
		Scanner input = new Scanner(System.in);
		String string;
		boolean palindrome = true;

		System.out.println("Please enter a string below:");
		string = input.nextLine();
		input.close();

		// processing	make a loop to check if string is a palendrome
		int i = 0;
		int j = string.length() - 1;
		while (i <  j)
		{
			if (string.charAt(i) != string.charAt(j))
			{
				palindrome = false;
				break;
			}
				// Debug
			System.out.printf("\ni: %d j: %d charAtI: %c charAtJ: %c palindrome: %b\n",
					i, j, string.charAt(i), string.charAt(j), palindrome);
			
			i++;
			j--;
		}

		// output   display if the string is a palendrome
		System.out.printf("%s", (palindrome) ? 
				"The string is a palindrome" : 
				"The string is not a palindrome");
	}

}

// Completed on Apr 27, 2016 by William ODieLag Pennington.