package chapter_8;

import java.util.Scanner;

/**
 * <h1>(All closest pairs of points)</h1> Revise Listing 8.3,
 * FindNearestPoints.java, to display all closest pairs of points with the same
 * minimum distance. Here is a sample run:
 * 
 * Enter the number of points: 8
 * 
 * Enter 8 points: 0 0 1 1 -1 -1 2 2 -2 -2 -3 -3 -4 -4 5 5
 * 
 * The closest two points are (0.0, 0.0) and (1.0, 1.0)
 * 
 * The closest two points are (0.0, 0.0) and (-1.0, -1.0)
 * 
 * The closest two points are (1.0, 1.0) and (2.0, 2.0)
 * 
 * The closest two points are (-1.0, -1.0) and (-2.0, -2.0)
 * 
 * The closest two points are (-2.0, -2.0) and (-3.0, -3.0)
 * 
 * The closest two points are (-3.0, -3.0) and (-4.0, -4.0)
 * 
 * Their distance is 1.4142135623730951
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-23
 *
 */

public class Exercise_8_8__AllClosestPairsOfPoints
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		// Create an array to store points
		double[][] points = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < points.length; i++)
		{
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		/// Make 2d array pointSets[elementIteration][point 1 x, point 1 y,
		/// point 2 x, point 2 y]
		double[][] pointSets = new double[1][4];

		// p1 and p2 are the indices in the points' array
		int p1 = 0, p2 = 1; // Initial two points
		// populate pointSets array
		pointSets[0][0] = points[0][0];
		pointSets[0][1] = points[0][1];
		pointSets[0][2] = points[1][0];
		pointSets[0][3] = points[1][1];
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]); // Initialize
																										// shortestDistance

		// Compute distance for every two points
		for (int i = 0; i < points.length; i++)
		{
			for (int j = i + 1; j < points.length; j++)
			{
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find
				// distance
				if(i == 0 && j == 1)
					continue;
				
				if (shortestDistance == distance)
				{
					double[][] tempArray = new double[pointSets.length + 1][4];
					System.arraycopy(pointSets, 0, tempArray, 0, pointSets.length);
					pointSets = tempArray.clone();
					pointSets[pointSets.length - 1][0] = points[i][0];
					pointSets[pointSets.length - 1][1] = points[i][1];
					pointSets[pointSets.length - 1][2] = points[j][0];
					pointSets[pointSets.length - 1][3] = points[j][1];
				} else if (shortestDistance > distance)
				{
					double[][] tempArray = new double[1][4];
					pointSets = tempArray.clone();
					pointSets[0][0] = points[i][0];
					pointSets[0][1] = points[i][1];
					pointSets[0][2] = points[j][0];
					pointSets[0][3] = points[j][1];
					shortestDistance = distance; // Update shortestDistance
				}
			}
		}
		input.close();
		// Display result
		/// for to show multiple results.
		for (int i = 0; i < pointSets.length; i++)
		{
			System.out.println("The closest two points are " + "(" + pointSets[i][0] + ", " + pointSets[i][1]
					+ ") and (" + pointSets[i][2] + ", " + pointSets[i][3] + ")");
		}
		System.out.printf("Their distance is %f", shortestDistance);
	}

	/** Compute the distance between two points (x1, y1) and (x2, y2) */
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}
