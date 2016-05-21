package chapter_6;

import java.util.Scanner;

/**
 * <h1>(Math: approximate the square root)</h1> There are several techniques for
 * implement- ing the sqrt method in the Math class. One such technique is known
 * as the Babylonian method. It approximates the square root of a number, n , by
 * repeatedly performing a calculation using the following formula:
 * 
 * nextGuess = (lastGuess + n / lastGuess) / 2
 * 
 * When nextGuess and lastGuess are almost identical, nextGuess is the
 * approximated square root. The initial guess can be any positive value (e.g.,
 * 1 ). This value will be the starting value for lastGuess . If the difference
 * between nextGuess and lastGuess is less than a very small number, such as
 * 0.0001 , you can claim that nextGuess is the approximated square root of n .
 * If not, next- Guess becomes lastGuess and the approximation process
 * continues. Imple- ment the following method that returns the square root of
 * n.
 * 
 * public static double sqrt(long n)
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-19
 *
 */

public class Exercise_6_22__ApproximateTheSquareRoot
{
	/** main method used for testing the sqrt function below */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("This program estimates a square root. \nPlease enter a whole number: ");
		System.out.printf("The approximate square root of that number is: %.4f", sqrt(input.nextLong()));		
		input.close();
	}
	/** Babylonian method to approximate the square root of a number */
	public static double sqrt(long n)
	{
		double lastGuess = 1;
		double nextGuess = (lastGuess + n / lastGuess) / 2;
		while (Math.abs(nextGuess - lastGuess) > 0.0001)
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		return lastGuess;
	}
}
