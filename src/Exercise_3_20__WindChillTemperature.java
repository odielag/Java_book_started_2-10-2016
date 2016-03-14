
public class Exercise_3_20__WindChillTemperature {
	
	/*
(Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.
	 */
	
	public static void main(String[] args){
		
		// input
		double[] s = new double[3]; // triangle sides length array
		double temp;
		String output = "_default_output_variable_value_";
		
		System.out.println("Please enter the three sides of a triangle");
		java.util.Scanner input = new java.util.Scanner(System.in);
		for(int i = 0; i < s.length; i++)
			s[i] = input.nextDouble();
		input.close();
		
		// processing
		for(int i = 0; i < s.length - 1; i++){		//		sorting array...
			for(int j = i +1; j < s.length; j++){
				if(s[i] > s[j]){
				temp = s[i];
				s[i] = s[j];
				s[j] = temp;
				}
			}
		}
		if(s[0] + s[1] > s[2])
			output = "the input is valid.";
		else if(s[0] + s[1] <= s[2])
			output = "the input is invalid.";
		else 
			output = "What??? program doesn't work.";
		
		// output
		System.out.println(output);
		
	}

}

// Finished by William ODieLag Pennington on 3/14/2016;