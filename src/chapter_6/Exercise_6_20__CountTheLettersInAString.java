package chapter_6;

import java.util.Scanner;

/**
 * <h1>(Count the letters in a string)</h1> Write a method that counts the number of
 * letters in a string using the following header:
 * 
 * public static int countLetters(String s)
 * 
 * Write a test program that prompts the user to enter a string and displays the
 * num- ber of letters in the string.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-19
 *
 */

public class Exercise_6_20__CountTheLettersInAString
{
	/** main class for testing. prompt user for string then display number of letters */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.printf("The number of letters in the string \"%s\" is: %d", s, countLetters(s));
		input.close();
	}
	/** class to count letters of a string and return an int value */
	public static int countLetters(String s)
	{
		int letters = 0;
		// for loop to increment letters variable when a char is a letter
		for(int i = 0; i < s.length(); i++)
		{
			if (Character.toUpperCase(s.charAt(i)) >= 'A' &&
					Character.toUpperCase(s.charAt(i)) <= 'Z')
				++letters;
				
		}
		return letters;
	}
}
