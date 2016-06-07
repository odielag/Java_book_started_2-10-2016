package chapter_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>(Computing gcd)</h1> Write a method that returns the gcd of an
 * unspecified number of integers. The method header is specified as follows:
 * 
 * public static int gcd(int... numbers)
 * 
 * Write a test program that prompts the user to enter five numbers, invokes the
 * method to find the gcd of these numbers, and displays the gcd.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-6
 *
 */

public class Exercise_7_14__GreatestCommonDenominator
{
	// main method to ask for positive integers and stops with a negative integer.
	// main method sends array of integers to the gcd method.
	public static void main(String[] args)
	{
		int[] array = new int[0];
		Scanner input = new Scanner(System.in);
		// while loop to make the array
		int tempNumber;
		System.out.print("Please input integers and stop by entering a negative number:\n");
		do
		{
			tempNumber = input.nextInt();
			if(tempNumber > 0)
			{
				int[] tempArray = new int[array.length + 1];
				System.arraycopy(array, 0, tempArray, 0, array.length);
				tempArray[tempArray.length - 1] = tempNumber;
				array = tempArray;
			}
		} while(tempNumber > 0);
		System.out.printf("The greatest common denominator is: %d", gcd(array));
		input.close();
	}
	public static int gcd(int... numbers)
	{	
		int gcd = 1;
		Arrays.sort(numbers);
		for(int i = 1; i <= numbers[0]; i++)
		{
			int accumulation = 0;
			for(int j = 0; j < numbers.length; j++)
			{
				if(numbers[j] % i == 0)
					++accumulation;
			}
			if(accumulation == numbers.length)
				gcd = i;
		}
		return gcd;
	}
}
