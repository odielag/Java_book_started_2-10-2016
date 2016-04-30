package chapter_5;

import java.util.Arrays;
import java.util.Scanner;

/**
<h1>(Count positive and negative numbers and compute the average of numbers)</h1>
 Write a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0 . Display
the average as a floating-point number. Here is a sample run:
<p>
<i>Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25
</i>
<p>
<i>Enter an integer, the input ends if it is 0: 0
No numbers are entered except 0
</i>

@author William ODieLag Pennington
@version 1.0
@since 2016-4-30
 */

public class Exercise_5_1__AverageOfIntegers
{

	public static void main(String[] args)
	{

		// input
		Scanner input = new Scanner(System.in);
		int totalPositive = 0;
		int totalNegative = 0;
		int sum = 0;
		int[] integerArray = new int[0];
		int currentInteger;

		System.out.print("Enter an integer, the input ends if it is 0: ");

		// processing

		// main loop that includes: input, ++totalPositive, ++totalNegative, totalSum,
		// totalAverage, ifFirstIsZero, integerArray, (copy array to larger array and
		// instatiate the last array slot.
		int i = 0;
		do
		{
			currentInteger = input.nextInt();
			if (currentInteger == 0)
			{
				if (totalPositive + totalNegative == 0)
				{
					System.out.println("No numbers are entered except 0");
					System.exit(0);
				}
				else break;
			}
			else
			{
				integerArray = Arrays.copyOf(integerArray, i + 1);
				integerArray[i] = currentInteger;
				sum += currentInteger;
				if (currentInteger > 0) ++totalPositive;
				if (currentInteger < 0) ++totalNegative;
				i++;
			}
		} while (currentInteger != 0);
		input.close();

		// output
		/*
		The number of positives is 3
		The number of negatives is 1
		The total is 5.0
		The average is 1.25
		 */
		System.out.printf("The number of positives is %d\n", totalPositive);
		System.out.printf("The number of negatives is %d\n", totalNegative);
		System.out.printf("The total is %d\n", sum);
		System.out.printf("The average is %f\n", 
				(double)sum / (double)(totalPositive + totalNegative));
		
	}
}
