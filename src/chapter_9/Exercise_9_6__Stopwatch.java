package chapter_9;

/**
 * (Stopwatch) Design a class named StopWatch . The class contains:
 * 
 * Private data fields startTime and endTime with getter methods.
 * 
 * A no-arg constructor that initializes startTime with the current time.
 * 
 * A method named start() that resets the startTime to the current time.
 * 
 * A method named stop() that sets the endTime to the current time.
 * 
 * A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-8-4
 *
 */

class Stopwatch
{
	private long startTime = System.currentTimeMillis();
	private long endTime = startTime;

	public Stopwatch() {
		this.startTime();
	}

	public long startTime()
	{
		return this.startTime;
	}

	public long endTime()
	{
		return this.endTime;
	}

	public void start()
	{
		this.startTime = System.currentTimeMillis();
	}

	public void stop()
	{
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime()
	{
		return this.endTime - this.startTime;
	}
}

public class Exercise_9_6__Stopwatch
{
	public static void main(String[] args)
	{
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();
		// make an array with 100000 elements of random numbers 0-99.
		int[] dumbarray = new int[100000];
		for (int i = 0; i < dumbarray.length; i++)
		{
			dumbarray[i] = (int) (Math.random() * 100);
		}
		// use selectionsort to arrange the elements of that array.
		selectionSort(dumbarray);
		/*
		 * // making temp array output for checking purposes. for(int
		 * i:dumbarray) { System.out.println(i); }
		 */
		stopwatch.endTime();
		System.out.println("start time and end time: " + stopwatch.startTime() + " and " + stopwatch.endTime());
		System.out.println("Elapsed time: " + stopwatch.getElapsedTime());
	}

	public static void selectionSort(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			int lowestArray = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] < array[lowestArray])
					lowestArray = j;
			}
			int temp = array[i];
			array[i] = array[lowestArray];
			array[lowestArray] = temp;
		}
	}

}
