package chapter_3;

import java.util.Scanner;

public class Exercise_3_10__AdditionQuiz {
	
	/*
(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
subtraction question. Revise the program to randomly generate an addition ques-
tion with two integers less than 100.
	 */

	public static void main(String[] args) {
		
		// input
		
		int number1, number2, userAnswer, temp;
		boolean correct;
		String stringCorrect;
		
		//1. Generate two double-digit integers into number1 and number2 .
		number1 = (int)(Math.random() * 100);
		number2 = (int)(Math.random() * 100);
		if (number1 < number2){
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		//3. Prompt the student to answer, "What is number1 + number2?"
		System.out.printf("What is %d + %d?\n", number1, number2);
		Scanner input = new Scanner(System.in);
		userAnswer = input.nextInt();
		input.close();
		
		// processing
		//4. Check the student’s answer
		correct = (number1 + number2 == userAnswer);
				
		// output
		//...display whether the answer is correct.
		if (correct) stringCorrect = "Correct";
		else stringCorrect = "Incorrect";
		System.out.printf("%d + %d = %d is %s", number1, number2, userAnswer, stringCorrect);
		
	}
	
}
