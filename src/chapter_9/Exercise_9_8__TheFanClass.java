package chapter_9;

/**
 * <h1>(The Fan class)</h1> Design a class named Fan to represent a fan. The class
 * contains:
 * 
 * Three constants named SLOW , MEDIUM , and FAST with the values 1 , 2 , and 3
 * to denote the fan speed.
 * 
 * A private int data field named speed that specifies the speed of the fan (the
 * default is SLOW ).
 * 
 * A private boolean data field named on that specifies whether the fan is on
 * (the default is false ).
 * 
 * A private double data field named radius that specifies the radius of the fan
 * (the default is 5 ).
 * 
 * A string data field named color that specifies the color of the fan (the
 * default is blue ).
 * 
 * The accessor and mutator methods for all four data fields.
 * 
 * A no-arg constructor that creates a default fan.
 * 
 * A method named toString() that returns a string description for the fan. If
 * the fan is on, the method returns the fan speed, color, and radius in one
 * com- bined string. If the fan is not on, the method returns the fan color and
 * radius along with the string “fan is off” in one combined string.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Fan objects. Assign maximum speed, radius 10 , color
 * yellow , and turn it on to the first object. Assign medium speed, radius 5 ,
 * color blue , and turn it off to the second object. Display the objects by
 * invoking their toString method.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-8-17
 */

public class Exercise_9_8__TheFanClass
{
	public static void main(String[] args)
	{
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());
		
		Fan fan2 = new Fan();
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println(fan2.toString());
	}
}

class Fan
{
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;	// SLOW = 1, MEDIUM = 2, FAST = 3
	private boolean on = false;
	private double radius = 5;
	private String color = "blue"; 
	
	public Fan()
	{
		
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int newSpeed)
	{
		speed = newSpeed;
	}
	
	public boolean getOn()
	{
		return on;
	}
	
	public void setOn(boolean onCondition)
	{
		this.on = onCondition;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String newColor)
	{
		color = newColor;
	}
	
	public String toString()
	{
		return ((on) ? String.format("Fan Speed\t%d\nColor\t\t%s\nRadius\t\t%f", 
					this.speed, this.color, this.radius) :	
						String.format("Color\t\t%s\nRadius\t\t%f\nfan is off", 
					this.color, this.radius));
		
	}
}
