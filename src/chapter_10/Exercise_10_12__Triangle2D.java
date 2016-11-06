package chapter_10;

import java.awt.geom.Line2D;

public class Exercise_10_12__Triangle2D

/**
 * <h1>Triangle2D</h1>
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 */
{
	public static void main(String[] args)
	{
		/*
		 * Exercise_10_12__Triangle2D testTriangle = new
		 * Exercise_10_12__Triangle2D(); System.out.printf("Triangle Area: %f",
		 * testTriangle.getArea()); System.out.printf("\nTriangle Perimeter: %f"
		 * , testTriangle.getPerimeter()); testTriangle.setP1(0, 0);
		 * testTriangle.setP2(4, 8); testTriangle.setP3(8, 0);
		 * Exercise_10_4__MyPoint p = new Exercise_10_4__MyPoint(2, 3);
		 * System.out.printf("\ntestTriangle %s MyPoint p",
		 * testTriangle.contains(p) ? "Contains" : "Doesn't contain");
		 * p.setX(1.5); p.setY(5); System.out.printf(
		 * "\nJust changed x and y of p to 1.5 and 5 respectively.");
		 * System.out.printf("\ntestTriangle %s MyPoint p",
		 * testTriangle.contains(p) ? "Contains" : "Doesn't contain");
		 * Exercise_10_12__Triangle2D testTriangle2 = new
		 * Exercise_10_12__Triangle2D(2, 1, 4, 4, 6, 1); System.out.printf(
		 * "\ntestTriangle %s testTriangle2",
		 * testTriangle.contains(testTriangle2) ? "Contains" : "Doesn't contain"
		 * ); System.out.printf("\nTesting the points..."); System.out.printf(
		 * "\nIs point1 in testTriangle?: %b",
		 * testTriangle.contains(testTriangle2.p1)); System.out.printf(
		 * "\nIs point2 in testTriangle?: %b",
		 * testTriangle.contains(testTriangle2.p2)); System.out.printf(
		 * "\nIs point3 in testTriangle?: %b",
		 * testTriangle.contains(testTriangle2.p3));
		 */
		Exercise_10_12__Triangle2D triangle1 = new Exercise_10_12__Triangle2D(0, 0, 4, 0, 1, 5);
		Exercise_10_12__Triangle2D triangle2 = new Exercise_10_12__Triangle2D(0, 3, 2, 5, 4, 3);
		System.out.print(triangle1.overlaps(triangle2));

	}

	Exercise_10_4__MyPoint p1 = new Exercise_10_4__MyPoint();
	Exercise_10_4__MyPoint p2 = new Exercise_10_4__MyPoint();
	Exercise_10_4__MyPoint p3 = new Exercise_10_4__MyPoint();

	Exercise_10_12__Triangle2D() {
		this.setP1(0, 0);
		this.setP2(1, 1);
		this.setP3(2, 5);
	}

	Exercise_10_12__Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.setP1(x1, y1);
		this.setP2(x2, y2);
		this.setP3(x3, y3);
	}

	public double getArea()
	{
		double s = 0.5 * (this.p1.distance(p2) + this.p2.distance(p3) + this.p3.distance(p1));
		return Math.sqrt(s * (s - this.p1.distance(p2)) * (s - this.p2.distance(p3)) * (s - this.p3.distance(p1)));
	}

	public double getPerimeter()
	{
		return this.p1.distance(p2) + this.p2.distance(p3) + this.p3.distance(p1);
	}

	public boolean contains(Exercise_10_4__MyPoint p)
	{
		/*
		 * point p1(x1, y1); point p2(x2, y2); point p3(x3, y3);
		 * 
		 * point p(x,y); // <-- You are checking if this point lies in the
		 * triangle.
		 */
		double alpha = ((this.p2.getY() - this.p3.getY()) * (p.getX() - this.p3.getX())
				+ (this.p3.getX() - this.p2.getX()) * (p.getY() - this.p3.getY()))
				/ ((this.p2.getY() - this.p3.getY()) * (this.p1.getX() - this.p3.getX())
						+ (this.p3.getX() - this.p2.getX()) * (this.p1.getY() - this.p3.getY()));
		double beta = ((this.p3.getY() - this.p1.getY()) * (p.getX() - this.p3.getX())
				+ (this.p1.getX() - this.p3.getX()) * (p.getY() - this.p3.getY()))
				/ ((this.p2.getY() - this.p3.getY()) * (this.p1.getX() - this.p3.getX())
						+ (this.p3.getX() - this.p2.getX()) * (this.p1.getY() - this.p3.getY()));
		double gamma = 1.0f - alpha - beta;

		if (alpha > 0 && beta > 0 && gamma > 0)
			return true;
		else
			return false;
	}

	public boolean contains(Exercise_10_12__Triangle2D t)
	{
		if (this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3))
			return true;
		else
			return false;
	}

	public boolean overlaps(Exercise_10_12__Triangle2D t)
	{
		if (this.doesPerimeterIntersect(t) || this.contains(t) || t.contains(this))
			return true;
		else
			return false;
	}

	public boolean doesPerimeterIntersect(Exercise_10_12__Triangle2D t)
	{
		// I wish I knew how to test of 3 x 3 lines intersect without
		// repetition.

		Line2D a1 = new Line2D.Double(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
		Line2D a2 = new Line2D.Double(this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY());
		Line2D a3 = new Line2D.Double(this.p3.getX(), this.p3.getY(), this.p1.getX(), this.p1.getY());

		Line2D t1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
		Line2D t2 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());
		Line2D t3 = new Line2D.Double(t.p3.getX(), t.p3.getY(), t.p1.getX(), t.p1.getY());

		if (a1.intersectsLine(t1) || a1.intersectsLine(t2) || a1.intersectsLine(t3) || a2.intersectsLine(t1)
				|| a2.intersectsLine(t2) || a2.intersectsLine(t3) || a3.intersectsLine(t1) || a3.intersectsLine(t2)
				|| a3.intersectsLine(t3))
			return true;
		else
			return false;
	}

	public Exercise_10_4__MyPoint getP1()
	{
		return p1;
	}

	public Exercise_10_4__MyPoint getP2()
	{
		return p2;
	}

	public Exercise_10_4__MyPoint getP3()
	{
		return p3;
	}

	public void setP1(double x, double y)
	{
		this.p1.setX(x);
		this.p1.setY(y);
	}

	public void setP2(double x, double y)
	{
		this.p2.setX(x);
		this.p2.setY(y);
	}

	public void setP3(double x, double y)
	{
		this.p3.setX(x);
		this.p3.setY(y);
	}
}
