package chapter_2;

public class Exercise_2_17__WindChill {
	
	/*
(Science: wind-chill temperature) How cold is it outside? The temperature alone
is not enough to provide the answer. Other factors including wind speed, rela-
tive humidity, and sunshine play important roles in determining coldness outside.
In 2001, the National Weather Service (NWS) implemented the new wind-chill
temperature to measure the coldness using temperature and wind speed. The
formula is

twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);

where t a is the outside temperature measured in degrees Fahrenheit and v is the
speed measured in miles per hour. t wc is the wind-chill temperature. The formula
cannot be used for wind speeds below 2 mph or temperatures below -58 oF or
above 41oF.
Write a program that prompts the user to enter a temperature between -58 F and
41 F and a wind speed greater than or equal to 2 and displays the wind-chill tem-
perature. Use Math.pow(a, b) to compute v 0.16 . Here is a sample run:

Enter the temperature in Fahrenheit between -58°F and 41°F:
5.3
Enter the wind speed (>=2) in miles per hour: 6
The wind chill index is -5.56707
	 */

	private static double twc; // The wind chill temperature in Fehrenheit
	private static double ta; // outside temperature measured in degrees Fahrenheit
	private static double v; // Wind velocity in mph
		
	public static void main(String[] args) {
		
		// input
		System.out.printf("Enter the temperature in Fahrenheit between -58°F and 41°F\n");
		java.util.Scanner input = new java.util.Scanner(System.in);
		ta = input.nextDouble();
		System.out.printf("Enter the wind speed (>=2) in miles per hour: ");
		v = input.nextDouble();
		input.close();
		
		// processing
		twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
		
		// output
		System.out.printf("The wind chill index is %.5f", twc);
		
	}

}

// Finished by William ODieLag Pennington