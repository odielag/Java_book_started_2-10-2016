package chapter_10;

import chapter_3.Listing_3_4__BMI;

public class Listing_10_3__UseBMIClass
{
	public static void main(String[] args)
	{
		Listing_3_4__BMI bmi1 = new Listing_3_4__BMI("Kim Yang", 18, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is "
				+ bmi1.getBMI() + " " + bmi1.getStatus());
	
		Listing_3_4__BMI bmi2 = new Listing_3_4__BMI("Susan King", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is "
				+ bmi2.getBMI() + " " + bmi2.getStatus());
	}
	
}
