package chapter_5;

public class CheckPoint_5_13 {
	
	/*
Convert the following for loop statement to a while loop and to a do-while loop:

long sum = 0;
for (int i = 0; i <= 1000; i++)
sum = sum + i;
	 */
	
	public static void main(String[] args)
	{
		long sum = 0;
		int i = 0;
		while (i <= 1000)
		{
			++sum;
			i++;
		}
		// now for the do-while loop.
		
		sum = 0;
		i = 0;
		do
		{
			++sum;
			i++;
		} while (i <= 1000);
	}
}
// Completed on 4/21/2016;