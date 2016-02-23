package chapter_2;

public class Exercise_2_14__BMI {

	/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
a sample run:

Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
	 */
	
	private static double lbs; // weight in pounds
	private static double inches; // height in inches
	private static double meters; // in meters
	private static double kg; // in kilograms
	private static double bmi; // Body Mass Index 
	
	public static void main(String[] args) {
		
		// input
		System.out.printf("Enter weight in pounds: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		lbs = input.nextDouble();
		System.out.printf("Enter height in inches: ");
		inches = input.nextDouble();
		input.close();
		
		// processing
		meters = inches * 0.0254; // one inch is 0.0254 meters
		kg = lbs * 0.45359237; // one pound is 0.45359237 kilograms
		bmi = kg / Math.pow(meters, 2); 
		
		// output
		System.out.printf("BMI is %.4f", bmi);
		
	}

}

// Finished by William ODieLag Pennington
