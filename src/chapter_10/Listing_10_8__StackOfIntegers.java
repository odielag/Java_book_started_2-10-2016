package chapter_10;

import java.util.Arrays;

public class Listing_10_8__StackOfIntegers
{
	// An array to store integers in the stack.
	private int[] elements;
	
	// Constructs an empty stack with a default capacity of 16.
	public Listing_10_8__StackOfIntegers()
	{
		this(16);
	}
	
	public Listing_10_8__StackOfIntegers(int capacity)
	{
		elements = new int[capacity];
	}
	
	public boolean empty()
	{
		boolean isIntArrayEmpty = true;
		for(int i = 0; i < elements.length; i++)
		{
			if(elements[i] != 0)
				isIntArrayEmpty = false;
		}
		return isIntArrayEmpty;
	}
	
	public int peek()
	{
		return elements[elements.length - 1];
	}
	
	public void push(int value)
	{
		int[] elementsTemp = Arrays.copyOf(elements, elements.length + 1);
		elementsTemp[elementsTemp.length - 1] = value;
		elements = new int[elementsTemp.length];
		System.arraycopy(elementsTemp, 0, elements, 0, elementsTemp.length);
	}
	
	public int pop()
	{
		int pop = elements[elements.length - 1];
		int[] elementsTemp = Arrays.copyOf(elements, elements.length - 1);
		elements = new int[elementsTemp.length];
		System.arraycopy(elementsTemp, 0, elements, 0, elementsTemp.length);
		// does the length change the length of the elements array? no
		//System.out.println("\nElements length: " + elements.length);
		return pop;
	}
	
	public int getSize()
	{
		return elements.length;
	}
	
	/*
	public static void main(String[] args)
	{
		int[] someArray = new int[3];
		System.out.println(someArray[0]);
	}
	*/
	
}