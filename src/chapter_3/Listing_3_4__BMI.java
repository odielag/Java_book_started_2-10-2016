package chapter_3;

public class Listing_3_4__BMI
{

	/*
	 * Body Mass Index (BMI) is a measure of health based on height and weight.
	 * It can be cal- culated by taking your weight in kilograms and dividing it
	 * by the square of your height in meters. The interpretation of BMI for
	 * people 20 years or older is as follows: BMI Interpretation
	 * 
	 * BMI < 18.5 18.5 ≤ BMI < 25.0 25.0 ≤ BMI < 30.0 30.0 ≤ BMI
	 * 
	 * Underweight Normal Overweight Obese
	 * 
	 * Write a program that prompts the user to enter a weight in pounds and
	 * height in inches and displays the BMI. Note that one pound is 0.45359237
	 * kilograms and one inch is 0.0254 meters. Listing 3.4 gives the program.
	 * 
	 * Enter weight in pounds: 146 Enter height in inches: 70 BMI is
	 * 20.948603801493316 Normal
	 */

	public double pounds, inches, BMI;
	public static double[] thresholdsBMI =
	{ 0, 18.5, 25.0, 30.0 };
	public static String[] stringBMI =
	{ "Underweight", "Normal", "Overweight", "Obese" };
	public String result, name;
	double meters = inches * 0.0254;
	double kilograms = pounds * 0.45359237;
	int age;
	// double BMI = kilograms / Math.pow(meters, 2);

	public String calculateResult()
	{
		for (int i = 0; i < 4; i++)
		{
			if (thresholdsBMI[i] < BMI)
				result = stringBMI[i];
		}
		return result;
	}

	public String getStatus()
	{
		return String.format("%s", calculateResult());
	}

	void main(String[] args)
	{

		// input
		System.out.printf("Enter weight in pounds: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		this.pounds = input.nextDouble();
		System.out.printf("Enter height in inches: ");
		inches = input.nextDouble();
		input.close();

		
		 
		meters = inches * 0.0254; 
		kilograms = pounds * 0.45359237; BMI = kilograms / Math.pow(meters, 2);
		for(int i = 0; i < 4; i++)
		{
			if(thresholdsBMI[i] < BMI) result =  stringBMI[i]; 
		}
		

		// output
		System.out.printf("BMI is %.15f\n%s", BMI, result);
	}
	
	public double getBMI()
	{
		return this.BMI;
	}

	public String getName()
	{
		return this.name;
	}
		
	public Listing_3_4__BMI(String setName, int age, double setWeight, double setHeight) {
		this.name = setName;
		this.age = age;
		this.inches = setHeight;
		this.pounds = setWeight;
		double meters = inches * 0.0254;
		double kilograms = pounds * 0.45359237;
		this.BMI = kilograms / Math.pow(meters, 2);
	}
	
	public Listing_3_4__BMI(String setName, double setWeight, double setHeight) {
		this.name = setName;
		this.inches = setHeight;
		this.pounds = setWeight;
		double meters = inches * 0.0254;
		double kilograms = pounds * 0.45359237;
		this.BMI = kilograms / Math.pow(meters, 2);
	}

}
