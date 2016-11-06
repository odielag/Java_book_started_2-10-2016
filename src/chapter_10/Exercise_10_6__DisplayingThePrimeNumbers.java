package chapter_10;

/**
 * <h1>(Displaying the prime numbers)</h1> Write a program that displays all the prime
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class to
 * store the prime numbers (e.g., 2 , 3 , 5 , ... ) and retrieve and display
 * them in reverse order.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016.10.24
 *
 */

public class Exercise_10_6__DisplayingThePrimeNumbers
{
	public static void main(String[] args)
	{
		Exercise_10_6__DisplayingThePrimeNumbers test = new Exercise_10_6__DisplayingThePrimeNumbers(120);
		test.print();
	}

	Listing_10_8__StackOfIntegers integersStack = new Listing_10_8__StackOfIntegers(0);

	Exercise_10_6__DisplayingThePrimeNumbers(int highestNumberToCheck) {
		// To find if it's a prime number.
		for (int i = 2; i < highestNumberToCheck; i++)
		{
			for (int j = 2; j <= i; j++)
			{
				if (i == j)
				{
					integersStack.push(i);
				}
				if (i % j == 0 && i != j)
					break;
			}
		}
	}

	// To display all those prime numbers high to low.
	public void print()
	{
		while (!integersStack.empty())
		{
			System.out.printf("%d ", integersStack.pop());
		}
	}
}
