package chapter_2;

public class Exercise_2_12__AirplaneRunway {
	
	/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:

length = Math.pow(v, 2) / (2 * a);

Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s 2 ), and displays the minimum run-
way length. Here is a sample run:

Enter speed and acceleration: 60 3.5
The minimum runway length for this airplane is 514.286
	 */

	private static double a; // airplane's acceleration
	private static double v; // take-off speed
	private static double length; // runway length required
	
	
	public static void main(String[] args) {
	
		// input
		System.out.printf("Enter speed and acceleration: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		v = input.nextDouble();
		a = input.nextDouble();
		input.close();
		
		// processing
		length = Math.pow(v, 2) / (2 * a);
		
		// output
		System.out.printf("The minimum runway length for this airplane is %.3f", length);

	}

}

//Finished by William ODieLag Pennington
