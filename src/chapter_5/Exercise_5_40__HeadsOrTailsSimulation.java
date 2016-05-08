package chapter_5;

/**
 * <h1>(Simulation: heads or tails)</h1> Write a program that simulates flipping a coin
 * one million times and displays the number of heads and tails.
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-8
 *
 */

public class Exercise_5_40__HeadsOrTailsSimulation
{
	public static void main(String[] args)
	{
		int heads = 0, tails = 0;
		for (int i = 0; i < 1000000; i++)
		{
			if (Math.random() >= 0.5) 
				heads++;
			else
				tails++;
		}
		System.out.printf("After 1,000,000 iterations heads: %d and tails: %d", heads, tails);
	}
}
