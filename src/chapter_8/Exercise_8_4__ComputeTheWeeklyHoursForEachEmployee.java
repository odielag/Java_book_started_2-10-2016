package chapter_8;

/**
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employ-
 * ee’s seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees. Write a program that
 * displays employees and their total hours in decreasing order of the total
 * hours.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-22
 *
 */

public class Exercise_8_4__ComputeTheWeeklyHoursForEachEmployee
{
	public static void main(String[] args)
	{
		// create an array for employee hours
		int[][] array2d =
		{ // array[employee][day(startingSunday)]
				{ 2, 4, 3, 4, 5, 8, 8 },
				{ 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 },
				{ 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		computeWeeklyHours(array2d);
	}

	public static void computeWeeklyHours(int[][] m)
	{
		int[] array1d = new int[m.length];
		for (int row = 0; row < m.length; row++)
		{
			int sum = 0;
			for (int col = 0; col < m[row].length; col++)
			{
				sum += m[row][col];
			}
			array1d[row] = sum;
		}
		printWeeklyHours(array1d);
	}

	public static void printWeeklyHours(int[] m)
	{
		for (int employee = 0; employee < m.length; employee++)
		{
			System.out.printf("Employee %d earned %d this week.\n", employee, m[employee]);
		}
	}
}
