package chapter_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>(Sort characters in a string) Write a method that returns a sorted string
 * using the following header:
 * 
 * public static String sort(String s)
 * 
 * For example, sort("acb") returns abc . Write a test program that prompts the
 * user to enter a string and displays the sorted string.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-13
 *
 */

public class Exercise_7_34__SortCharactersInAString
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String string = input.nextLine();
		System.out.printf("The sorted string is: %s", sort(string));
		input.close();
	}
	public static String sort(String s)
	{
		char[] charArray = new char[s.length()];
		charArray = s.toCharArray();
		Arrays.sort(charArray);
		return String.valueOf(charArray);
	}
}
