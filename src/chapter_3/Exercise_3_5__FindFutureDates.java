package chapter_3;

public class Exercise_3_5__FindFutureDates {
	
	/*
(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and dis-
play the future day of the week. Here is a sample run:

Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday

Enter today's day: 0
Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday
	 */

	public static void main(String[] args){
		
		// input
		String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.printf("Enter today's day of the week...");
		System.out.printf("\n(Sunday is 0, Monday is 1, ..., and Saturday is 6): ");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		int todaysDay = input.nextInt();
		
		System.out.printf("Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();
				
		input.close();
		
		// processing
		String output = String.format("Todays is %s and the future days is %s"
				, day[todaysDay % 7], day[(todaysDay + elapsedDays) % 7]);
		
		// output
		System.out.printf(output);
		
	}
	
}
