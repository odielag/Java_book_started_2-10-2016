package chapter_4;

import chapter_2.Exercise_2_19__TriangleCoords;

public class Exercise_4_3__EstimateAreas {
	
	/*
(Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
www.gps-data-team.com/map/ and compute the estimated area enclosed by these
four cities. (Hint: Use the formula in Programming Exercise  4.2 to compute the
distance between two cities. Divide the polygon into two triangles and use the
formula in Programming Exercise  2.19 to compute the area of a triangle.)
	 */
	
	/*
	Atlanta, Georgia: -84.3879824 , 33.7489954
	Orlanda, Florida: -81.37923649999999 , 28.5383355
	Savannah, Georgia: -81.09983419999998 , 32.0835407
	Charlotte, North Carolina: -80.84312669999997 , 35.2270869

	triangle1:
	charlotte, atlanta, savannah
	
	triangle2:
	orlando, atlanta, savannah
	 */
	
	public static void main(String[] args){
		
		// input
		double atlantaX = 33.7489954;
		double atlantaY = -84.3879824;
		double orlandoX = 28.5383355;
		double orlandoY = -81.37923649999999;
		double savannahX = 32.0835407;
		double savannahY = -81.09983419999998;
		double charlotteX = 35.2270869;
		double charlotteY = -80.84312669999997;
		double[] triangle1 = new double[3];
		double[] triangle2 = new double[3];
		double area1;
		double area2;
		double areaFinal;
		
		// processing
		triangle1[0] = distance(charlotteX, charlotteY, atlantaX, atlantaY);
		triangle1[1] = distance(atlantaX, atlantaY, savannahX, savannahY);
		triangle1[2] = distance(savannahX, savannahY, charlotteX, charlotteY);
		triangle2[0] = distance(orlandoX, orlandoY, atlantaX, atlantaY);
		triangle2[1] = distance(atlantaX, atlantaY, savannahX, savannahY);
		triangle2[2] = distance(savannahX, savannahY, orlandoX, orlandoY);
		area1 = triangleArea(triangle1[0], triangle1[1], triangle1[2]);
		area2 = triangleArea(triangle2[0], triangle2[1], triangle2[2]);
		areaFinal = area1 + area2;
		
		// output
		System.out.printf("The average area between those points is %f kilometers squared.", areaFinal);
		
	}

	public static double distance(double x1, double y1, double x2, double y2){
		return Exercise_4_2__GreatCircleDistance.GreatCircleDistance(x1, y1, x2, y2);
	}
	
	public static double triangleArea(double a, double b, double c){
		return Exercise_2_19__TriangleCoords.TriangleCoords(a, b, c);
	}
}
