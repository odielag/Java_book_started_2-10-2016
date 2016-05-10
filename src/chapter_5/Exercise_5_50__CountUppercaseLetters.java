package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Count uppercase letters)</h1> Write a program that prompts the user to
 * enter a string and displays the number of the uppercase letters in the
 * string. 
 * 
 * Enter a string: Welcome to Java 
 * The number of uppercase letters is 2
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-10
 * 
 */

public class Exercise_5_50__CountUppercaseLetters
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inputString;
		int totalUpperCaseLetters = 0;
		
		System.out.print("Enter a string: ");
		inputString = input.nextLine();
		for (int i = 0; i < inputString.length(); i++)
			if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z')
				totalUpperCaseLetters++;
		System.out.printf("The number of uppercase letters is %d", totalUpperCaseLetters);		
		input.close();
	}
}
