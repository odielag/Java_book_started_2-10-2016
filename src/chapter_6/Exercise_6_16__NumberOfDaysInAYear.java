package chapter_6;

/**
 * <h1>(Number of days in a year)</h1> Write a method that returns the number of
 * days in a year using the following header:
 * 
 * public static int numberOfDaysInAYear(int year)
 * 
 * Write a test program that displays the number of days in year from 2000 to
 * 2020. Leap years = 366, non-leap years = 365.
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-18
 */

public class Exercise_6_16__NumberOfDaysInAYear
{
	/** main method for testing */
	public static void main(String[] args)
	{
		for(int i = 2000; i <= 2020; i++)
			System.out.printf("Number of days in year %d: %d\n", i, numberOfDaysInAYear(i));
	}

	/**
	 * leap years when year % 400 = 0 is a leap year year % 100 == 0 not a leap year 
	 * % 4 == 0 is a leap year
	 */
	public static int numberOfDaysInAYear(int year)
	{
		if (year % 400 == 0)
			return 366;
		else if (year % 100 == 0)
			return 365;
		else if (year % 4 == 0)
			return 366;
		else
			return 365;
	}
}
