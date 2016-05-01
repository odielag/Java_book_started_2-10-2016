package chapter_5;

import java.util.Scanner;
import java.util.Arrays;

/**
 * <h1>(Find the highest score)</h1> Write a program that prompts the user to
 * enter the num- ber of students and each student’s name and score, and finally
 * displays the name of the student with the highest score.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-1
 */

public class Exercise_5_8__FindTheHighestScore {

	/*
	 * Make two arrays sized by user input.
	 * 
	 * I think I'll make two arrays. A String array for the name, and a double
	 * array for the value. I'll then make a for loop to find the index of the
	 * highest value and print the name and value of that index.
	 */

	public static void main(String[] args)
	{
		// input
		String[] names;
		double[] scores;
		Scanner input = new Scanner(System.in);
		int students;
		double highScore;
		int[] scoreIndexes = new int[1];
		
		System.out.print("How many students are there?: ");
		students = input.nextInt();
		input.nextLine();
		names = new String[students];
		scores = new double[students];
		
		// processing
			// Filling in arrays with data
		for(int i = 0; i < students; i++)
		{
			System.out.print("What is the student's name?: ");
			names[i] = input.nextLine();
			System.out.print("What is the student's score?: ");
			scores[i] = input.nextDouble();
			input.nextLine();
		}
		
		highScore = scores[0];
		scoreIndexes[0] = 0; 
			// Finding highest score/s
		for (int i = 1; i < names.length; i++)
		{
			// find if it's a high, same, or low score
				// If high, set highScore, reset scoreIndexes and set scoreIndexes[0] to i.
			if (highScore < scores[i])
			{
				highScore = scores[i];
				// integerArray = Arrays.copyOf(integerArray, i + 1); notes.
				scoreIndexes = Arrays.copyOf(scoreIndexes, 1);
				scoreIndexes[0] = i;
			}
				// If same, increase scoreIndexes size and set new int at end of array to i.
			else if (highScore == scores[i])
			{
				scoreIndexes = Arrays.copyOf(scoreIndexes, scoreIndexes.length + 1);
				scoreIndexes[scoreIndexes.length - 1] = i;
			}
				// If low, continue (aka do nothing here).
			else ;
		}
		
		// output
		System.out.printf("%d people have the high score.\n", scoreIndexes.length);
		System.out.printf(
				"The high score was %f\nThe names of the students with the high score are...\n", highScore);
		for (int i = 0; i < scoreIndexes.length; i++)
			System.out.printf("%s\n", names[scoreIndexes[i]]);
		
		input.close();
	}

}
