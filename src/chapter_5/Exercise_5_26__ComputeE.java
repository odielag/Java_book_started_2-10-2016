package chapter_5;

/**
 * <h1>(Compute e)</h1> You can approximate e using the following series:
 * 
 * e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4! + ... + 1 / i!
 * 
 * Write a program that displays the e value for i = 10000 , 20000 , ..., and
 * 100000 . (Hint: Because i! = i * (i - 1) * ... * 2 * 1, then
 * 
 * 1 / i! is 1 / i * (i - 1)!
 * 
 * @author William ODieLag Pennington
 * @version 1.00
 * @since 2016-5-7
 *
 */

public class Exercise_5_26__ComputeE
{
	public static void main(String[] args)
	{
		double e = 1, item = 1;
		for (int i = 1; i <= 100000; i++)
		{
			item /= i;
			e += item;
			if (i % 10000 == 0)
				System.out.println("e at i = " + i + " is " + e);
		}
		System.out.println("Java's e is " + Math.E);
	}
}
