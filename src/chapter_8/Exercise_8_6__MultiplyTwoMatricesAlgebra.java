package chapter_8;

/**
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is:
 * 
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * 
 * 
 * To multiply matrix a by matrix b , the number of columns in a must be the
 * same as the number of rows in b , and the two matrices must have elements of
 * the same or compatible types. Let c be the result of the multiplication.
 * Assume the column size of matrix a is n . Each element c ij is a i1 * b 1j +
 * a i2 * b 2j + c + a in * b nj . For example, for two 3 * 3 matrices a and b ,
 * c is...
 * 
 * where c ij = a i1 * b 1j + a i2 * b 2j + a i3 * b 3j . Write a test program
 * that prompts the user to enter two 3 * 3 matrices and dis- plays their
 * product.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-22
 *
 */

public class Exercise_8_6__MultiplyTwoMatricesAlgebra
{
	public static void main(String[] args)
	{
		// create 2x 3 by 3 arrays populated
		double[][] a =
		{
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };
		double[][] b =
		{
				{ 0, 2.0, 4.0 },
				{ 1, 4.5, 2.2 },
				{ 1.1, 4.3, 5.2 } };
		printMatrix(multiplyMatrix(a, b));
		// send the arrays to multiplyMatrix and on return send it to...
		// ... printMatrix method.
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b)
	{
		// checking that the size of array a is the same as array b.
		if(a.length != b.length || a[0].length != b[0].length)
		{
			System.out.printf("The two matrices aren't the same size.\n");
			System.exit(-1);
		}
		
		// make a new array that's a multiple of array a and array b.
		double[][] c = new double[3][3];
		// populate array c.
		for(int row = 0; row < a.length; row++)
		{
			for (int column = 0; column < a[0].length; column++)
			{
				c[row][column] = a[row][column] * b[row][column];
			}
		}
		return c;
	}

	public static void printMatrix(double[][] c)
	{
		for(int row = 0; row < c.length; row++)
		{
			for(int column = 0; column < c[row].length; column++)
			{
				System.out.printf("%6.1f", c[row][column]);
			}
			System.out.println();
		}
	}
}
