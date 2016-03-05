package chapter_3;

public class CheckPoint_3_34__ {
	
	/*
Rewrite the following if statements using the conditional operator.

if (ages >= 16)
ticketPrice = 20;
else
ticketPrice = 10;
	 */
	
	/*	
	public static void main(String[] args){
	
		// input
		int ages, ticketPrice;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Please input the age: ");
		ages = input.nextInt();
		input.close();

		// processing
		ticketPrice = (ages >= 16) ? 20 : 10;
		
		// output
		System.out.printf("For age %d the ticket price is: %d", ages, ticketPrice);
		
		
	}
	*/
	
	public static void main(String[] args){
		
		// input
		int ages, ticketPrice;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Please input the age: ");
		ages = input.nextInt();
		input.close();

		// processing
		ticketPrice = (ages >= 16) ? 20 : 10;
		
		// output
		System.out.printf("For age %d the ticket price is: %d", ages, ticketPrice);
		
		
	}

}

// Finished by William ODieLag Pennington on 3/4/2016;