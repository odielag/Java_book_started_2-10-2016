package chapter_5;



/**
 * <h1>(Financial application: compute future tuition)</h1>
 * Suppose that the tuition for a university is $10,000 this year and increases 5% 
 * every year. In one year, the tuition will be $10,500. Write a program that 
 * computes the tuition in ten years and the total cost of four years’ worth of 
 * tuition after the tenth year.
 * 
 * @author username
 * @version 1.0
 * @since 2016-5-1
 */

public class Exercise_5_7__ComputeFutureTuition 
{
	public static void main(String[] args)
	{
		// input
		int year = 1;
		double apr = 1.00;
		double tuition = 0;
		
		/*		// Trying a different way
		// processing
			// Loop. year = 1 (first year). double apr is increased by 5% every loop.
			// until i > 10 continue past double tuition processsing.
			// 10 years will be year 11.
		while (year < 15)		// keeping the years at 14 or under.
		{
			if (year <= 10)
			{
				year++;
				apr = apr * 1.05;
				continue;
			}
			tuition += (10000 * apr);
			year++;
			apr = apr * 1.05;
		}
		*/		// The total tuition is: $70207.39453239123
		
		for (int i = 0; i < 10; i++)
		{
			apr = apr * 1.05;
		}
		for (int i = 0; i < 4; i++)
		{
			tuition += 10000 * apr;
			apr = apr * 1.05;
		}
				// The total tuition is: $70207.39453239123
		
		
		// output
		System.out.printf("The total tuition is: $%.2f", tuition);
	}
}
