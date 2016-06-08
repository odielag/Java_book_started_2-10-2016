package chapter_7;

import java.util.Arrays;
import java.util.Scanner;
import chapter_7.Listing_7_6__LinearSearch;
import chapter_7.Listing_7_7__BinarySearch;

/**
 * <h1>(Execution time)</h1> Write a program that randomly generates an array of
 * 100,000 integers and a key. Estimate the execution time of invoking the
 * linearSearch method in Listing 7.6. Sort the array and estimate the execution
 * time of invoking the binarySearch method in Listing 7.7. You can use the
 * following code template to obtain the execution time:
 * 
 * long startTime = System.currentTimeMillis();
 * 
 * perform the task;
 * 
 * long endTime = System.currentTimeMillis();
 * 
 * long executionTime = endTime - startTime;
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-7
 *
 */

public class Exercise_7_16__ExecutionTime
{
	public static void main(String[] args)
	{
		// create array of 100,000 integers.
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int) (Math.random() * 10000);
		}
		// create a key with random int value.
		int key = (int) (Math.random() * 10000);
		// estimate linearSearch method search time in ms.
		System.out.print("How long do you think the linear search will take (in ms): ");
		Scanner input = new Scanner(System.in);
		long guess = input.nextLong();
		long startTime = System.currentTimeMillis();
		// linearSearch method from Listing 7.6.
		int index = Listing_7_6__LinearSearch.linearSearch(array, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		// print estimate and time for linearSearch.
		System.out.printf("You estimated it would take %dms, linearSearch took %d ms.\n"
				+ "The key was %d, the index found was %d.\n", guess, executionTime, key, index);
		// sort array.
		Arrays.sort(array);
		// estimate binarySearch method time in ms.
		System.out.print("How long do you think the binary search will take (in ms): ");
		guess = input.nextLong();
		startTime = System.currentTimeMillis();
		// binarySearch array with key using Listing 7.7.
		index = Listing_7_7__BinarySearch.binarySearch(array, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		// print estimate and time for binarySearch.
		System.out.printf("You estimated it would take %dms, binarySearch took %d ms.\n"
				+ "The key was %d, the index found was %d.\n", guess, executionTime, key, index);
		// close input Scanner.
		input.close();
	}
}
