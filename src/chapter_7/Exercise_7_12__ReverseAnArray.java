package chapter_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>(Reverse an array)</h1> The reverse method in Section reverses an array
 * by copying it to a new array. Rewrite the method that reverses the array
 * passed in the argument and returns this array. Write a test program that
 * prompts the user to enter ten numbers, invokes the method to reverse the
 * numbers, and displays the numbers.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-5
 *
 */

public class Exercise_7_12__ReverseAnArray
{
	// main method that has user create array length 10.
	// once the array is filled send it to a method...
	// which reverses the elements and returns the array.
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Please enter 10 integers: ");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = input.nextInt();
		}
		reverseArray(array);
		input.close();
	}
	public static void reverseArray(int[] array)
	{
		for(int i = 0; i < array.length / 2; i++)
		{
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
