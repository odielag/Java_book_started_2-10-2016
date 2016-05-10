package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Process string)</h1> Write a program that prompts the user to enter a
 * string and dis- plays the characters at odd positions. Here is a sample run:
 * 
 * Enter a string: Beijing Chicago
 * BiigCiao
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-10
 *
 */

public class Exercise_5_48__ProcessString
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inputString, outputString = "";
		
		System.out.print("Enter a string: ");
		inputString = input.nextLine();
		for (int i = 0; i < inputString.length(); i++)
		{
			if ((i + 1) % 2 == 0)
				continue;
			outputString = outputString + String.format("%c", inputString.charAt(i));
		}
		System.out.print(outputString);
		input.close();
	}
}
