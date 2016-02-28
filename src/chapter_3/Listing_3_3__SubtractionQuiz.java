package chapter_3;

import java.util.Scanner;

public class Listing_3_3__SubtractionQuiz {
	
	/*
The program can work as follows:

1. Generate two single-digit integers into number1 and number2 .
2. If number1 < number2 , swap number1 with number2 .
3. Prompt the student to answer, "What is number1 – number2?"
4. Check the student’s answer and display whether the answer is correct.

	 */

	public static void main(String[] args) {
		
		//1. Generate two single-digit integers into number1 and number2 .
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		

		//2. If number1 < number2 , swap number1 with number2 .
		if (number1 < number2){
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		//3. Prompt the student to answer, "What is number1 – number2?"
		System.out.printf("What is %d - %d?\n", number1, number2);
		Scanner input = new Scanner(System.in);
		int userAnswer = input.nextInt();
		input.close();
		
		//4. Check the student’s answer and display whether the answer is correct.
		boolean correct = ((number1 - number2) == userAnswer);
		String correctString;
		if (correct){
			correctString = "correct";
		}
		else
			correctString = "incorrect";
		
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
		System.out.println("Your answer is " + correctString);
		
	}

}
