package chapter_7;

import java.util.Scanner;

/**
 * 7.3 Case Study: Analyzing Numbers The problem is to write a program that
 * finds the number of items above the average of all items.
 * 
 * Now you can write a program using arrays to solve the problem proposed at the
 * beginning of this chapter. The problem is to read 100 numbers, get the
 * average of these numbers, and find the number of the items greater than the
 * average. To be flexible for handling any number of input, we will let the
 * user enter the number of input, rather than fixing it to 100. Listing 7.1
 * gives a solution.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-29
 *
 */

public class Listing_7_1__AnalyzeNumbers
{
	/** main method to call analyzingNumbers function with array size int */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("input array size as a whole positive integer: ");
		analyzingNumbers(input.nextInt());
		System.out.println();
		input.close();
	}
	/** Method that populates an array with random numbers then
	 * finds the average of all elements and calculates the number
	 * of indexes with elements higher than that average.
	 */
	public static void analyzingNumbers(int n)
	{
		// make a random array of size n.
		double[] array = new double[n];
		
		// populate that array with random double numbers.
		for(int i = 0; i < array.length; i++)
		{
			array[i] = Math.random();
		}
		// sum up total of all elements in the array.
		double elementsSum = 0;
		for(int i = 0; i < array.length; i++)
		{
			elementsSum += array[i];
		}
		
		// divide sum by array n length.
		double elementsAverage = elementsSum / array.length;
		
		// initialize element counter int variable and declare it as 0.
		int elementCounter = 0;
		
		// count number of elements above elementsAverage.
		for(int i = 0; i < array.length; i++)
			if(array[i] > elementsAverage)
				++elementCounter;
		
		// print results
		System.out.printf("For this array of length %d"
				+ " \nThe number of elements above the average %f is: %d", 
				array.length, elementsAverage, elementCounter);
	}
}
