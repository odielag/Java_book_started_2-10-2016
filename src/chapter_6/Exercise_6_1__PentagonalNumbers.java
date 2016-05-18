package chapter_6;

/**
 * (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for n
 * = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22,
 * . . . . Write a method with the following header that returns a pentagonal
 * number:
 * 
 * public static int getPentagonalNumber(int n)
 * 
 * Write a test program that uses this method to display the first 100
 * pentagonal numbers with 10 numbers on each line.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-17
 *
 */

public class Exercise_6_1__PentagonalNumbers
{
	public static void main(String[] args)
	{
		// Creating a loop to print out 100 pentagonal numbers in rows of 10.
		for (int i = 1; i <= 100; i++)
		{
				System.out.printf("%-8d", getPentagonalNumber(i));
				if (i % 10 == 0)
					System.out.println();
				
		}
	}
	/** A method to return a pentagonal number */
	public static int getPentagonalNumber(int n)
	{
		return n * (3 * n - 1) / 2;
	}
	
}
