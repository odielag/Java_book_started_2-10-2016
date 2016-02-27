package chapter_3;

import java.util.Scanner;

public class CheckPoint_3_8__ {

	public static void main(String[] args) {
		
		double x, y, z;
		
		// input
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the value of x: ");
		x = input.nextDouble();
		System.out.printf("Please enter the value of y: ");
		y = input.nextDouble();
		input.close();
		
		// processing
		if (x > 2){
			if (y > 2){
				z = x + y;
				System.out.println("z is " + z);
			}
		}
		else
			System.out.println("x is " + x);
		
		
		// output

	}

}
