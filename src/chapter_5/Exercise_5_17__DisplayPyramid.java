package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Display pyramid)</h1> Write a program that prompts the user to enter an
 * integer from 1 to 15 and displays a pyramid, as shown in the following sample
 * run:
 * 
 * 
 * Enter the number of lines: 4
 *             1
 *         2   1   2 
 *     3   2   1   2   3 
 * 4   3   2   1   2   3   4
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-3
 */

public class Exercise_5_17__DisplayPyramid
{
	public static void main(String[] args)
	{
		// input
		Scanner input = new Scanner(System.in);
		int number;

		System.out.print("Enter an integer from 1 to 15: ");
		number = input.nextInt();

		// processing and output
		for (int j = 0; j < number; j++)
		{
			for (int i = -number + 1; i < number; i++)
			if (Math.abs(i) <= j)
				System.out.printf("%-3d", Math.abs(i) + 1);
			else
				System.out.printf("   ");
			System.out.println();
		}
		input.close();
	}
}
