package chapter_2;

public class Exercise_2_23__ {
	
	/*
(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip. Here is a sample run:

Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36
	 */
	
	private static double distance; // total driving distance
	private static double mpg; // miles per gallon
	private static double ppg; // price per gallon
	private static double cost; // total cost of the trip

	public static void main(String[] args) {
		
		// input
		System.out.printf("Enter the driving distance: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		distance = input.nextDouble();
		System.out.printf("Enter miles per gallon: ");
		mpg = input.nextDouble();
		System.out.printf("Enter price per gallon: ");
		ppg = input.nextDouble();
		input.close();
		
		// processing
		cost = (distance / mpg) * ppg;
		
		// output
		System.out.printf("The cost of driving is $%.2f", cost);

	}

}

// Finished by William ODieLag Pennington