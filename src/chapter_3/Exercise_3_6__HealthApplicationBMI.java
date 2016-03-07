package chapter_3;

public class Exercise_3_6__HealthApplicationBMI {
	
	/*
(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches. Here is a sample run:

Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
BMI is 20.087702275404553
Normal
	 */

	/*
Pasting listing 3.4 and modifying.
	 */
	
	public static double pounds, feet, inches, kilograms, meters, BMI;
	public static double[] thresholdsBMI = {0, 18.5, 25.0, 30.0};
	public static String[] stringBMI = {"Underweight", "Normal", "Overweight", "Obese"};
	public static String result;

	public static void main(String[] args) {

		// input
		System.out.printf("Enter weight in pounds: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		pounds = input.nextDouble();
		System.out.printf("Enter height in feet: ");
		feet = input.nextDouble();
		System.out.printf("Enter height in inches: ");
		inches = input.nextDouble();
		input.close();

		// processing
		meters = (feet * 12 + inches) * 0.0254;
		kilograms = pounds * 0.45359237;
		BMI = kilograms / Math.pow(meters, 2);

		for(int i = 0; i < 4; i++){
			if(thresholdsBMI[i] < BMI)
				result = stringBMI[i];				
		}

		// output
		System.out.printf("BMI is %.15f\n%s", BMI, result);

	}
	
}

// Finished by William ODieLag Pennington on 3/6/2016;