package chapter_6;

/**
 * Listing 6.9 is a program that creates three methods. The first finds the
 * maximum integer, the second finds the maximum double, and the third finds the
 * maximum among three double values. All three methods are named max .
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-5-13
 *
 */

public class Listing_6_9__TestMethodOverloading
{
	public static void main(String[] args)
	{
		// Invoke the max method with int parameters
		System.out.println("The maximum of 3 and 4 is "
		+ max(3, 4));
		// Invoke the max method with the double parameters
		System.out.println("The maximum of 3.0 and 5.4 is "
		+ max(3.0, 5.4));
		// Invoke the max method with three double parameters
		System.out.println("The maximum of 3.0, 5.4, and 10.14 is "
		+ max(3.0, 5.4, 10.14));
	}
	
	public static int max(int i1, int i2)
	{
		if (i1 >= i2)
			return i1;
		else
			return i2;
	}
	
	public static double max(double d1, double d2)
	{
		if (d1 >= d2)
			return d1;
		else
			return d2;
	}
	
	public static double max(double d0, double d1, double d2)
	{
		return max(max(d0, d1), d2);
	}
}
