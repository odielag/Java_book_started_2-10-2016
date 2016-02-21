package chapter_2;

public class Exercise2_1__ConvertCelsiusToFahrenheit {
	
	/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
Hint: In Java, 9 / 5 is 1 , but 9.0 / 5 is 1.8 .
Here is a sample run:
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("\nPlease input celsius value: \t");
		double celsius = input.nextShort();
		double fahrenheit;
		fahrenheit = 9.0 / 5 * celsius + 32;
		celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.printf("\n%f celsius is %f fahrenheit.", celsius, fahrenheit);
		input.close();
	}

}

//finished. Seems to work. ~William ODieLag Pennington