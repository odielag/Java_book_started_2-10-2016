package chapter_6;

import java.util.Scanner;

/**
 * <h1>(Display an integer reversed)</h1> Write a method with the following header to
 * display an integer in reverse order:
 * 
 * public static void reverse(int number)
 * 
 * For example, reverse(3456) displays 6543 . Write a test program that prompts
 * the user to enter an integer and displays its reversal.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-18
 *
 */

public class Exercise_6_4__DisplayIntegerReversed
{
	/** main method for testing */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string of integers to be reversed: ");
		reverse(input.nextInt());
		input.close();
	}
	/** reverse method reverses integers then displays the result */
	public static void reverse(int number)
	{
		String reversed = "";
		while(number != 0)
		{
			reversed = reversed + String.valueOf(number % 10);
			number /= 10;
		}
		System.out.print(reversed);
	}
}
