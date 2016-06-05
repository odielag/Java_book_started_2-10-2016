package chapter_7;

import java.util.Arrays;

/**
 * <h1>(Reverse the numbers entered)</h1> Write a program that reads ten
 * integers and displays them in the reverse of the order in which they were
 * read.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-5
 *
 */

public class Exercise_7_2__ReverseTheNumbersEntered
{
	/** Main method for testing and initialization */
	public static void main(String[] args)
	{
		// Create an array length 10
		int[] array = new int[10];
		// fill the array with integers from 0 to max using a for loop.
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * Integer.MAX_VALUE);
		}
		reverseTheNumbersEntered(array);
	}
	/**
	 * "reverseTheNumbersEntered" method that reads 10 integers and displays them
	 * in reverse order
	 */
	public static void reverseTheNumbersEntered(int[] array)
	{
		for(int i = array.length - 1; i >= 0; i--)
		{
			System.out.print(array[i] + " ");
		}
	}
}
