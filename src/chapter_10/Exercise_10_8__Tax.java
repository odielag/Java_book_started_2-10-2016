package chapter_10;

import java.util.Scanner;

public class Exercise_10_8__Tax
{
	// instructions on page 402
	// Table 3.2 on page 91

	/**
	 * <h1>Tax</h1>
	 * 
	 * instructions on page 402
	 * 
	 * Table 3.2 on page 90
	 * 
	 * @author William ODieLag Pennington
	 * @since 2016-10-25
	 * @version 0.8
	 */

	public static void main(String[] args)
	{
		// Exercise_10_8__Tax phil = new Exercise_10_8__Tax();
		// System.out.println(phil.getTax2001());

		// Test program that uses the Tax class to print 2001 and 1009 tax
		// tables for taxable income from 50000 to 60000 with intervals
		// of 1000 for all four statuses.
		Exercise_10_8__Tax test = new Exercise_10_8__Tax();
		System.out.printf("%-10s%-20s%-20s%-20s%-20s", "Income", "Single Filers", "Married Joint", "Married Separately",
				"Head of Household");
		System.out.println();
		System.out.printf("%-10s", "");
		for (int i = 0; i < 4; i++)
			System.out.printf("%-10s%-10s", "2001", "2009");
		System.out.println();
		for (int i = 0; i <= 10; i++)
		{
			test.setTaxableIncome(50000 + i * 1000);
			System.out.printf("%-10.0f", test.getTaxableIncome());
			for (int j = 0; j < 4; j++)
			{
				test.setFilingStatus(j);
				System.out.printf("%-10.2f%-10.2f", test.getTax2001(), test.getTax2009());
			}
			System.out.println();
		}
	}

	int filingStatus;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	int[][][] brackets2001 =
	{ // [status][taxrateSegment][lowRange/highRange]
		// 15%, 27.5%, 30.5%, 35.5%, 39.1%
		// single filers
			{
					{ 0, 27050 },
					{ 27051, 65550 },
					{ 65551, 136750 },
					{ 136751, 297350 },
					{ 297351, Integer.MAX_VALUE } },
			// married jointly or qualifying widow(er)
			{
					{ 0, 45200 },
					{ 45201, 109250 },
					{ 109251, 166500 },
					{ 166501, 297350 },
					{ 297351, Integer.MAX_VALUE } },
			// married filing separately
			{
					{ 0, 22600 },
					{ 22601, 54625 },
					{ 54626, 83250 },
					{ 83251, 148675 },
					{ 148676, Integer.MAX_VALUE } },
			// head of household
			{
					{ 0, 36250 },
					{ 36251, 93650 },
					{ 93651, 151650 },
					{ 151651, 297350 },
					{ 297351, Integer.MAX_VALUE } }, };
	int[][][] brackets2009 =
	{ // [status][taxrateSegment][lowRange/highRange]
		// 10%, 15%, 25%, 28%, 33%, 35%
		// single filers
			{
					{ 0, 8350 },
					{ 8351, 33950 },
					{ 33951, 82250 },
					{ 82251, 171550 },
					{ 171551, 372950 },
					{ 372951, Integer.MAX_VALUE } },
			// married jointly or qualifying widow(er)
			{
					{ 0, 16700 },
					{ 16701, 67900 },
					{ 67901, 137050 },
					{ 137051, 208850 },
					{ 208851, 372950 },
					{ 372951, Integer.MAX_VALUE } },
			// married filing separately
			{
					{ 0, 8350 },
					{ 8351, 33950 },
					{ 33951, 68525 },
					{ 68526, 104425 },
					{ 104426, 186475 },
					{ 186476, Integer.MAX_VALUE } },
			// head of household
			{
					{ 0, 11950 },
					{ 11951, 45500 },
					{ 45501, 117450 },
					{ 117451, 190200 },
					{ 190201, 372950 },
					{ 372951, Integer.MAX_VALUE } }, };
	int[][][] bracketsCustom;
	double[] rates2001 =
	{ .15, .275, .305, .355, .391 };
	double[] rates2009 =
	{ .1, .15, .25, .28, .33, .35 };
	double[] ratesCustom;
	double taxableIncome;
	double tax2001;
	double tax2009;
	double taxCustom;
	int yearOfTaxation;
	boolean isTaxCustom = false;
	Scanner input = new Scanner(System.in);

	Exercise_10_8__Tax() {
		enterFilingStatus();
		enterTaxableIncome();
		calculateTax2001();
		calculateTax2009();
	}

	Exercise_10_8__Tax(int filingStatus, int[][][] brackets, double[] rates, double taxableIncome) {
		isTaxCustom = true;
		this.filingStatus = filingStatus;
		this.bracketsCustom = brackets;
		this.ratesCustom = rates;
		this.taxableIncome = taxableIncome;
		calculateTaxCustom();
	}

	public void enterFilingStatus()
	{
		System.out.println("Please enter your filing status...\n"
				+ "'0' for single filer. '1' for married jointly or qualifying widow(er)\n"
				+ "'2' for married filing separately and '3' for head of household.");
		filingStatus = input.nextInt();
	}

