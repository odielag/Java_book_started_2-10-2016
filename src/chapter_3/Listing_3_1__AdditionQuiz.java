package chapter_3;

import java.util.Scanner;

public class Listing_3_1__AdditionQuiz {

	public static void main(String[] args) {
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + number1 + " + " + number2 + "? ");

		int number = input.nextInt();
		input.close();
		
		System.out.println(
				number1 + " + " + number2 + " = " + number + " is " +
		(number1 + number2 == number));
		
	}

}

/*
3.1		List six relational operators.
		> >= < <= == !=

3.2		Assuming that x is 1, show the result of the following Boolean expressions:

		(x > 0) = True
		(x < 0) = False
		(x != 0) = True
		(x >= 0) = True
		(x != 1) = False
		
3.3		Can the following conversions involving casting be allowed? Write a test program to
		verify your answer.
		
		
		boolean b = true;
		i = (int)b;
		
		int i = 1;
		boolean b = (boolean)i;
		
		
 */

// Finished by William ODieLag Pennington