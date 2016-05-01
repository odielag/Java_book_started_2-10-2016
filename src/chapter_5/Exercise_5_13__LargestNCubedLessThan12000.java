package chapter_5;

/**
 * <h1>(Find the largest n such that n 3 6 12,000)</h1> Use a while loop to find the
 * largest integer n such that n 3 is less than 12,000.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-1
 */

public class Exercise_5_13__LargestNCubedLessThan12000
{
	public static void main(String[] args)
	{
		// Going to make a while loop so that it starts with int n =
		// (int)Math.pow(12000, 1 / 3) + 1
		// and decrements until Math.pow(n, 3) < 12000
		int n = (int) Math.pow(12000, 1.00000000 / 3.00000000 ) + 1;
		while (Math.pow(n, 3) > 12000)
		{
			if (Math.pow(n, 3) < 12000) break;
			n--;
		}
		System.out.printf("The highest value of integer n that makes n^3 < 12000 is %d", n);
	}
}
