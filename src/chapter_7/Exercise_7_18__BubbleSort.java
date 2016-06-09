package chapter_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * (Bubble sort) Write a sort method that uses the bubbleSort algorithm. The
 * bubbleSort algorithm makes several passes through the array. On each pass,
 * successive neighboring pairs are compared. If a pair is not in order, its
 * values are swapped; otherwise, the values remain unchanged. The technique is
 * called a bubble sort or sinking sort because the smaller values gradually
 * “bubble” their way to the top and the larger values “sink” to the bottom.
 * Write a test program that reads in ten double numbers, invokes the method,
 * and displays the sorted numbers.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-7
 *
 */

public class Exercise_7_18__BubbleSort
{
	// Write a test main class that reads in ten double numbers,
	// saves them to double array, invokes a method and displays the sorted
	// numbers.
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		System.out.print("Please enter 10 numbers: ");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = input.nextDouble();
		}
		bubbleSort(array);
		// display the sorted numbers
		System.out.print(Arrays.toString(array));
		// close input
		input.close();
	}
	public static void bubbleSort(double... array)
	{
		boolean sorted = false;
		while(!sorted)
		{
			int sortedCount = 0;
			for(int i = 0; i < array.length - 1; i++)
			{
				if(array[i] > array[i + 1])
				{
					double temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					++sortedCount;
				}
			}
			if (sortedCount == 0)
				sorted = true;
		}
		return;
	}
}
