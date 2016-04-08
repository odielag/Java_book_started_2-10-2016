package chapter_4;

import java.util.Scanner;

public class Exercise_4_11__DecimalToHex {
	
	/*
(Decimal to hex) Write a program that prompts the user to enter an integer between
0 and 15 and displays its corresponding hex number. Here are some sample runs:

Enter a decimal value (0 to 15): 11
The hex value is B

Enter a decimal value (0 to 15): 5
The hex value is 5

Enter a decimal value (0 to 15): 31
31 is an invalid input
	 */

	public static void main(String[] args) {
		
		// input
		Scanner input = new Scanner(System.in);
		int value;
		String output;
		
		System.out.print("Enter a decimal value (0 to 15): ");
		value = input.nextInt();
		input.close();
		
		// processing
		if (value >= 0 && 9 >= value)
			output = String.format("The hex value is " + value);
		else if (value >= 10 && 15 >= value)
			output = String.format("The hex value is " + (char)(value + 55));
		else
			output = String.format(value + " is an invalid input");
				
		// output
		System.out.print(output);
		
	}
	
}

// Completed on 4/8/2016 by William ODieLag Pennington;