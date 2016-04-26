package chapter_5;

import java.util.Scanner;

public class Listing_5_10__FutureTuition
{
	
	/*
Suppose that the tuition for a university is $10,000 this year and tuition increases 7% every
year. In how many years will the tuition be doubled?

Tuition will be doubled in 11 years
Tuition will be $21048.52 in 11 years
	 */
	
	public static void main(String[] args)
	{
		// import
		Scanner input = new Scanner(System.in);
		double tuition = 10000;
		double tuitionAPR = 1.07;
		int years = 0;
		
		// processing
		for(;tuition <= 20000; tuition *= tuitionAPR)
		{
			years++;
		}
		
		// output
		System.out.println("Tuition will be doubled in " + years + " years");
		System.out.printf("Tuition will be $%.2f in %d years", tuition, years);
		input.close();
	}

}

// Completed on April 25 2016 by William ODieLag Pennington;
