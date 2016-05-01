package chapter_5;

/**
 * <h1>(Find numbers divisible by 5 or 6, but not both)</h1> Write a program that
 * displays all the numbers from 100 to 200, ten per line, that are divisible by
 * 5 or 6, but not both. Numbers are separated by exactly one space.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-1
 *
 */

public class Exercise_5_11__NumbersDivisibleBy5Or6NotBoth
{
	public static void main(String[] args)
	{
		int solutions = 0;
		
		// loop. if number % 5 == 0 && number % 6 == 0 print with space
		for(int number = 100; number <= 200; number++)
		{
			if (number % 5 == 0 || number % 6 == 0)
			{
				System.out.printf("%d ", number);
				++solutions;
				if (solutions % 10 == 0)
					System.out.println();
			}
		}
	}
}
