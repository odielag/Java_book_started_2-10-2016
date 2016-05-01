package chapter_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * <h1>(Find the two highest scores)</h1> Write a program that prompts the user
 * to enter the number of students and each student’s name and score, and
 * finally displays the student with the highest score and the student with the
 * second-highest score.
 * 
 * @author William ODieLag Pennington
 * @version 1.00
 * @since 2016-5-1
 *
 */

public class Exercise_5_9__FindTheTwoHighestScores {
	public static void main(String[] args) {
		// input
		String[] names;
		double[] scores;
		Scanner input = new Scanner(System.in);
		int students;
		double highScore;
		double secondHighestScore;
		int[] scoreIndexes = new int[1];
		int[] secondHighestScoreIndexes = new int[1];

		System.out.print("How many students are there?: ");
		students = input.nextInt();
		if (students < 2) {
			System.out.print("\n You must enter at least 2 students. Exiting program.");
			System.exit(-1);
		}
		input.nextLine();
		names = new String[students];
		scores = new double[students];

		// processing
		// Filling in arrays with data
		for (int i = 0; i < students; i++) {
			System.out.print("What is the student's name?: ");
			names[i] = input.nextLine();
			System.out.print("What is the student's score?: ");
			scores[i] = input.nextDouble();
			input.nextLine();
		}
		highScore = scores[0];
		scoreIndexes[0] = 0;
		secondHighestScore = Integer.MIN_VALUE;
		// Finding highest score/s
		for (int i = 1; i < names.length; i++) {
			// find if it's a high, same, or low score
			// If high, set highScore, reset scoreIndexes and set
			// scoreIndexes[0] to i.
			if (highScore < scores[i]) {
				highScore = scores[i];
				// integerArray = Arrays.copyOf(integerArray, i + 1); notes.
				scoreIndexes = Arrays.copyOf(scoreIndexes, 1);
				scoreIndexes[0] = i;
			}
			// If same, increase scoreIndexes size and set new int at end of
			// array to i.
			else if (highScore == scores[i]) {
				scoreIndexes = Arrays.copyOf(scoreIndexes, scoreIndexes.length + 1);
				scoreIndexes[scoreIndexes.length - 1] = i;
			}
			// If low, continue (aka do nothing here).
			else if (secondHighestScore < scores[i]) {
				secondHighestScore = scores[i];
				// integerArray = Arrays.copyOf(integerArray, i + 1); notes.
				secondHighestScoreIndexes = Arrays.copyOf(secondHighestScoreIndexes, 1);
				secondHighestScoreIndexes[0] = i;
			}
			else if (secondHighestScore == scores[i]) {
				secondHighestScoreIndexes = Arrays.copyOf(secondHighestScoreIndexes, secondHighestScoreIndexes.length + 1);
				secondHighestScoreIndexes[secondHighestScoreIndexes.length - 1] = i;
			}
			else ;
		}

		// output
		System.out.printf("%d people have the high score.\n", scoreIndexes.length);
		System.out.printf(
				"The high score was %f\nThe names of the students with the high score are...\n", highScore);
		for (int i = 0; i < scoreIndexes.length; i++)
			System.out.printf("%s\n", names[scoreIndexes[i]]);
		System.out.printf("%d people have the second highest score.\n", secondHighestScoreIndexes.length);
		System.out.printf(
				"The second highest score was %f\nThe names of the students with the second highest score are...\n", 
				secondHighestScore);
		for (int i = 0; i < secondHighestScoreIndexes.length; i++)
			System.out.printf("%s\n", names[secondHighestScoreIndexes[i]]);
		input.close();
	}
}
