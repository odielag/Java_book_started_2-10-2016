package chapter_3;

public class Exercise_3_21__DayOfTheWeek {
	
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

	public static void main(String[] args){
		
		// input
		int h; // day of the week (0: Saturday, 1: Sunday ...)
		int q; // day of the month
		int m; // month. (3: March, 4: April...) January and February counted as months 13 and 14
		int j; // century (i.e., year / 100)
		int k; // year of the century (i.e., year % 100).
		int yearInput;
		int monthInput; // 1-12
		int dayOfMonth; // 1-31
		String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		System.out.println("Enter year: (e.g., 2015): ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		yearInput = input.nextInt();
		System.out.println("Enter month: 1-12: ");
		monthInput = input.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		dayOfMonth = input.nextInt();
		input.close();
		
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
		System.out.println("Day of the week is " + days[h]);
		
	}
	
}

// Finished by William ODieLag Pennington on 3/14/2016;