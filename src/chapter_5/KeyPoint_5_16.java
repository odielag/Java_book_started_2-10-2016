package chapter_5;

import java.util.Scanner;

public class KeyPoint_5_16 {

	/*
	Convert the following while
	loop into a for loop.
	 */

	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;
		while (sum < 10000)
		{
			sum += i;
			i++;
		}
		System.out.println("sum: " + sum + " and i: " + i);


		Scanner input = new Scanner(System.in);
		System.out.println("Please input 0 to continue");
		int nothing = input.nextInt();

		i = 0;
		for (sum = 0; sum <10000; i++)
		{
			sum += i;
		}
		System.out.println("sum: " + sum + " and i: " + i);
		
		input.close();
	}
}
// completed