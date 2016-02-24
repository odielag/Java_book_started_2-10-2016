package chapter_2;

public class Exercise_2_18__Tables {
	
	/*
(Print a table) Write a program that displays the following table. Cast floating-
point numbers into integers.

a		b		pow(a, b)
1		2		1
2		3		8
3		4		81
4		5		1024
5		6		15625

	 */

	public static void main(String[] args) {
		
		// input
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 3, 4, 5, 6};
		
		// processing
		
		// output		
		for(int i = 0; i < 5; i++){
			System.out.printf("%d\t%d\t%d\n", a[i], b[i], (int)(Math.pow(a[i], b[i])));
		}
		
	}

}

// Finished by William ODieLag Pennington