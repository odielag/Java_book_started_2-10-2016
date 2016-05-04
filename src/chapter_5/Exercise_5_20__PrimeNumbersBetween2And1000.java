package chapter_5;

/**
 * <h1>(Display prime numbers between 2 and 1,000)</h1> Modify Listing 5.15 to
 * display all the prime numbers between 2 and 1,000, inclusive. Display eight
 * prime numbers per line. Numbers are separated by exactly one space.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.1
 * @since 2016-5-4
 *
 */

public class Exercise_5_20__PrimeNumbersBetween2And1000
{
	/*
Display the first 50 prime numbers, 10 columns 5 rows.
	 */

	public static void main(String[] args)
	{
		// input
		int numberOfPrimesFound = 0;
		int tempHigh = 2;

		// processing

		// i is the incrementing test number to check if tempHigh is divisible by something
		while (tempHigh <= 1000)
		{
			for (int i = 2; i <= tempHigh; i++)		
			{
				// If i gets to equal tempHigh then tempHigh is a prime number.
				if (i == tempHigh)
				{
					System.out.printf("%d ", tempHigh);
					tempHigh++;
					numberOfPrimesFound++;
					if (numberOfPrimesFound % 8 == 0)
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
