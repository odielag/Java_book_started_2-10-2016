package generalMethods;

import chapter_6.Listing_6_7__PrimeNumberMethod;

/**
 * Work in progress
 * 
 * @author username
 *
 */

public class SequentialPrimes
{
	public static void main(String[] args)
	{
		sequentialPrimes();
		// System.out.println(Listing_6_7__PrimeNumberMethod.isPrime(4));
	}

	public static void sequentialPrimes()
	{
		// start i at 2
		// see if it's a prime
			// if it is a prime
				// if(!lastWasPrime) primesInARow = 1;
					// else primesInARow += 1;
				// lastWasPrime = true
			// if not a prime
				// if ultimateHighestPrime < primesInARow... copy i + 1 - PrimesInARow to HighestPrime
				// if ultimateHighestPrime < how many primes in a row ... then copy primesInARow to ultimateHighestPrime
				// lastWasPrime = false;
				
		int i = 2;
		int highestPrimeNumber = 2;
		int highestPrimeCount = 0;
		boolean lastWasPrime = false;
		int primesInARow = 0;
		
		while (true)
		{
			if(Listing_6_7__PrimeNumberMethod.isPrime(i))
			{
				if(!lastWasPrime)
					primesInARow = 1;
				else
				{
					++primesInARow;
					lastWasPrime = true;
				}
			}
			else
			{
				if (highestPrimeCount < primesInARow)
				{
					highestPrimeNumber = i + 1 - primesInARow;
					highestPrimeCount = primesInARow;
				}
				lastWasPrime = false;
			}

			System.out.printf("Highest prime number: %d and it is part of %d sequential numbers\n", highestPrimeNumber, highestPrimeCount);
			i++;
		}
	}
}
