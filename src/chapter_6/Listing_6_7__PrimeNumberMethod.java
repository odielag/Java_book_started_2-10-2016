package chapter_6;

import java.util.Scanner;

/**
 * Listing 6.7 applies the concept of code modularization to improve Listing
 * 5.15, PrimeNumber.java.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-13
 *
 */

public class Listing_6_7__PrimeNumberMethod
{

	/**
	 * 
	 * <h1>Display the first 50 prime numbers, 10 columns 5 rows.</h1>
	 * 
	 * @author William ODieLag Pennington
	 * @version 1.1
	 * @Since 2016-5-4
	 */

	public static void main(String[] args)
	{
		// input
		Scanner input = new Scanner(System.in);

		System.out.printf("Number of lines? ");
		printPrimeNumbers(input.nextInt());
		input.close();
		// processing
		// i is the incrementing test number to check if tempHigh is divisible
		// by something
	}

	public static void printPrimeNumbers(int lines)
	{
		lines *= 10;
		int tempHigh = 2;
		int numberOfPrimesFound = 0;
		while (numberOfPrimesFound < lines)
		{
			for (int i = 2; i <= tempHigh; i++)
			{
				// If i gets to equal tempHigh then tempHigh is a prime number.
				if (i == tempHigh)
				{
					System.out.printf("%-8d", tempHigh);
					tempHigh++;
					numberOfPrimesFound++;
					if (numberOfPrimesFound % 10 == 0)
						System.out.println();
					break;
				}
				// If tempHigh is divisible by something it exits the loop.
				if (tempHigh % i == 0)
				{
					tempHigh++;
					break;
				}
			}
		}
	}

	public static boolean isPrime(int number)
	{
		boolean isPrime = false;
		for (int i = 2; i <= number; i++)
		{
			if (i == number)
				isPrime = true;
			else if (number % i == 0)
				break;
		}
		return isPrime;
	}
}
