package chapter_7;

import java.util.Scanner;

/**
 * (Partition of a list) Write the following method that partitions the list
 * using the first element, called a pivot.
 * 
 * public static int partition(int[] list)
 * 
 * After the partition, the elements in the list are rearranged so that all the
 * elements before the pivot are less than or equal to the pivot and the
 * elements after the pivot are greater than the pivot. The method returns the
 * index where the pivot is located in the new list. For example, suppose the
 * list is {5, 2, 9, 3, 6, 8}. After the parti- tion, the list becomes {3, 2, 5,
 * 9, 6, 8}. Implement the method in a way that takes at most list.length
 * comparisons. Write a test program that prompts the user to enter a list and
 * displays the list after the partition. Here is a sample run. Note that the
 * first number in the input indicates the number of the elements in the list.
 * This number is not part of the list.
 * 
 * Enter list: 8 10 1 5 16 61 9 11 1 
 * 
 * After the partition, the list is 9 1 5 1 10 61 11 16
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-12
 *
 */

public class Exercise_7_32__PartitionOfAList
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int[] array = new int[input.nextInt()];
		for(int i = 0; i < array.length; ++i)
		{
			array[i] = input.nextInt();
		}
		int[] partitioned = (partition(array)).clone();
		input.close();
		System.out.print("After the partition, the list is ");
		for(int x : partitioned)
		{
			System.out.print(x + " ");
		}
	}
	// partitions array/list
	public static int[] partition(int[] list)
	{
		// 'before' is to count all the expressions before the partition number
		int before = 0;
		// the partition number
		int median = list[0];
		// this partition will be the partition returned.
		int[] newPartition = new int[list.length];
		// for loop to count before and after.
		for(int i = 1; i < list.length; ++i)
		{
			if(list[i] <= median)
				++before;
		}
		// putting the median number where it belongs
		newPartition[before] = median;
		// putting the before and after numbers where they belong
		int lowerPlacement = 0;
		int upperPlacement = before + 1;
		for(int i = 1; i < list.length; ++i)
		{
			if(list[i] <= median)
			{
				newPartition[lowerPlacement] = list[i];
				++lowerPlacement;
			}
			else
			{
				newPartition[upperPlacement] = list[i];
				++upperPlacement;
			}
		}
		return newPartition;
	}
}
