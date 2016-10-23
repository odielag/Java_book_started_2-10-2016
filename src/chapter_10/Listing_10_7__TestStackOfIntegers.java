package chapter_10;

import chapter_10.Listing_10_8__StackOfIntegers;

public class Listing_10_7__TestStackOfIntegers
{
	public static void main(String[] args)
	{
		Listing_10_8__StackOfIntegers stack = new Listing_10_8__StackOfIntegers();
		for(int i = 0; i < 10; i++)
			stack.push(i);
		
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
