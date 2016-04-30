package chapter_5;

/**
 * (Conversion from miles to kilometers) Write a program that displays the follow-
ing table (note that 1 mile is 1.609 kilometers):
Miles		Kilometers
1			1.609
2			3.218
...
9			14.481
10			16.090

@author William ODieLag Pennington
@version 1.0
@since 2016-4-30
 *
 */

public class Exercise_5_4__MilesToKilometers {
	public static void main(String[] args)
	{
		System.out.printf("%-12s%-12s\n", "Miles", "Kilometers");
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%-12d%-12.3f\n", i, (double)i * 1.609);
		}
	}
}
