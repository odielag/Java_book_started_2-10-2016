package chapter_4;

import java.util.Scanner;

public class Exercise_4_21__CheckSSN {
	
	/*
(Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid. Here are sample runs:

Enter a SSN: 232-23-5435
232-23-5435 is a valid social security number

Enter a SSN: 23-23-5435
23-23-5435 is an invalid social security number
	 */

	public static void main(String[] args) {
		
		// input
		Scanner input = new Scanner(System.in);
		String string;		
		String output;
		
		System.out.print("Enter a SSN: ");
		string = input.next();
		input.close();
		
		// processing
		if ((string.length() == 11) &&
		Character.isDigit(string.charAt(0)) &&
		Character.isDigit(string.charAt(1)) &&
		Character.isDigit(string.charAt(2)) &&
		(string.charAt(3) == '-') &&
		Character.isDigit(string.charAt(4)) &&
		Character.isDigit(string.charAt(5)) &&
		(string.charAt(6) == '-') &&
		Character.isDigit(string.charAt(7)) &&
		Character.isDigit(string.charAt(8)) &&
		Character.isDigit(string.charAt(9)) &&
		Character.isDigit(string.charAt(10)))
			output = string + " is a valid social security number";			
		else 
			output = string + " is an invalid social security number";
		
		
		// output
		System.out.print(output);
		Character.isDigit(string.charAt(0));
	}
	
}

// Completed by William ODieLag Pennington on 4/14/2016;