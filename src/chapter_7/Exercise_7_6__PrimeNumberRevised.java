package chapter_7;

/**
 * <h1>(Revise Listing 5.15, PrimeNumber.java)</h1> Listing 5.15 determines
 * whether a number n is prime by checking whether 2 , 3 , 4 , 5 , 6 , . . . ,
 * n/2 is a divisor. If a divisor is found, n is not prime. A more efficient
 * approach is to check whether any of the prime numbers less than or equal to
 * Math.sqrt(n) can divide n evenly. If not, n is prime. Rewrite Listing 5.15 to display
 * the first 50 prime numbers using this approach. You need to use an array to
 * store the prime numbers and later use them to check whether they are possible
 * divisors for n .
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-5
 *
 */

public class Exercise_7_6__PrimeNumberRevised
{
	// main method for initialization
	public static void main(String[] args)
	{
		primeNumberCounting(50);
	}

	public static void primeNumberCounting(int numberOfResults)
	{
		// crate an primeArray that stores every prime number found.
		int[] primeArray =
		{ 2 };
		// take an arbitrary number with initial n = 2 and increment.
		int n = 2;

		// make a looping condition that primeArray.length < numberOfResults.
		while (primeArray.length < numberOfResults)
		{
			// compare that arbitrary number to every prime in the array (int
			// a++).
			for (int a = 0; a < primeArray.length; a++)
			{
				// is not a prime.
				// if n % primeArray[a] == 0 then n is not a prime number.
				// start for loop to check if n is divisible by primeArray[a].
				if (n % primeArray[a] == 0)
				{
					break;
				}
				// is a prime.
				// if n is a prime number if primeArray[a] > Math.sqrt(n)
				else if (primeArray[a] > Math.sqrt(n))
				{
					// then use a tempArray (1 size longer than primeArray
					int[] tempArray = new int[primeArray.length + 1];
					// copy primeARray to tempArray
					System.arraycopy(primeArray, 0, tempArray, 0, primeArray.length);
					// and copy n to tempArray(tempArray.length)
					tempArray[tempArray.length - 1] = n;
					// primeArray = tempArray.
					primeArray = tempArray;
					break;
				}
			}
			n++;
		}
		// print primeArray
		printArrayWidth(primeArray, 10);
	}

	public static void printArrayWidth(int[] array, int width)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (i % width == 0 && i != 0)
				System.out.println();
			System.out.printf("%-10d", array[i]);
		}
	}
}
