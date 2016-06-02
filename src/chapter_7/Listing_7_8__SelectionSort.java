package chapter_7;

/**
 * <h1>Selection Sort</h1>
 * You know how the selection-sort approach works. The task now is to implement it in Java.
 * Beginners find it difficult to develop a complete solution on the first attempt. Start by writing
 * the code for the first iteration to find the smallest element in the list and swap it with the first
 * element, and then observe what would be different for the second iteration, the third, and so
 * on. The insight this gives will enable you to write a loop that generalizes all the iterations.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-1
 * 
 */

import java.util.Arrays;

public class Listing_7_8__SelectionSort
{
	/**
	 * main method where an array of random integers is crated then sent to the
	 * selectionSort method to be sorted in ascending order.
	 */
	public static void main(String[] args)
	{
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array));
		int[] sortedArray = new int[array.length];
		System.arraycopy(selectionSort(array), 0, sortedArray, 0, array.length);

		System.out.println(Arrays.toString(array));
	}

	/**
	 * selection sort method accepts an array... for loop takes element of first
	 * index and compares the value to every following element. When a new
	 * lowest element happens then the value and index is stored. Once the last
	 * element is evaluated... if the current index element is higher than the
	 * lowest recorded element the elements will be swapped and the following
	 * index will do the same thing. Luckily.
	 */
	public static double[] selectionSort(double[] array)
	{

		for (int i = 0; i < array.length - 1; i++)
		{
			int lowerElement = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[lowerElement] > array[j])
					lowerElement = j;
			}
			/*
			 * After out of the remaining elements are evaluated the index of
			 * the lowest remaining element is used to swap the value of the
			 * focus index element with the element of the new lowerElement
			 */
			double temp = array[i];
			array[i] = array[lowerElement];
			array[lowerElement] = temp;
		}
		return array;
	}
	
	public static int[] selectionSort(int[] array)
	{

		for (int i = 0; i < array.length - 1; i++)
		{
			int lowerElement = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[lowerElement] > array[j])
					lowerElement = j;
			}
			/*
			 * After out of the remaining elements are evaluated the index of
			 * the lowest remaining element is used to swap the value of the
			 * focus index element with the element of the new lowerElement
			 */
			int temp = array[i];
			array[i] = array[lowerElement];
			array[lowerElement] = temp;
		}
		return array;
	}
}
