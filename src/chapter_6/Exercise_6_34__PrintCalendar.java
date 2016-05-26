package chapter_6;

import java.util.Scanner;

/**
 * <h1>(Print calendar)</h1> Programming Exercise 3.21 uses Zeller’s congruence to calcu-
late the day of the week. Simplify Listing 6.12, PrintCalendar.java, using Zeller’s
algorithm to get the start day of the month.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-26
 *
 */

public class Exercise_6_34__PrintCalendar
{
	/** Main method */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter year
		System.out.print("Enter full year (e.g., 2012): ");
		int year = input.nextInt();
		// Prompt the user to enter month
		System.out.print("Enter month as a number between 1 and 12: ");
		int month = input.nextInt();
		// Print calendar for the month of the year
		printMonth(year, month);
		input.close();
	}

	/** Print the calendar for a month in a year */
	public static void printMonth(int year, int month)
	{
		// Print the headings of the calendar
		printMonthTitle(year, month);
		// Print the body of the calendar
		printMonthBody(year, month);
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
	public static void printMonthBody(int year, int month)
	{
		// Get start day of the week for the first date in the month
		/// replacing with zellersCongruence method 		// int startDay = getStartDay(year, month);
		int startDay = zellersCongruence(year, month, 1);
		
		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		// Pad space before the first day of the month
		int i = 0;
		for (; i < startDay; i++)
			System.out.print("    ");

		for (i = 1; i <= numberOfDaysInMonth; i++)
		{
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}

	
	
	/*
(Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week. The formula is


h = (q + ((26 * (m + 1)) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

where

■ h
is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
Wednesday, 5: Thursday, 6: Friday).

■ q
is the day of the month.

■ m
is the month (3: March, 4: April, ..., 12: December). January and February
are counted as months 13 and 14 of the previous year.
year
■ j is the century (i.e., year / 100).

■ k is the year of the century (i.e., year % 100).

Note that the division in the formula performs an integer division. Write a pro-
gram that prompts the user to enter a year, month, and day of the month, and
displays the name of the day of the week. Here are some sample runs:

Enter year: (e.g., 2012): 2015
Enter month: 1-12: 1
Enter the day of the month: 1-31: 25
Day of the week is Sunday

Enter year: (e.g., 2012): 2012
Enter month: 1-12: 5
Enter the day of the month: 1-31: 12
Day of the week is Saturday


(Hint: January and February are counted as 13 and 14 in the formula, so you need
to convert the user input 1 to 13 and 2 to 14 for the month and change the year to
the previous year.)
	 */

	public static int zellersCongruence(int yearInput, int monthInput, int dayOfMonth)
	{
		
		// input
		int h; // day of the week (0: Saturday, 1: Sunday ...)
		int q; // day of the month
		int m; // month. (3: March, 4: April...) January and February counted as months 13 and 14
		int j; // century (i.e., year / 100)
		int k; // year of the century (i.e., year % 100).
		//int yearInput;
		//int monthInput; // 1-12
		//int dayOfMonth; // 1-31
		//String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		//System.out.println("Enter year: (e.g., 2015): ");
		//java.util.Scanner input = new java.util.Scanner(System.in);
		//yearInput = input.nextInt();
		//System.out.println("Enter month: 1-12: ");
		//monthInput = input.nextInt();
		//System.out.println("Enter the day of the month: 1-31: ");
		//dayOfMonth = input.nextInt();
		//input.close();
		
		// processing
		if(monthInput == 1 || monthInput == 2){
			m = monthInput + 12;
			yearInput -= 1;
		}
		else m = monthInput;
		q = dayOfMonth;
		j = yearInput / 100; // century
		k = yearInput % 100; // year of century		
		
		h = (q + ((26 * (m + 1)) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
		
		
		// output
		//		example: "Day of the week is Sunday"
		//System.out.println("Day of the week is " + days[h]);
		
		// Adjusting days so Sunday is 0 and Saturday is 6
		--h;
		if(h == -1)
			h = 6;
		return h;
	}
	
	
	/** Get the start day of month/1/year UNUSED METHOD, USING ZELLERSCONGRUENCE INSTEAD
	public static int getStartDay(int year, int month)
	{
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}
	*/

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
	public static int getNumberOfDaysInMonth(int year, int month) {
	if (month == 1 || month == 3 || month == 5 || month == 7 ||
	month == 8 || month == 10 || month == 12)
	return 31;
	if (month == 4 || month == 6 || month == 9 || month == 11)
	return 30;
	if (month == 2) return isLeapYear(year) ? 29 : 28;

	return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	public static boolean isLeapYear(int year)
	{
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	

}
