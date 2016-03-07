package chapter_3;

import java.util.Scanner;

public class Exercise_3_2__ {
	
	/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, gen-
erates two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
	 */
	
	/* 3.1 code...
	public static void main(String[] args) {
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + number1 + " + " + number2 + "? ");

		int number = input.nextInt();
		
		System.out.println(
				number1 + " + " + number2 + " = " + number + " is " +
		(number1 + number2 == number));
		
	}
	 */

	public static void main(String[] args) {
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 5 % 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + number1 + " + " + number2 + " + " + number3 + " ? ");

		int number = input.nextInt();
		
		input.close();
		
		System.out.println(
				number1 + " + " + number2 + " + " + number3 + " = " + number + " is " +
		(number1 + number2 + number3 == number));
		
	}

}

// Finished by William ODieLag Pennington on 3/6/2016; 