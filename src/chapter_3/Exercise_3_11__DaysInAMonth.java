package chapter_3;

public class Exercise_3_11__DaysInAMonth {
	
	/*
(Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012 , the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015 , the
program should display that March 2015 had 31 days.

The Gregorian calendar has four months with a length of 30 days and seven months
that are 31 days long. February is the only month that is 28 days long in common
years and 29 days long in leap years.

January		31
February	// 28 days long in common years and 29 days long in leap years.
March		31
April		30
May			31
June		30
July		31
August		31
September	30
October		31
November	30
December	31

For example, the years 1700, 1800, and 1900 are not leap years, but the year 2000 is.
Over a period of 4 centuries, the accumulated error of adding a leap day every 4 years
amounts to about 3 extra days. The Gregorian calendar therefore removes three
leap days every 400 years, which is the length of its leap cycle.

if (year % 400 == 0) leapYear = true;
else if (year % 100 == 0) leapYear = false;
else if (year % 4 == 0) leapYear = true;
else System.out.println("\nError with leap years\t");

	 */
	
	public static void main(String[] args){
		
		// input
		int month, year, days;
		int[] monthDays = {31, 28, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
		String[] monthName = {"January","February","March","April","May",
			"June","July","August","September","October","November","December"};
		
		System.out.print("Please enter the month and year numbers: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		month = input.nextInt();
		year = input.nextInt();
		input.close();
		
		// processing
		if (year % 400 == 0 && year % 100 != 0) monthDays[1] = 29;
		else if (year % 100 == 0 && year % 400 != 0) monthDays[1] = 28;
		else if (year % 4 == 0) monthDays[1] = 29;
				
		
		// output
		System.out.printf("%s %d had %d days.", monthName[month - 1], year, monthDays[month - 1]);
		
	}

}
