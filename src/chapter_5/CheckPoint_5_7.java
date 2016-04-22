package chapter_5;

import java.util.Scanner;

public class CheckPoint_5_7 {
	
	/*
	Turn the while look into a do-while loop.
	 */

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter an integer " +
				"(the input ends if it is 0)");
		int number = input.nextInt();
		do
		{
			sum += number;
			System.out.println("Enter an integer " +
					"(the input ends if it is 0)");
			number = input.nextInt();
		} while (number != 0);
		System.out.println("The sum is: " + sum);
		input.close();
	}
}
