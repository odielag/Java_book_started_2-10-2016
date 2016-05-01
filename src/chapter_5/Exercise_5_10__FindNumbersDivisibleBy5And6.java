package chapter_5;

/**
 * 
 * <h1>(Find numbers divisible by 5 and 6)</h1> Write a program that displays
 * all the numbers from 100 to 1,000, ten per line, that are divisible by 5 and
 * 6. Numbers are separated by exactly one space.
 * 
 * @author username
 *
 */

public class Exercise_5_10__FindNumbersDivisibleBy5And6
{
	public static void main(String[] args)
	{
		int solutions = 0;
		
		// loop. if number % 5 == 0 && number % 6 == 0 print with space
		for(int number = 5; number <= 1000; number++)
		{
			if (number % 5 == 0 && number % 6 == 0)
			{
				System.out.printf("%d ", number);
				++solutions;
				if (solutions % 10 == 0)
					System.out.println();
			}
		}
	}
}
