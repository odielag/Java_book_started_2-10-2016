package chapter_6;

import java.util.Calendar;

/**
 * <h1>(Display current date and time)</h1> Listing 2.7, ShowCurrentTime.java,
 * displays the current time. Improve this example to display the current date
 * and time. The cal- endar example in Listing 6.12, PrintCalendar.java, should
 * give you some ideas on how to find the year, month, and day.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-20
 *
 */

public class Exercise_6_24__DisplayCurrentDateAndTime
{
	/** main method to initialize testing from */
	public static void main(String[] args)
	{
		//minutesConverted(System.currentTimeMillis() / 1000);
		Calendar now = Calendar.getInstance();
		printMonth(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH));

	}

	/** The real listing 2.7 I should have pasted... */
	public static void ShowCurrentTime()
	{
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		// Compute the current hour
		long currentHour = totalHours % 24;
		// Display results
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
	
	/*
	 * (Find the number of years) Write a program that prompts the user to enter
	 * the minutes (e.g., 1 billion), and displays the number of years and days
	 * for the min- utes. For simplicity, assume a year has 365 days. Here is a
	 * sample run:
	 * 
	 * Enter the number of minutes: 1000000000
	 * 
	 * 1000000000 minutes is approximately 1902 years and 214 days
	 */
	public static void minutesConverted(long minutes)
	{
		long year, month = 0, days, day;
		year = minutes / (365 * 24 * 60);
		minutes -= (365 * 24 * 60 * year);
		days = minutes / (24 * 60);
		minutes -= (24 * 60) * days;

		// Find out which month the end day is in
		for (int i = 1; i <= 12; i++)
		{
			if (days <= getNumberOfDaysInMonth(year, i))
			{
				month = i;
				break;
			}
			else
				days -= getNumberOfDaysInMonth(year, i);
		}
		day = days;
		printMonth(year, month, day);

		// instead of printing out data below, pass the 3 variables to
		// printCalendar.

		/*
		 * Legacy... // System.out.printf(
		 * "%d minutes is approximately %d years and %d days", // minutes,
		 * years, days);
		 * 
		 */
	}

	/**
	 * listing 6.12 PrintCalendar to print an organized list of numbers to make
	 * a calendar
	 */
	/** Print the calendar for a month in a year */
	public static void printMonth(long year, long month, long day)
	{
		// Print the headings of the calendar
		printMonthTitle(year, month);
		// Print the body of the calendar
		printMonthBody(year, month, day);
	}

	/** Print the month title, e.g., March 2012 */
	public static void printMonthTitle(long year, long month)
	{
		System.out.println("	" + getMonthName(month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	/** Get the English name for the month */
	public static String getMonthName(long monthLong)
	{
		String monthName = "";
		int month = (int)monthLong;
		switch (month)
		{
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}
		return monthName;
	}

	/** Print month body */
	public static void printMonthBody(long year, long month, long day)
	{
		// Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);

		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		// for loop like above but goes until i < day
		for (i = 1; i < day; i++)
		{
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}		
		// for loop like above but just works on i = day
		for (; i == day; i++)
		{
			System.out.printf("%4s", "(" + i + ")");
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}		
		// for loop like above but just works <= numberOfDaysInMonth
		for (; i <= numberOfDaysInMonth; i++)
		{
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}

	/** Get the start day of month/1/year */
	public static int getStartDay(long year, long month)
	{
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	/** Get the total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays(long year, long month)
	{
		int total = 0;

		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total += 366;
			else
				total += 365;
		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total += getNumberOfDaysInMonth(year, i);
		return total;
	}

	/** Get the number of days in a month */
	public static int getNumberOfDaysInMonth(long year, long month)
	{
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	public static boolean isLeapYear(long year)
	{
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
