package chapter_9;

public class Exercise_9_11__LinearEquations
{
	private double a, b, c, d, e, f;
	
	public Exercise_9_11__LinearEquations(double setA, double setB, double setC, double setD, double setE, double setF)
	{
		this.a = setA;
		this.b = setB;
		this.c = setC;
		this.d = setD;
		this.e = setE;
		this.f = setF;
	}
	
	public void setA(double setA)
	{
		this.a = setA;
	}
	
	public void setB(double setB)
	{
		this.b = setB;
	}
	
	public void setC(double setC)
	{
		this.c = setC;
	}
	
	public void setD(double setD)
	{
		this.d = setD;
	}
	
	public void setE(double setE)
	{
		this.e = setE;
	}
	
	public void setF(double setF)
	{
		this.f = setF;
	}
	
	public double getA()
	{
		return this.a;
	}
	
	public double getB()
	{
		return this.b;
	}
	
	public double getC()
	{
		return this.c;
	}
	
	public double getD()
	{
		return this.d;
	}
	
	public double getE()
	{
		return this.e;
	}
	
	public double getF()
	{
		return this.f;
	}
	
	public boolean isSolvable()
	{
		return (a * d - b * c != 0);
	}
	
	public double getX()
	{
		return (e * d - b * f) / (a * d - b * c);
	}
	
	public double getY()
	{
		return (a * f - e * c) / (a * d - b * c);
	}
}
