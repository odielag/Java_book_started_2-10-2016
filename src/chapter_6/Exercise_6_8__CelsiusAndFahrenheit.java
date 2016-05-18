package chapter_6;

/**
 * <h1>(Conversions between Celsius and Fahrenheit)</h1> 
 * Write a class that contains the following two methods:


public static double celsiusToFahrenheit(double celsius)


public static double fahrenheitToCelsius(double fahrenheit)

The formula for the conversion is:
fahrenheit = (9.0 / 5) * celsius + 32
celsius = (5.0 / 9) * (fahrenheit – 32)

Write a test program that invokes these methods to display the following tables:
	
Celsius Fahrenheit | Fahrenheit Celsius
40.0    104.0      | 120.0      48.89
39.0    102.2      | 110.0      43.33
...
32.0    89.6       | 40.0       4.44
31.0    87.8       | 30.0       -1.11
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-18
 *
 */

public class Exercise_6_8__CelsiusAndFahrenheit
{
	public static void main(String[] args)
	{
		System.out.printf("%-12s%-12s | %-12s%-12s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		for (double i = 40.0, j = 120.0; i > 30; i--, j -= 10)
			System.out.printf("%-12.1f%-12.1f | %-12.1f%-12.2f\n", 
					i, celsiusToFahrenheit(i), 
					j, fahrenheitToCelsius(j));
	}

	public static double celsiusToFahrenheit(double celsius)
	{
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
