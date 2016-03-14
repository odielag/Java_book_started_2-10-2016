package chapter_3;

public class Exercise_3_18__CostOfShipping {
	
	/*
(Cost of shipping) A shipping company uses the following function to calcu-
late the cost (in dollars) of shipping based on the weight of the package (in
pounds).

3.5, if 0 < w <= 1
5.5, if 1 < w <= 3
8.5, if 3 < w <= 10
10.5, if 10 < w <= 20
error, if 20 < w <=50
"the package cannot be shipped.", if 50 < w

Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”
	 */

	public static void main(String[] args){
		
		// input
		double weight;
		String output = "Error: default output value ";
				
		System.out.println("Please enter the package weight in pounds: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		weight = input.nextDouble();
		input.close();
		
		// processing
		if (0 < weight && weight <= 1) output = "Shipping cost: $3.50 USD.";
		if (1 < weight && weight <= 3) output = "Shipping cost: $5.50 USD.";
		if (3 < weight && weight <= 10) output = "Shipping cost: $8.50 USD.";
		if (10 < weight && weight <= 20) output = "Shipping cost: $10.50 USD.";
		if (20 < weight && weight <= 50) output = "Error: Shipping cost unknown.";
		if (50 < weight && weight <= Double.MAX_VALUE) output = "The package cannot be shipped.";
		
		// output
		System.out.println(output);
	}
	
}

// Finished by William ODieLag Pennington on 3/14/2016;
