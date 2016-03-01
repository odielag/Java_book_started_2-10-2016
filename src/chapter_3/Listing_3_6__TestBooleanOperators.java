package chapter_3;

import java.util.Scanner;

public class Listing_3_6__TestBooleanOperators {

	public static void main(String[] args) {
		
		// input
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		// processing and output
		if (number % 2 == 0 && number % 3 == 0)
			System.out.printf("%d is divisible by 2 and 3.\n", number);
		
		if (number %2 == 0 || number % 3 == 0)
			System.out.printf("%d is divisible by 2 or 3.\n", number);
		
		if (number %2 == 0 ^ number % 3 == 0)
			System.out.printf("%d is divisible by 2 or 3, but not both.", number);
				
	}

}

// Finished by William ODieLag Pennington on March 1st, 2016