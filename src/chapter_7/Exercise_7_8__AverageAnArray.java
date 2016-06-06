package chapter_7;

import java.util.Scanner;

/**
 * <h1>(Average an array)</h1> Write two overloaded methods that return the
 * average of an array with the following headers: public static int
 * average(int[] array) public static double average(double[] array) Write a
 * test program that prompts the user to enter ten double values, invokes this
 * method, and displays the average value.
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-6-5
 *
 */

public class Exercise_7_8__AverageAnArray
{
	// method used to test the double average method.
	public static void testProgram(String[] args)
	{
		double[] array = new double[10];
		// Write a test program that prompts the user to enter 10 double values
		// invokes the method and displays the average value.
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 10 double values");
		for(int i = 0; i < 10; i++)
		{
			array[i] = input.nextDouble();
		}
		System.out.printf("The average of the array is: %f", average(array));
		input.close();
	}
	// int version of average returning method.
	public static int average(int[] array)
	{
		int average = 0;
		for(int i = 0; i < array.length; i++)
		{
			average += array[i];
		}
		average /= array.length;
		return average;
	}
	// double version of average returning method.
	public static double average(double[] array)
	{
		double average = 0;
		for(int i = 0; i < array.length; i++)
		{
			average += array[i];
		}
		average /= array.length;
		return average;
	}
}
