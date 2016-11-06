package chapter_10;

/**
 * <h1>My Point</h1>
 * A class for storing the point and it's x and y coordinates.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016.10.23
 *
 */

public class Exercise_10_4__MyPoint
{
	public static void main(String[] args)
	{
		Exercise_10_4__MyPoint zeroes = new Exercise_10_4__MyPoint(0, 0);
		Exercise_10_4__MyPoint somethings = new Exercise_10_4__MyPoint(10, 30.5);
		System.out.println(somethings.distance(zeroes));
		System.out.println(somethings.distance(0, 0));
		System.out.println(Math.sqrt(Math.pow(30.5, 2) + Math.pow(10, 2)));
	}
	
	private double x, y;
	
	public Exercise_10_4__MyPoint()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public Exercise_10_4__MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double distance(Exercise_10_4__MyPoint other)
	{
		return Math.sqrt(Math.pow(other.getX() - this.getX(), 2) + Math.pow(other.getY() - this.getY(), 2));
	}
	
	public double distance(double x, double y)
	{
		return Math.sqrt(Math.pow(x - this.getX(), 2) + Math.pow(y - this.getY(), 2));
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
}
