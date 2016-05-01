package chapter_5;

/**
 * 
 * <h1>(Conversion from miles to kilometers)</h1>
 * Write a program that displays the following two tables side by side:
 * 	        											    
Miles		Kilometers	|	Kilometers		Miles	
1			1.609		|	20				12.430
2			3.218		|	25				15.538
...											
9			14.481		|	60				37.290
10			16.090		|	65				40.398
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-4-30
 */

public class Exercise_5_6__MilesToKilometers
{
	public static void main(String[] args)
	{
		System.out.printf("%-12s%-12s %s   %-12s%-12s\n", 
				"Miles", "Kilometers", "|", "Kilometers", "Miles");
		int miles = 1;
		int kilometers = 20;
		while (miles <= 10)
		{
			System.out.printf("%-12s%-12.3f %s   %-12d%-12.3f\n", 
					miles, (double)miles * 1.609, "|", 
					kilometers, (double)kilometers / 1.609);
			miles++;
			kilometers = kilometers + 5;
		}
	}
}
