package chapter_7;

import java.util.Scanner;

/**
 * <h1>(Find the index of the smallest element)</h1> Write a method that returns
 * the index of the smallest element in an array of integers. If the number of
 * such elements is greater than 1, return the smallest index. Use the following
 * header:
 * 
 * public static int indexOfSmallestElement(double[] array)
 * 
 * Write a test program that prompts the user to enter ten numbers, invokes this
 * method to return the index of the smallest element, and displays the index.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-5
 *
 */

public class Exercise_7_10__FindTheIndexOfTheSmallestElement
{
	// main method that makes an array of 10 doubles...
	// then has the user fill in tne array with values...
	// then prints the index and as it calls the indexOfSmallestElement array.
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		System.out.print("Please enter 10 numbers separated by spaces or enter\n");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = input.nextDouble();
		}
		System.out.printf("The index of the smallest element is: %d", indexOfSmallestElement(array));
		input.close();
	}
	// method to take an array and return the index of the smallest element
	public static int indexOfSmallestElement(double[] array)
	{
		int smallestIndex = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < array[smallestIndex])
				smallestIndex = i;
		}
		return smallestIndex;
	}
}
