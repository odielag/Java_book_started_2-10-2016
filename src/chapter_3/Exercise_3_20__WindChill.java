package chapter_3;

public class Exercise_3_20__WindChill {
	
	/*
(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
to compute the wind-chill temperature. The formula is valid for temperatures in
the range between −58oF and 41oF and wind speed greater than or equal to 2 .
Write a program that prompts the user to enter a temperature and a wind speed.
The program displays the wind-chill temperature if the input is valid; otherwise,
it displays a message indicating whether the temperature and/or wind speed is
invalid.
	 */


		
	public static void main(String[] args) {
				
		// input
		double twc; // The wind chill temperature in Fehrenheit
		double to; // temperature outside measured in degrees Fahrenheit
		double v; // Wind velocity in mph
		String output = "";
		
		System.out.printf("Enter the temperature in Fahrenheit between -58°F and 41°F\n");
		java.util.Scanner input = new java.util.Scanner(System.in);
		to = input.nextDouble();
		System.out.printf("Enter the wind speed (>=2) in miles per hour: ");
		v = input.nextDouble();
		input.close();
		
		// processing
		twc = 35.74 + 0.6215 * to - 35.75 * Math.pow(v, 0.16) + 0.4275 * to * Math.pow(v, 0.16);
		
		if((to < -58 || to > 41) && v < 2)
			output = "The temperature and the wind speed is invalid.";
		else if(to < -58 || to > 41)
			output = "The temperature is invalid.";
		else if(v < 2)
			output = "The wind speed is invalid.";
		else output = String.format("The wind chill index is %.5f", twc);
		
		// output
		System.out.println(output);
		
	}

}
	
// Finished by William ODieLag Pennington on 3/14/2016;