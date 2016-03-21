package chapter_3;

public class Exercise_3_33__CompareCosts {
	
	/*
(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price. Here is a sample run:

Enter weight and price for package 1: 50 24.59
Enter weight and price for package 2: 25 11.99
Package 2 has a better price.

Enter weight and price for package 1: 50 25
Enter weight and price for package 2: 25 12.5
Two packages have the same price.
	 */
	
	public static void main(String[] args){
		
		// input
		double p1w, p1p, p1v;		// package 1 weight, price and value;
		double p2w, p2p, p2v;
		String output;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		p1w = input.nextDouble();
		p1p = input.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		p2w = input.nextDouble();
		p2p = input.nextDouble();
		input.close();
		
		// processing
		p1v = p1w / p1p;
		p2v = p2w / p2p;
		
		if(p1v > p2v){
			output = "Package 1 has a better price.";
		}
		else if(p2v > p1v){
			output = "Package 2 has a better price.";
		}
		else if(p1v == p2v){
			output = "Two packages have the same price.";
		}
		else {
			output = "\nUhoh, something happened.";
		}
		// output
		System.out.print(output);
		
	}

}
