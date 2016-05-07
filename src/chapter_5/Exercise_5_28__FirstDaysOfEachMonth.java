package chapter_5;

import java.util.Scanner;

/**
 * 
 * <h1>(Display the first days of each month)</h1> Write a program that prompts
 * the user to enter the year and first day of the year, and displays the first
 * day of each month in the year. For example, if the user entered the year 2013
 * , and 2 for Tuesday, January 1, 2013, your program should display the
 * following output:
 * 
 * January 1, 2013 is Tuesday
 *  ... 
 * December 1, 2013 is Sunday
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-7
 * 
 */

/*
 * January		31
 * February		28*		29 if year % 4 = 0;
 * March		31
 * April		30
 * May			31
 * June			30
 * July			31
 * August		31
 * September	30
 * October		31
 * November		30
 * December		31
 */

public class Exercise_5_28__FirstDaysOfEachMonth
{
	public static void main(String[] args)
	{
		// Get inputs of year and the day of the week of that year's first day
		// Add the day number to daySum
		// Make a String array for monthNames and monthDays
		// Make a loop to add the last month's days (starting at december
		// ) get the month name and add the days to daySum and figure out the
		// day of the week.
		// Make an array for the names of the days of the week.
		Scanner input = new Scanner(System.in);
		int daySum, year, day;
		String[] dayOfTheWeek = 
			{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String[] monthNames =
			{"January", "February", "March", "April", "May", "June", "July", "August", 
					"September", "October", "November", "December"};
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.print("What year is it? ");		
		year = input.nextInt();
		// adjusting February days to adjust for leap-years.
		if (year % 4 == 0)
			monthDays[1] = 29;
		System.out.print(
				"With Sunday = 0 and Monday = 1 ... \n"
				+ "please insert the day as a number\n"
				+ "for January 1: ");
		day = input.nextInt();
		daySum = day;
		System.out.println();

		
		// processing and output
		//January 1, 2013 is Tuesday (example).
		System.out.printf("January 1, %d is %s\n", year, dayOfTheWeek[day]);
		// the loop to calculate and display.
		for (int i = 0; i < 11; i++)
		{
			daySum += monthDays[i];
			System.out.printf("%s 1, %d is %s\n",
					monthNames[i + 1], year, dayOfTheWeek[daySum - (int)(daySum / 7) * 7]);
		}
		input.close();
	}
}

// Tested with 2013 and 2016 calendars and it works with the correct days displayed.
// ~wop