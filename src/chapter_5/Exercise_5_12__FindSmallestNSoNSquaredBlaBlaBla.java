package chapter_5;

/**
 * <h1>(Find the smallest n such that n^2 > 12,000)</h1> Use a while loop to
 * find the smallest integer n such that n 2 is greater than 12,000.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-1
 *
 */

public class Exercise_5_12__FindSmallestNSoNSquaredBlaBlaBla
{
	public static void main(String[] args)
	{
		// Going to make a while loop so that it starts with int n =
		// (int)Math.pow(12000, 0.5)
		// and increments until Math.pow(n, 2) > 12000
		int n = (int) Math.pow(12000, 0.5);
		while (Math.pow(n, 2) < 12000)
		{
			n++;
		}
		System.out.printf("The lowest value of integer n that makes n^2 > 12000 is %d", n);
	}
}
