package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Compute the greatest common divisor)</h1> Another solution for Listing
 * 5.9 to find the greatest common divisor of two integers n1 and n2 is as
 * follows: First find d to be the minimum of n1 and n2 , then check whether d ,
 * d-1 , d-2 , . . . , 2 , or 1 is a divisor for both n1 and n2 in this order.
 * The first such common divisor is the greatest common divisor for n1 and n2 .
 * Write a program that prompts the user to enter two positive integers and
 * displays the gcd.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-1
 */

public class Exercise_5_14__ComputeGreatestCommonDivisor
{
	public static void main(String[] args)
	{
		// input
		int n1;
		int n2;
		int highestCommonDivisor = 1;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter two integers: ");
		n1 = input.nextInt();
		n2 = input.nextInt();

		// processing
		// For loop that decrements from the lowest n1 or n2 and once finds
		// the highestCommonDivisor prints out the solution.
		for (int i = n1; i > 0; i--) // arbitrarily picked n1 to start decrementing from.
		{
			if (n1 % i == 0 && n2 % i == 0)
			{
				highestCommonDivisor = i;
				break;
			}
		}

		// output
		System.out.printf("The highest common divisor is %d", highestCommonDivisor);
		input.close();
	}
}
