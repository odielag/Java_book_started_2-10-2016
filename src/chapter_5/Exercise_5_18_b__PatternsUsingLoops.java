package chapter_5;

public class Exercise_5_18_b__PatternsUsingLoops
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 6; i++)
		{
			for (int j = 1; j <= 6 - i ; j++)
				System.out.printf("%-2d", j);
			System.out.println();
		}
	}
}
