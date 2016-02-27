package chapter_3;

import java.util.Scanner;

public class Listing_3_2__SimpleIfDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter an integer: ");
		int number = input.nextInt();
		
		if (number % 5 == 0)
			System.out.printf("HiFive\n");
		
		if (number %2 == 0)
			System.out.printf("HiEven\n");
				
		input.close();

	}

}
