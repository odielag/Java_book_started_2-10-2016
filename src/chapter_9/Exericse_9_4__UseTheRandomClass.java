package chapter_9;

import java.util.Random;

/**
 * <h1>(Use the Random class)</h1> Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the
nextInt(100) method.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-8-4
 *
 */

public class Exericse_9_4__UseTheRandomClass
{
	public static void main(String[] args)
	{
		Random randomObject = new Random(1000);
		for(int i = 0; i < 50; i++)
		{
		System.out.println(randomObject.nextInt(100));
		}
	}
}
