package chapter_7;

import java.util.Scanner;

/**
 * (Analyze scores) Write a program that reads an unspecified number of scores
 * and determines how many scores are above or equal to the average and how many
 * scores are below the average. Enter a negative number to signify the end of
 * the input. Assume that the maximum number of scores is 100
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-5
 *
 */

public class Exercise_7_4__AnalyzeScores
{
	// main method for initialization and testing
	public static void main(String[] args)
	{
		analyzeScoresInput();
	}

	// create method for evaluating an array and use a while loop
	public static void analyzeScoresInput()
	{
		int[] array = new int[0];
		int lastAnswer;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter integers separated by a space: ");
		do
		{
			lastAnswer = input.nextInt();
			if (lastAnswer < 0)
				continue;
			int[] newArray = new int[array.length + 1];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
			array[array.length - 1] = lastAnswer;
		} while (lastAnswer >= 0 && array.length < 100);
		analyzeScores(array);
		input.close();
	}

	// create method to find average and print number of scores above and below
	// average
	public static void analyzeScores(int... numbers)
	{
		// finding the sum of all elements in numbers array
		int sum = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			sum += numbers[i];
		}
		// finding average and how many numbers are above and equal or below
		// average
		final double AVERAGE = sum / numbers.length;
		int aboveOrEqualToAverage = 0;
		int belowAverage = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] >= AVERAGE)
			{
				++aboveOrEqualToAverage;
			} else if (numbers[i] < AVERAGE)
				++belowAverage;
			else
				System.out.println("Something wonky happened while counting");
		}
		printScores(AVERAGE, aboveOrEqualToAverage, belowAverage, numbers.length);
	}

	// method to take the variables and print out a result
	public static void printScores(double AVERAGE, int aboveOrEqualToAverage, int belowAverage, int arrayLength)
	{
		System.out.printf("Out of %d elements with an average of %f"
				+ "\n%d were above or equal to the average and %d were below the average", 
				arrayLength, AVERAGE, aboveOrEqualToAverage, belowAverage);
	}
}
