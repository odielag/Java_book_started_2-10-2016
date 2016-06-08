package chapter_7;

// copied from book

public class Listing_7_6__LinearSearch
{
	// empty main method
	public static void main(String[] args)
	{

	}

	/** The method for finding a key in the list */
	public static int linearSearch(int[] list, int key)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (key == list[i])
				return i;
		}
		return -1;
	}
}
