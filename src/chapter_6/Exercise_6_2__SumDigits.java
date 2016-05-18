package chapter_6;

import java.util.Scanner;

/**
 * (Sum the digits in an integer) Write a method that computes the sum of the
 * digits in an integer. Use the following method header:
 * 
 * public static int sumDigits(long n)
 * 
 * For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % opera-
 * tor to extract digits, and the / operator to remove the extracted digit. For
 * instance, to extract 4 from 234, use 234 % 10 ( = 4). To remove 4 from 234,
 * use 234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit
 * until all the digits are extracted. Write a test program that prompts the
 * user to enter an integer and displays the sum of all its digits.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-18
 *
 */

public class Exercise_6_2__SumDigits
{
	/** Main method to test the sumDigits function */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string of digits with spaces to be summed up: ");
		long digits = input.nextLong();
		System.out.printf("%d summed up equals: %d", digits, sumDigits(digits));
		input.close();
	}
	/** Method to take every digit and add them together */
	public static int sumDigits(long n)
	{
		long charSum = 0;
		if(n != 0)
		{
			while(n != 0)
			{
				charSum += n % 10;
				n /= 10;
			}
		}
		return (int)charSum;
	}
}
