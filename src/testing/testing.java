package testing;

import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Integer.MAX_VALUE);

		//int n = 10000 * 10000 * 10000;
		//System.out.println("n is " + n);

		//float x = 1.0f;
		//System.out.println(x);
		/*
In Java, every floating-point number (any number with a decimal point) 
defaults to a double, which is more precise than a float. And by default, 
Java does not let you convert a double to a float because of the loss 
of precision.
		 */

		/*
		System.out.println(Math.pow(10, -14));
		System.out.println(Double.MIN_VALUE);
		 */
		// Got to page 85

		// Page 87
		/* 3.13
		int age = 16;
		if (age < 16)
			System.out.println
				("Cannot get a driver's license");
		if (age >= 16)
			System.out.println
				("Can get a driver's license");
		//Can get a driver's license
		 */

		/*
		// 3.14a
		int[] number = {14, 15, 30};
		for (int i = 0; i < 3; i++){
			if (number[i] % 2 == 0)
				System.out.println
					(number[i] + " is even");
			if (number[i] % 5 == 0)
				System.out.println
					(number[i] + " is multiple of 5");
		}
		 */

		/*
		// 3.14b
		int[] number = {14, 15, 30};
		for (int i = 0; i < 3; i++){
			if (number[i] % 2 == 0)
				System.out.println
					(number[i] + " is even");
			else
				System.out.println
					(number[i] + " is multiple of 5");
		}
		// The result of 1.14b is not correct
		 */

		//System.out.println(Long.MAX_VALUE);

		/*
		int x = 0;
		if (x < 100) && (x > 10)
		  System.out.println("x is between 10 and 100");
		 */

		//System.out.print(Math.max(2.5, 3));

		//String s = "More than ten chars long";
		//System.out.printf("%10s", s);

		//System.out.println((int)(char)4);

		//	micro-percents-apr

		/*
		double i = 1.0000;
		while(i < 1.01){
			System.out.printf("When i = %.2f%%, APR = %.1f%%\n", 
					(i - 1) * 100, (Math.pow(i, 360) - 1) * 100);
			i += 0.0001;
		}
		 */

		//System.out.print("Basdfasd".compareTo("0asdfasdfdf"));
		//System.out.print("aoasef".compareTo("alkjasdf"));

		/*
		int i = 1;
		while (i < 10)
			if ((i++) % 2 == 0)
				System.out.println(i);
		 */

		/*
		Scanner input = new Scanner(System.in);
		int number, max;
		number = input.nextInt();
		max = number;
		while (number != 0) {
			number = input.nextInt();
			if (number > max)
				max = number;
		}
		System.out.println("max is " + max);
		System.out.println("number " + number);
		 */

		/*
		int x = 80000000;
		while (x > 0)
			x++;
		System.out.println("x is " + x);
		 */

		/*
		int i;
		for (i = 0; i < 5; ++i)
		{
			System.out.println(i);
		}
		System.out.println(i);
		 */

		/*
		int sum = 0;
		for (int i = 0; i < 10; ++i) {
			sum += i;
			}
		System.out.println(sum);

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number then a space or enter key to continue");
		String pause = input.next();

		sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
			}
		System.out.println(sum);
		 */

		/*
	Check Point 5.9 What are the three parts of a for loop control?
control variable
continue condition
control variable iterration
(my guesses)

answers:
initial-action
loop-continuation-condition
action-after-each-iteration
		 */
		
		/*
		for ( ; ; )
		{
			System.out.println("Testing...");
		}
		 */ // yep, looped forever.
		
		/*
		int count = 0;
		int n = 100;
		while (count < n)
		{
			count++;
		}
		System.out.println(count);
		// output: 100
		*/
		
		/*
		int n = 100;
		for (int count = 0; count <= n; count++)
		{
			System.out.println(count);
		}
		// outputish: 100
		*/
		
		/*
		int count = 5;
		int n = 100;
		while (count < n)
		{
			count++;
		}
		// my guess... count = 100
		System.out.println(count);
		// yep
		*/
		
		/*		
		int count = 5;
		int n = 100;
		while (count < n)
		{
			count += 3;
		}
		// I think count will be at 98 when the loop ends.
		System.out.println(count);
		// I was wrong, it is 101 : ).
		*/
		
		
	}

}
