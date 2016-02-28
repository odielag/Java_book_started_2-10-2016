package chapter_3;

import java.util.Scanner;

public class Listing_3_3__retry {
	
	/*
The program can work as follows:
1. Generate two single-digit integers into number1 and number2 .
2. If number1 < number2 , swap number1 with number2 .
3. Prompt the student to answer, "What is number1 – number2?"
4. Check the student’s answer and display whether the answer is correct.
	 */

	public static void main(String[] args) {
		
		// input
		
		int number1, number2, userAnswer, temp;
		boolean correct;
		String stringCorrect;
		
		//1. Generate two single-digit integers into number1 and number2 .
		number1 = (int)(Math.random() * 10);
		number2 = (int)(Math.random() * 10);
		if (number1 < number2){
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		//3. Prompt the student to answer, "What is number1 – number2?"
		System.out.printf("What is %d - %d?\n", number1, number2);
		Scanner input = new Scanner(System.in);
		userAnswer = input.nextInt();
		input.close();
		
		// processing
		//4. Check the student’s answer
		correct = (number1 - number2 == userAnswer);
				
		// output
		//...display whether the answer is correct.
		if (correct) stringCorrect = "Correct";
		else stringCorrect = "Incorrect";
		System.out.printf("%d - %d = %d is %s", number1, number2, userAnswer, stringCorrect);
		
	}

}

// Finished by William ODieLag Pennington on Feb 28, 2016