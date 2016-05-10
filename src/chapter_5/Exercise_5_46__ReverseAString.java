package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Reverse a string)</h1> Write a program that prompts the user to enter a
 * string and displays the string in reverse order.
 * 
 * Enter a string: ABCD The reversed string is DCBA
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-10
 *
 */

public class Exercise_5_46__ReverseAString
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String original, reversed = "";
		System.out.print("Enter a string: ");
		original = input.nextLine();
		for (int i = 0; i < original.length(); i++)
			reversed = reversed + String.format("%c", 
					original.charAt(original.length() - 1 - i));
		System.out.print(reversed);
		input.close();
	}
}
