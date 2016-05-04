package chapter_5;

public class Listing_5_15__PrimeNumber
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
		int numberOfPrimesFound = 0;
		int tempHigh = 2;

		// processing

		// i is the incrementing test number to check if tempHigh is divisible
		// by something
		while (numberOfPrimesFound < 50)
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
}

// Completed by William ODieLag Pennington on 4/27/2016;