package chapter_4;

import java.util.Scanner;

public class Exercise_4_17__DaysOfAMonth {
	
	/*
(Days of a month) Write a program that prompts the user to enter a year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month. Here is a sample run:

January	31
February	28*		29 days during leap years (2000, 2004, 2008, 2012) ...
March	31
April	30
May	31
June	30
July	31
August	31
September	30
October	31
November	30
December	31



Enter a year: 2001
Enter a month: Jan
Jan 2001 has 31 days

Enter a year: 2016
Enter a month: Feb
Jan 2016 has 29 days
	 */
	
	public static void main(String[] args) {
		
		// input
		int year;
		String month;
		int days = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		year = input.nextInt();
		System.out.print("Enter a month: ");
		month = input.next();
		input.close();
		
		// processing
		switch (month.toLowerCase().substring(0, 3)) {
		case "jan": days = 31; break;
		case "feb": if (year % 4 == 0) days = 29; else days = 28; break;
		case "mar": days = 31; break;
		case "apr": days = 30; break;
		case "may": days = 31; break;
		case "jun": days = 30; break;
		case "jul": days = 31; break;
		case "aug": days = 31; break;
		case "sep": days = 30; break;
		case "oct": days = 31; break;
		case "nov": days = 30; break;
		case "dec": days = 31; break;
		default: System.out.print("\nInput unrecognized. Exiting"); System.exit(-1); break;
		}
			
		// output
		System.out.printf("%s %d has %d days", month, year, days);
	}

}

// Completed on 4/11/2016 by William ODieLag Pennington;