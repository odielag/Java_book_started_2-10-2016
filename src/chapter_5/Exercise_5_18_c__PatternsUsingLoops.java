package chapter_5;

public class Exercise_5_18_c__PatternsUsingLoops
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 6; i++)
		{
			for (int k = 0; k < i; k++)
				System.out.print("  ");
			for (int j = 1; j < 7 - i; j++)
				System.out.printf("%-2d", j);
			System.out.println();
		}
	}
}
