package chapter_7;

/**
 * Write statements to do the following:
 * 
 * a. Create an array to hold 10 double values.
 * 
 * b. Assign the value 5.5 to the last element in the array.
 * 
 * c. Display the sum of the first two elements.
 * 
 * d. Write a loop that computes the sum of all elements in the array.
 * 
 * e. Write a loop that finds the minimum element in the array.
 * 
 * f. Randomly generate an index and display the element of this index in the
 * array.
 * 
 * g. Use an array initializer to create another array with the initial values
 * 3.5 , 5.5 , 4.52 , and 5.6 .
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-29
 *
 */

public class CheckPoint_7_8
{
	public static void main(String[] args)
	{
		//a. Create an array to hold 10 double values.
		double[] array = new double[10];
		//b. Assign the value 5.5 to the last element in the array.
		array[9] = 5.5;
		//c. Display the sum of the first two elements.
		System.out.printf("Sum of first two elements: %f\n", array[0] + array[1]);
		//d. Write a loop that computes the sum of all elements in the array.
		double sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		System.out.printf("The sum of all elements: %f\n", sum);
		//e. Write a loop that finds the minimum element in the array.
		double minElement = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(i < minElement)
				minElement = i;
		}
		System.out.printf("Minimum element: %f\n", minElement);
		//f. Randomly generate an index and display the element of this index in the array.
		int randIndex = (int)(Math.random() * array.length);
		System.out.printf("Element of a random index: %f\n", array[randIndex]);
		//g. Use an array initializer to create another array with the initial values
		// * 3.5 , 5.5 , 4.52 , and 5.6 .
		double[] anotherArray = {3.5, 5.5, 4.52, 5.6};
		System.out.print("Elements of another array: ");
		for(int i = 0; i < anotherArray.length; i++)
		{
			System.out.printf("%f ", anotherArray[i]);
		}
		
	}
}
