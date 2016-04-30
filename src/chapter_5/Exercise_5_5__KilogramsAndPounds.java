package chapter_5;

/**
 * 
 * <h1>(Conversion from kilograms to pounds and pounds to kilograms)</h1> 
 * Write a program that displays the following two tables side by side:
Kilograms   Pounds		|		Pounds		Kilograms
1			2.2			|		20			9.09
3			6.6			|		25			11.36
...
197			433.4		|		510			231.82
199			437.8		|		515			234.09
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-4-30
 */

public class Exercise_5_5__KilogramsAndPounds
{
	public static void main(String[] args)
	{
		System.out.printf("%-10s%-10s    %-10s%-10s%-10s\n", 
				"Kilograms", "Pounds", "|", "Pounds", "Kilograms");
		int i = 1;
		int j = 20;
		while (i < 200)
		{
			System.out.printf("%-10d%-10.1f    %-10s%-10d%-10.2f\n", 
					i, (double)i * 2.2, "|", j, (double)j / 2.2);
			i = i + 2;
			j = j + 5;
		}
	}
}
