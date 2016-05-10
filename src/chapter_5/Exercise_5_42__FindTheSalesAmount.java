package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Financial application: find the sales amount)</h1> Rewrite Programming Exercise
 * 5.39 as follows: ■ Use a for loop instead of a do-while loop. ■ Let the user
 * enter COMMISSION_SOUGHT instead of fixing it as a constant.
 * 
 * @author William ODieLag Pennington
 * @version 0.0
 * @since 2016-5-8
 *
 */

public class Exercise_5_42__FindTheSalesAmount
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please input your desired commission: ");
		final double COMMISSION_SOUGHT = input.nextDouble();
		double sum = COMMISSION_SOUGHT;
		// removing the money made at 8% and 10% to leave how much required at 12%
		sum -= 1.08 * 5000 + 1.1 * 5000;
		// taking the sum and dividing by 1.12 to find the number required.
		sum /= 1.12;
		// adding the arbitrary 10000 that was required for the initial subtraction.
		sum += 10000;
		// showing the final answer:
		System.out.printf("The initial sum required to get $%.2f is $%.2f\n",
				COMMISSION_SOUGHT, sum);
		
		// testing answer below
		sum -= 10000;
		sum *= 1.12;
		sum += 5000 * 1.08 + 5000 * 1.10;
		System.out.printf("%s",
				COMMISSION_SOUGHT == sum ? "The formula is correct" : "The formula is incorrect");
		input.close();
	}
}
