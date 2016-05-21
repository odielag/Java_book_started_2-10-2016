package chapter_6;

/**
 * <h1>(Display current date and time)</h1> Listing 2.7, ShowCurrentTime.java,
 * displays the current time. Improve this example to display the current date
 * and time. The cal- endar example in Listing 6.12, PrintCalendar.java, should
 * give you some ideas on how to find the year, month, and day.
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-20
 *
 */

public class Exercise_6_24__DisplayCurrentDateAndTime
{
	/** main method to initialize testing from */
	public static void main(String[] args)
	{
		minutesConverted(1000000000);
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
	public static void minutesConverted(int minutes)
	{
		int years, month = 0, days, day;
		years = minutes / (365 * 24 * 60);
		minutes -= (365 * 24 * 60 * years);
		days = minutes / (24 * 60);

		// Converting days to months and day.
		int[] daysInThisMonth = {31, (isLeapYear(years)?29:28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // month january = 0.
		// loop to check what month it is.
		for (int i = 0; i < daysInThisMonth.length; i++)
		{
			if (days <= daysInThisMonth[i])
			{
				month = i;
				break;
			}
			else
				days -= daysInThisMonth[i];
		}
		day = days;
		printMonth(years, month + 1, day);

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
	public static void printMonth(int year, int month, int day)
	{
		// Print the headings of the calendar
		printMonthTitle(year, month);
		// Print the body of the calendar
		printMonthBody(year, month, day);
	}

	/** Print the month title, e.g., March 2012 */
	public static void printMonthTitle(int year, int month)
	{
		System.out.println("	" + getMonthName(month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	/** Get the English name for the month */
	public static String getMonthName(int month)
	{
		String monthName = "";
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
	public static void printMonthBody(int year, int month, int day)
	{
		// Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);

		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("	");
		// for loop like above but goes until i < day
		for (i = 1; i < day; i++)
		{
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}		
		// for loop like above but just works on i = day
		for (i = 1; i == day; i++)
		{
			System.out.printf("%4d", "(" + i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}		
		// for loop like above but just works on i = day + 1
		for (i = 1; i == day + 1; i++)
		{
			System.out.printf("%-2s%2d", "(", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}		
		// for loop like above but just works <= numberOfDaysInMonth
		for (i = 1; i <= numberOfDaysInMonth; i++)
		{
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}

	/** Get the start day of month/1/year */
	public static int getStartDay(int year, int month)
	{
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	/** Get the total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays(int year, int month)
	{
		int total = 0;

		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;
		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);
		return total;
	}

	/** Get the number of days in a month */
	public static int getNumberOfDaysInMonth(int year, int month)
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
	public static boolean isLeapYear(int year)
	{
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
