package chapter_7;

import java.util.Scanner;

/**
 * <h1>(Math: combinations)</h1> Write a program that prompts the user to enter
 * 10 integers and displays all combinations of picking two numbers from the 10.
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-6-12
 *
 */

public class Exercise_7_28__MathCombinations
{
	public static void main(String[] args)
	{
		combinations();
	}
	public static void combinations()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		int[] array = new int[10];
		for(int i = 0; i < array.length; ++i)
		{
			array[i] = input.nextInt();
		}
		// displaying all combinations of the numbers in 'array'.
		for(int i = 0; i < array.length; ++i)
		{
			for(int j = 0; j < array.length; ++j)
			{
				if(j == 0)
					System.out.print("|");
				System.out.printf("%d %d |", array[i], array[j]);
			}
			System.out.println();
		}
		input.close();
	}
}
