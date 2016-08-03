package chapter_9;

/**
 * <h1>(The Stock class)</h1> Following the example of the Circle class in Section 9.2,
 * design a class named Stock that contains:
 * 
 * A string data field named symbol for the stock’s symbol.
 * 
 * A string data field named name for the stock’s name.
 * 
 * A double data field named previousClosingPrice that stores the stock price
 * for the previous day.
 * 
 * A double data field named currentPrice that stores the stock price for the
 * current time.
 * 
 * A constructor that creates a stock with the specified symbol and name.
 * 
 * A method named getChangePercent() that returns the percentage changed from
 * previousClosingPrice to currentPrice .
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates a Stock object with the stock symbol ORCL , the name
 * Oracle Corporation , and the previous closing price of 34.5 . Set a new
 * current price to 34.35 and display the price-change percentage.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-8-2
 *
 */

public class Exercise_9_2__TheStockClass
{
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Exercise_9_2__TheStockClass(String name, String symbol)
	{
		this.name = name;
		this.symbol = symbol;
	}
	
	public double getChangePercent()
	{
		return this.currentPrice / this.previousClosingPrice;
	}

	public static void main(String[] args)
	{
		Exercise_9_2__TheStockClass Stock = new Exercise_9_2__TheStockClass("Oracle Corporation", "ORCL");
		Stock.previousClosingPrice = 34.5;
		Stock.currentPrice = 34.35;
	}
}