	public void enterTaxableIncome()
	{
		System.out.print("Please enter your taxable income:");
		this.taxableIncome = input.nextDouble();
	}

	private void calculateTax2001()
	{
		this.tax2001 = 0;
		for (int bracket = 0; bracket < rates2001.length; bracket++)
		{
			if (taxableIncome > brackets2001[filingStatus][bracket][1])
			{
				this.tax2001 += rates2001[bracket]
						* (brackets2001[filingStatus][bracket][1] - brackets2001[filingStatus][bracket][0]);
			} else if (taxableIncome <= brackets2001[filingStatus][bracket][1]
					&& taxableIncome >= brackets2001[filingStatus][bracket][0])
			{
				this.tax2001 += rates2001[bracket] * (taxableIncome - brackets2001[filingStatus][bracket][0]);
			} else if (taxableIncome < brackets2001[filingStatus][bracket][0])
			{
				break;
			} else
				System.out.println("Something went wrong with the calculateTax2001 method.");
		}

		// Why doesn't this stuff below work, yet the above stuff does.???
		/*
		 * int bracket = 0; do { // if the income is above the bracket range. if
		 * (taxableIncome > brackets2001[filingStatus][bracket][1]) {
		 * System.out.println("above the bracket range. bracket: " + bracket);
		 * this.tax2001 += rates2001[bracket]
		 * (brackets2001[filingStatus][bracket][1] -
		 * brackets2001[filingStatus][bracket][0]); } // if the income is within
		 * the bracket. if (taxableIncome <=
		 * brackets2001[filingStatus][bracket][1] && taxableIncome >=
		 * brackets2001[filingStatus][bracket][0]) { System.out.println(
		 * "within the bracket range. bracket: " + bracket); this.tax2001 +=
		 * rates2001[bracket] * (taxableIncome -
		 * brackets2001[filingStatus][bracket][0]); } bracket++; } while
		 * (taxableIncome <= brackets2001[filingStatus][bracket][1]);
		 */
	}

	public void calculateTax2009()
	{
		this.tax2009 = 0;
		for (int bracket = 0; bracket < rates2009.length; bracket++)
		{
			if (taxableIncome > brackets2009[filingStatus][bracket][1])
			{
				this.tax2009 += rates2009[bracket]
						* (brackets2009[filingStatus][bracket][1] - brackets2009[filingStatus][bracket][0]);
			} else if (taxableIncome <= brackets2009[filingStatus][bracket][1]
					&& taxableIncome >= brackets2009[filingStatus][bracket][0])
			{
				this.tax2009 += rates2009[bracket] * (taxableIncome - brackets2009[filingStatus][bracket][0]);
			} else if (taxableIncome < brackets2009[filingStatus][bracket][0])
			{
				break;
			} else
				System.out.println("Something went wrong with the calculateTax2009 method.");
		}
	}

	public void calculateTaxCustom()
	{
		this.taxCustom = 0;
		isTaxCustom = true;
		for (int bracket = 0; bracket < ratesCustom.length; bracket++)
		{
			if (taxableIncome > bracketsCustom[filingStatus][bracket][1])
			{
				this.taxCustom += ratesCustom[bracket]
						* (bracketsCustom[filingStatus][bracket][1] - bracketsCustom[filingStatus][bracket][0]);
			} else if (taxableIncome <= bracketsCustom[filingStatus][bracket][1]
					&& taxableIncome >= bracketsCustom[filingStatus][bracket][0])
			{
				this.taxCustom += ratesCustom[bracket] * (taxableIncome - bracketsCustom[filingStatus][bracket][0]);
			} else if (taxableIncome < bracketsCustom[filingStatus][bracket][0])
			{
				break;
			} else
				System.out.println("Something went wrong with the calculateTaxCustom method.");
		}
	}

	public double getTax2001()
	{
		return this.tax2001;
	}

	public double getTax2009()
	{
		return this.tax2009;
	}

	public double getTaxCustom()
	{
		return this.taxCustom;
	}

	public int getFilingStatus()
	{
		return this.filingStatus;
	}

	public void setFilingStatus(int filingStatus)
	{
		this.filingStatus = filingStatus;
		this.calculateTax2001();
		this.calculateTax2009();
		if (isTaxCustom)
			this.calculateTaxCustom();
	}

	public int[][][] getBrackets2001()
	{
		return this.brackets2001;
	}

	public int[][][] getBrackets2009()
	{
		return this.brackets2009;
	}

	public int[][][] getBracketsCustom()
	{
		return this.bracketsCustom;
	}

	public void setBrackets(int[][][] brackets)
	{
		this.bracketsCustom = brackets;
		this.calculateTaxCustom();
	}

	public double[] getRates2001()
	{
		return this.rates2001;
	}

	public double[] getRates2009()
	{
		return this.rates2009;
	}

	public double[] getRatesCustom()
	{
		return this.ratesCustom;
	}

	public void setTaxableIncome(double taxableIncome)
	{
		this.taxableIncome = taxableIncome;
		if (isTaxCustom)
			this.calculateTaxCustom();
		else
		{
			this.calculateTax2001();
			this.calculateTax2009();
		}
	}

	public double getTaxableIncome()
	{
		return this.taxableIncome;
	}
}
