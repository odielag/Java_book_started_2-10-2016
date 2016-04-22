package chapter_5;

import java.util.Scanner;

public class CheckPoint_5_10 {

	/*
Suppose the input is 2 3 4 5 0 . What is the output of the following code?
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, sum = 0, count;
		for (count = 0; count < 5; count++) {
		number = input.nextInt();
		sum += number;
		}
		System.out.println("sum is " + sum);
		System.out.println("count is " + count);
		}

	/*
My guess...
2 3 4 5 0
sum is 14
count is 5
	 */
	
}
// I was correct! ... April 21/2016;