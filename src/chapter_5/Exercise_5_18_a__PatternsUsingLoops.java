package chapter_5;

public class Exercise_5_18_a__PatternsUsingLoops
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.printf("%-2d", j);
			System.out.println();
		}
	}
}
