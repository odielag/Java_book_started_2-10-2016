package chapter_6;

/**
 * (Estimate p) p can be computed using the following series:
 * 
 * m(i) = (missing information)
 * 
 * Write a method that returns m(i) for a given i and write a test program that
 * dis- plays the following table:
 * 
 * (missing information)
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-18
 *
 */

public class Exercise_6_14__EstimatePi
{
	/** Test method that displays */
	public static void main(String[] args)
	{
		System.out.printf("%-16s%-8s\n------------------------\n", "i", "m(i)");
		for(int i = 1; i <= 901; i += 100)
		{
			System.out.printf("%-16d%-8.4f\n", i, estimatePi(i));
		}
		

	}
	/** A program that calculates PI up to a certain accuracy */
	public static double estimatePi(double count)
	{
		double mSum = 0;
		// create a for loop that increases the accuracy of the part of Pi.
		for (int i = 1; i <= count; i++)
		{
			mSum += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		mSum *= 4;
		return mSum;
	}
}
