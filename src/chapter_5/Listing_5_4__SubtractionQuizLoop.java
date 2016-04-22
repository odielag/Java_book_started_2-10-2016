package chapter_5;

import java.util.Scanner;

public class Listing_5_4__SubtractionQuizLoop {

	/*
The Math subtraction learning tool program in Listing 3.3, SubtractionQuiz.java, generates just
one question for each run. You can use a loop to generate questions repeatedly. How do you
write the code to generate five questions? Follow the loop design strategy. First identify the
statements that need to be repeated. These are the statements for obtaining two random numbers,
prompting the user with a subtraction question, and grading the question. Second, wrap the state-
ments in a loop. Third, add a loop control variable and the loop-continuation-condition
to execute the loop five times.

Listing 5.4 gives a program that generates five questions and, after a student answers all
five, reports the number of correct answers. The program also displays the time spent on the
test and lists all the questions

What is 9 – 2? 7
You are correct!

What is 3 – 0? 3
You are correct!

What is 3 – 2? 1
You are correct!

What is 7 – 4? 4
Your answer is wrong.
7 – 4 should be 3

What is 7 – 5? 4
Your answer is wrong.
7 – 5 should be 2

Correct count is 3
Test time is 1021 seconds

9–2=7 correct
3–0=3 correct
3–2=1 correct
7–4=4 wrong
7–5=4 wrong
	 */


	/*
The program can work as follows:
1. Generate two single-digit integers into number1 and number2 .
2. If number1 < number2 , swap number1 with number2 .
3. Prompt the student to answer, "What is number1 – number2?"
4. Check the student’s answer and display whether the answer is correct.
	 */

	public static void main(String[] args) {

		// input
		int[] number1 = new int[5];
		int[] number2 = new int[5];
		int[] userAnswer = new int[5];
		int[] temp = new int[5];
		int correctCount = 0;
		long startTimeMS;
		long endTimeMS;
		boolean[] correct = new boolean[5];
		Scanner input = new Scanner(System.in);
		String[] stringCorrect = new String[5];


		startTimeMS = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			//1. Generate two single-digit integers into number1 and number2 .
			number1[i] = (int)(Math.random() * 10);
			number2[i] = (int)(Math.random() * 10);
			if (number1[i] < number2[i]) {
				temp[i] = number1[i];
				number1[i] = number2[i];
				number2[i] = temp[i];
			}

			//3. Prompt the student to answer, "What is number1 – number2?"
			System.out.printf("What is %d - %d? ", number1[i], number2[i]);
			userAnswer[i] = input.nextInt();

			// processing
			//4. Check the student’s answer
			correct[i] = (number1[i] - number2[i] == userAnswer[i]);

			// Assign stringCorrect[i] a string of correct or incorrect based on correct[i]
			stringCorrect[i] = (correct[i]) ? "correct":"incorrect";
			
			// output
			if (correct[i] == true) correctCount++;
			
			//...display whether the answer is correct.
			System.out.printf("%d-%d=%d is %s\n\n", 
					number1[i], number2[i], userAnswer[i], stringCorrect[i]);

		}

		System.out.println("Correct count is " + correctCount);
		endTimeMS = System.currentTimeMillis();
		System.out.printf("Test time is %d seconds\n\n",
				(int)((endTimeMS - startTimeMS) / 1000));

		for (int i = 0; i < number1.length; i++)
			System.out.printf("%d-%d=%d %s\n", 
					number1[i], number2[i], number1[i] - number2[i], stringCorrect[i]);
		input.close();
	}
}
// Completed on 4/21/2016 by William ODieLag Pennington;