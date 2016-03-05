package chapter_3;

import java.util.Scanner;

public class Listing_3_5__ComputeTax {

	/*		EXAMPLE RESULT
	(0-single filer, 1-married jointly or qualifying widow(er),
	2-married separately, 3-head of household)
	Enter the filing status: 0
	Enter the taxable income: 400000
	Tax is 117683.5
	 */

	public static void main(String[] args) {

		int status;
		double tax = 0;
		double income;
		double[] taxRate = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
		long[][] single = new long[][]{
			{0, 8351, 33951, 82251, 171551, 372951}, 
			{8350, 33950, 82250, 171550, 372950, Long.MAX_VALUE}}; 
		long[][] joint = new long[][]{
			{0, 16701, 67901, 137051, 208851, 372951},
			{16700, 67900, 137050, 208850, 972950, Long.MAX_VALUE}};
		long[][] separately = new long[][]{
			{0, 8351, 33951, 68526, 104426, 186476},
			{8350, 33950, 68525, 104425, 186475, Long.MAX_VALUE}};
		long[][] head = new long[][]{
			{0, 11951, 45501, 117451, 190201, 372951},
			{11950, 45500, 117450, 190200, 372950, Long.MAX_VALUE}};

			// input
			System.out.printf("(0-single filer, 1-married jointly or qualifying widow(er),\n");
			System.out.printf("2-married separately, 3-head of household)\n");
			System.out.printf("Enter the filing status: ");
			Scanner input = new Scanner(System.in);
			status = input.nextInt();
			System.out.printf("Enter the taxable income: ");
			income = input.nextDouble();
			input.close();

			// processing
			switch (status) {
			case 0: 
				//Compute tax for single filers
				for(int i = 0; i < 6; i++){
					if(income > single[1][i]){
						tax += taxRate[i] * (single[1][i] - single[0][i]);
					}
					if(income <= single[1][i] && income > single[0][i]){
						tax += taxRate[i] * (income - single[0][i]);
					}
				}
				break;
			case 1: 
				//Compute tax for married filing jointly or qualifying widow(er)
				for(int i = 0; i < 6; i++){
					if(income > joint[1][i]){
						tax += taxRate[i] * (joint[1][i] - joint[0][i]);
					}
					if(income <= joint[1][i] && income > joint[0][i]){
						tax += taxRate[i] * (income - joint[0][i]);
					}
				}
				break;
			case 2: 
				//Compute tax for married filing separately
				for(int i = 0; i < 6; i++){
					if(income > separately[1][i]){
						tax += taxRate[i] * (separately[1][i] - separately[0][i]);
					}
					if(income <= separately[1][i] && income > separately[0][i]){
						tax += taxRate[i] * (income - separately[0][i]);
					}
				}
				break;
			case 3: 
				//Compute tax for head of household
				for(int i = 0; i < 6; i++){
					if(income > head[1][i]){
						tax += taxRate[i] * (head[1][i] - head[0][i]);
					}
					if(income <= head[1][i] && income > head[0][i]){
						tax += taxRate[i] * (income - head[0][i]);
					}
				}
				break;
			default: System.out.println("Error: invalid status");
			System.exit(1);
			}
			
			// output
			System.out.printf("Tax is %.2f", tax);
	}

}

// Finished by William ODieLag Pennington on Feb 29, 2016;