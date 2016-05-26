package chapter_6;

/**
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be
 * written in the form 2 p - 1 for some positive integer p. Write a program that
 * finds all Mersenne primes with p <= 31 and displays the output as follows:
 * 
 * p 	2^p –1 
 * 2 	3 
 * 3 	7 
 * 5 	31 
 * ...
 * 
 * Listing_6_7__PrimeNumberMethod.isPrime(n) 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-25
 *
 */

public class Exercise_6_28__MersennePrime
{
	/** main method for testing and output */
	public static void main(String[] args)
	{
		mersennePrimeCheck(31);
	}
	/** Mersenne Prime creating and printing method */
	public static void mersennePrimeCheck(int n)
	{
		System.out.printf("%s%d\t\t%s\n", "p <= ", n, "2^p-1");
		System.out.println("------------------------");
		for(int i = 2; i <= n; i++)
		{
			if(Listing_6_7__PrimeNumberMethod.isPrime((int)Math.pow(2, i) - 1))
				System.out.printf("%d\t\t%.0f\n", i, Math.pow(2, i) - 1);
		}
	}
}
