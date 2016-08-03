package chapter_9;

public class Listing_9_8__CircleWithPrivateDataFields
{
	private double radius = 1;
	private static int numberOfObjects = 0;
	
	public Listing_9_8__CircleWithPrivateDataFields()
	{
		numberOfObjects++;
	}
	
	public Listing_9_8__CircleWithPrivateDataFields(double newradius)
	{
		radius = newradius;
		++numberOfObjects;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius)
	{
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public static void main(String[] args)
	{
		Listing_9_8__CircleWithPrivateDataFields myCircle = new Listing_9_8__CircleWithPrivateDataFields();
		System.out.println("Radius is " + myCircle.radius);
	}
}
