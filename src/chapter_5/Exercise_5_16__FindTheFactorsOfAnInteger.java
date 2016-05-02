package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Find the factors of an integer)</h1> Write a program that reads an
 * integer and displays all its smallest factors in increasing order. For
 * example, if the input integer is 120 , the output should be as follows: 2 , 2
 * , 2 , 3 , 5 .
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-1
 *
 */

public class Exercise_5_16__FindTheFactorsOfAnInteger
{
	public static void main(String[] args)
	{
		// user inserts integer to n.
		// for loop
		// int i initializes at 2
		// loop continuation condition i <= n
		// i++
		// if (n % i == 0)
		// for (int j = 2; j <= i; j++)
		// if (j == i)
		// System.out.printf("%d ", i);
		// break;
		// else if (i % j == 0)
		// break;
		Scanner input = new Scanner(System.in);
		System.out.print("Please insert an integer to find it's factors: ");
		int n = input.nextInt();
		System.out.println("The factors are...");
		for (int i = 2; i <= n; i++)
		{
			if (n % i == 0)
			{
				for (int j = 2; j <= i; j++)
				{
					if (j == i)
					{
						System.out.printf("%d ", i);
						break;
					} else if (i % j == 0)
						break;
				}
			}
		}
		input.close();
	}
}
