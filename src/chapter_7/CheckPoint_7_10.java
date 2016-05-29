package chapter_7;

/**
 * Identify and fix the errors in the following code:
 * 
 * public class Test {
 * 
 * public static void main(String[] args) {
 * 
 * double[100] r;
 * 
 * for (int i = 0; i < r.length(); i++);
 * 
 * r(i) = Math.random * 100;
 * 
 * }
 * 
 * }
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-29
 *
 */

public class CheckPoint_7_10
{
	public static void main(String[] args)
	{
		double[] r = new double[100];
		for (int i = 0; i < r.length; i++)
		{
			r[i] = (int)(Math.random() * 100);
		}
	}
}
