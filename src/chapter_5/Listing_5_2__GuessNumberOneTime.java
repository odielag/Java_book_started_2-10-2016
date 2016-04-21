package chapter_5;

import java.util.Scanner;

public class Listing_5_2__GuessNumberOneTime {

	/*
The problem is to guess what number a computer has in mind. You will write a program that
randomly generates an integer between 0 and 100 , inclusive. The program prompts the user
to enter a number continuously until the number matches the randomly generated number. For
each user input, the program tells the user whether the input is too low or too high, so the user
can make the next guess intelligently. Here is a sample run:

Guess a magic number between 0 and 100
Enter your guess: 50
Your guess is too high
Enter your guess: 25
Your guess is too low
Enter your guess: 42
Your guess is too high
Enter your guess: 39
Yes, the number is 39
	 */

	public static void main(String[] args) {

		int number;
		int guess;
		Scanner input = new Scanner(System.in);

		number = (int)(Math.random() * 101);
		System.out.println("Guess a magic number between 0 and 100");

		guess = -1;
		while (guess != number) {
			System.out.print("Enter your guess: ");
			guess = input.nextInt();
			if (guess > number) System.out.println("Your guess is too high");
			if (guess < number) System.out.println("Your guess is too low");
			if (guess == number) System.out.println("Yes, the number is " + number);
		}
		input.close();
	}

}

// Completed on 4/21/2016;