package chapter_6;

/**
 * (Palindromic prime) A palindromic prime is a prime number and also palindro-
 * mic. For example, 131 is a prime and also a palindromic prime, as are 313 and
 * 757. Write a program that displays the first 100 palindromic prime numbers.
 * Dis- play 10 numbers per line, separated by exactly one space, as follows:
 * 
 * 2 3 5 7 11 101 131 151 181 191
 * 
 * 313 353 373 383 727 757 787 797 919 929
 * 
 * ...
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-23
 *
 */

public class Exercise_6_26__PalindromicPrime
{
	// isPrime(int)
	public static void main(String[] args)
	{
		int palindromicPrimeCount = 0;
		for(int i = 2; palindromicPrimeCount < 100; i++)
		{
			if(PalindromicPrime(i))
			{
				System.out.print(i + " ");
				++palindromicPrimeCount;
				if(palindromicPrimeCount % 10 == 0)
					System.out.println();
			}
			
		}
	}
	public static boolean PalindromicPrime(int n)
	{
		String backwards = "";
		int temp = n;
		while (temp != 0)
		{
			backwards = backwards + Integer.toString(temp % 10);
			temp /= 10;
			// debug System.out.printf("backwards: %s  temp: %d\n", backwards, temp);
		}
		if (Integer.parseInt(backwards) == n && Listing_6_7__PrimeNumberMethod.isPrime(n))
			return true;
		else
			return false;
	}
}
