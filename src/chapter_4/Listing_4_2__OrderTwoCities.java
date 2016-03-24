package chapter_4;

public class Listing_4_2__OrderTwoCities {
	
	/*
Listing 4.2 gives a program that prompts the user to enter two cities and displays them in
alphabetical order.
	 */
	
	public static void main(String[] args){
		
		// input
		String city0, city1;
		String output;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Please enter the name of the first city: ");
		city0 = input.nextLine();
		System.out.print("Please enter the name of the second city: ");
		city1 = input.nextLine();
		input.close();
		
		// processing
		if(city0.compareTo(city1) < 0) output = 
				String.format("The cities in alphabetical order are \"%s\" and \"%s\"", city0, city1);
		else output = 
				String.format("The cities in alphabetical order are \"%s\" and \"%s\"", city1, city0);
		
		// ourput
		System.out.println(output);
		
	}

}

// Completed by William ODieLag Pennington on 3/21/2016;