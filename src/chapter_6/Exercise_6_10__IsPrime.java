package chapter_6;

/**
 * <h1>(Use the isPrime Method)</h1> Listing 6.7, PrimeNumberMethod.java,
 * provides the isPrime(int number) method for testing whether a number is
 * prime. Use this method to find the number of prime numbers less than 10000 .
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-18
 *
 */

public class Exercise_6_10__IsPrime
{
	public static void main(String[] args)
	{
		//System.out.println(Listing_6_7__PrimeNumberMethod.isPrime(4));
		
		int primeCount = 0;
		for(int i = 2; i < 10000; i++)
		{
			if(Listing_6_7__PrimeNumberMethod.isPrime(i) == true)
				++primeCount;
		}
		System.out.print("The number of prime numbers less than 10000 is: " + primeCount);
	}
}
