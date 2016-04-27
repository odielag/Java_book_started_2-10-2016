package testing;

//import java.util.Scanner;

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

		/*
		5.18a
			line 8 should read:
				while (i < 10);
			instead of:
				while (i < 10)

		5.18b
			line 3 should read:
				for (int i = 0; i < 10; i++)
			instead of"
				for (int i = 0; i < 10; i++);
		 */


		/*
		for (int i = 1; i < 5; i++) {
			int j = 0;
			while (j < i) {
				System.out.print(j + " ");
				j++;
			}
		}
		 */
		//0 0 1 0 1 2 0 1 2 3 

		/*
		int i = 0;
		while (i < 5) {
			for (int j = i; j > 1; j--)
				System.out.print(j + " ");
			System.out.println("****");
			i++;
		}
		 */
		/*	//expected results
		 ****
		 ****
		2 ****
		3 2 ****
		4 3 2 ****
		 */	// I was correct!

		/*
		int i = 5;
		while (i >= 1) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "xxx");
				num *= 2;
			}

			System.out.println();
			i--;
		}
		 */
		/*
		1xxx2xxx4xxx8xxx16xxx
		1xxx2xxx4xxx8xxx
		1xxx2xxx4xxx
		1xxx2xxx
		1xxx

		 */		// I was correct!
		/*
		int i = 1;
		do {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "G");
				num += 2;
			}

			System.out.println();
			i++;
		} while (i <= 5);
		 */
		/*
		1G
		1G3G
		1G3G5G
		1G3G5G7G
		1G3G5G7G9G

		 */		// I was wrong. Wasn't num being multiplied... was being added. (changing).

		/*
		int balance = 10;
		while (true)
		{
			if (balance < 9)
				break;
			balance = balance - 9;
		}
		System.out.println("Balance is "
				+ balance);
		 */
		// My guess: "Balance is 1".	// I was correct!

		/*
		int balance = 10;
		while (true) {
			if (balance < 9)
				continue;
			balance = balance - 9;
		}
		System.out.println("Balance is " + balance);
		 */
		// Infinite loop. error says "Unreachable code"

		/*
		//5.27a Show the output
		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 4; j++)
			{
				if (i * j > 2)
					break;
				System.out.println(i * j);
			}
			System.out.println(i);
		}
		*/
		// My guess of output: I was wrong... correcting
		/*
		1
		2
		1
		2
		2
		3
		
		 */
		
		//5.27b Show the output.
		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 4; j++)
			{
			if (i * j > 2)
			continue;
			System.out.println(i * j);
			}
			System.out.println(i);
		}
		
		// My guess of output: I was correct.
		/*
		1
		2
		1
		2
		2
		3
		
		 */
	}
}
