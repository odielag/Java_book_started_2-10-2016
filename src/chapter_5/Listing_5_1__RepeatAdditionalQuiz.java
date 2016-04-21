package chapter_5;

import java.util.Scanner;

public class Listing_5_1__RepeatAdditionalQuiz {

	/*
Recall that Listing 3.1, AdditionQuiz.java, gives a program that prompts the user to enter
an answer for a question on addition of two single digits. Using a loop, you can now rewrite
the program to let the user repeatedly enter a new answer until it is correct, as shown in
Listing 5.1

What is 5 + 9? 12
Wrong answer. Try again. What is 5 + 9? 34
Wrong answer. Try again. What is 5 + 9? 14
You got it!
	 */

	public static void main(String[] args) {

		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		Scanner input = new Scanner(System.in);

		// Gave 'number' max value so that the while loop starts out false;
		int number = Integer.MAX_VALUE;
		while (number1 + number2 != number) {
			System.out.print(
					"What is " + number1 + " + " + number2 + "? ");
			number = input.nextInt();
			if (number1 + number2 != number)
				System.out.print("Wrong answer. Try again. ");
		}
		
		System.out.printf("You got it!");
		
		input.close();
	}

}

// Completed by William ODieLag Pennington on 4/21/2016;