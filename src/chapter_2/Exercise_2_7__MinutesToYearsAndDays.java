package chapter_2;

public class Exercise_2_7__MinutesToYearsAndDays {
	
	/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the min-
utes. For simplicity, assume a year has 365 days. Here is a sample run:

Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
	 */

	
	public static void main(String[] args) {
		
		//input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("Enter the number of minutes: \t");
		int minutes = input.nextInt();
		input.close();
		
		//processing
		minutesConverted(minutes);
		
		//output
		
		
	}
	
	public static void minutesConverted (int minutes){
		int years, days;
		years = minutes / (365 * 24 * 60);
		minutes -= (365 * 24 * 60 * years);
		days = minutes / (24 * 60);
		System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
	}

}

//Finished by William ODieLag Pennington