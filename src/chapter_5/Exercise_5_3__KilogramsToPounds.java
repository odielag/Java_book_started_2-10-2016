package chapter_5;


/*
 * <h1>(Conversion from kilograms to pounds)</h1>
 *  Write a program that displays the follow-
ing table (note that 1 kilogram is 2.2 pounds):

<i>Kilograms	Pounds
1			2.2
3			6.6
...			
197			433.4
199			437.8
<i>

@author William ODieLag Pennington
@version 1.0
@since 2016-4-30
 */

public class Exercise_5_3__KilogramsToPounds {
	
	public static void main(String[] args)
	{
		System.out.printf("%-10s%-10s\n", "Kilograms", "Pounds");
		for (int i = 1; i < 200; i++)
		{
			System.out.printf("%-10d%-10.1f\n", i, (double)i * 2.2);
		}
	}

}
