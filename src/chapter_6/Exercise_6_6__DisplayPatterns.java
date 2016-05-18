package chapter_6;

import java.util.Scanner;

/**
 * (Display patterns) Write a method to display a pattern as follows:
 * 
 *               1 
 *             2 1 
 *           3 2 1 
 * ... 
 * n n-1 ... 3 2 1
 * 
 * The method header is 
 * 
 * public static void displayPattern(int n)
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-18
 *
 */

public class Exercise_6_6__DisplayPatterns
{
	/** main method for testing */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What integer would you like to pass to displayPattern?: ");
		displayPattern(input.nextInt());
		input.close();
	}
	/** function method */
	public static void displayPattern(int n)
	{
		System.out.println();
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j > 0; j--)
			{
				if(j > i)
					System.out.print("  ");
				else
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
