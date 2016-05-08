package chapter_5;

/**
 * (Financial application: find the sales amount) You have just started a sales
 * job in a department store. Your pay consists of a base salary and a
 * commission. The base salary is $5,000. The scheme shown below is used to
 * determine the commis- sion rate. 
 * 
 * Sales Amount 
 * $0.01–$5,000 
 * $5,000.01–$10,000
 * $10,000.01 and above
 * Commission Rate 
 * 8 percent 
 * 10 percent 
 * 12 percent
 * 
 * Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the
 * next $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000,
 * the com- mission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
 * you have to generate in order to make $30,000.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-8
 *
 */

public class Exercise_5_39__FindTheSalesAmount
{
	public static void main(String[] args)
	{
		// removing the money made at 8% and 10% to leave how much required at 12%
		double sum = 30000;
		sum -= 1.08 * 5000 + 1.1 * 5000;
		// taking the sum and dividing by 1.12 to find the number required.
		sum /= 1.12;
		// adding the arbitrary 10000 that was required for the initial subtraction.
		sum += 10000;
		// showing the final answer:
		System.out.printf("The initial sum required to get $30,000 is $%.2f\n", sum);
		
		// testing answer below
		sum -= 10000;
		sum *= 1.12;
		sum += 5000 * 1.08 + 5000 * 1.10;
		System.out.printf("For the above to be correct this sum should equal $30,000: $%.2f\n", 
				sum);
	}
}
