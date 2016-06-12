package chapter_7;

import java.util.Scanner;

/**
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the
 * same value.
 * 
 * public static boolean isConsecutiveFour(int[] values)
 * 
 * Write a test program that prompts the user to enter a series of integers and
 * dis- plays if the series contains four consecutive numbers with the same
 * value. Your program should first prompt the user to enter the input
 * size—i.e., the number of values in the series. Here are sample runs:
 * 
 * 
 * Enter the number of values: 8
 * 
 * Enter the values: 3 4 5 5 5 5 4 5
 * 
 * The list has consecutive fours
 * 
 * 
 * 
 * Enter the number of values: 9
 * 
 * Enter the values: 3 4 5 5 6 5 5 4 5
 * 
 * The list has no consecutive fours
 * 
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-12
 *
 */

public class Exercise_7_30__ConsecutiveFourEqualNumbers
{
	// ask user for array size, create array and ask user for values...
	// check if there are 4 exact ints in a row and return result.
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int[] array = new int[input.nextInt()];
		System.out.print("Enter the values: ");
		for(int i = 0; i < array.length; ++i)
		{
			array[i] = input.nextInt();
		}
		System.out.printf("The list has %sconsecutive fours", 
				hasConsecutiveFour(array)?"":"no ");
		input.close();
	}
	public static boolean hasConsecutiveFour(int[] values)
	{
		int consecutiveFour = 0;
		boolean reset = true;
		int integer = values[0];
		for(int i = 0; i < values.length; ++i)
		{
			// reset
			if(reset)
			{
				consecutiveFour = 1;
				reset = false;
				integer = values[i];
			}
			// not reset
			else
			{
				// consecutive
				if(integer == values[i])
				{
					++consecutiveFour;
					// four in a row
					if(consecutiveFour == 4)
						return true;
				}
				// non-consecutive
				else
				{
					consecutiveFour = 0;
					reset = true;
				}
			}
		}
		return false;
	}
}
