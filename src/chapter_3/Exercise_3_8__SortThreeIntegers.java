package chapter_3;

public class Exercise_3_8__SortThreeIntegers {

	/*
(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
	 */

	public static void main(String[] args){

		// input
		int numberOfIntegers = 3;
		int[] integer = new int[numberOfIntegers];
		int temp;


		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println(numberOfIntegers + " integers: ");
		for (int i = 0; i < numberOfIntegers; i++){
			integer[i] = input.nextInt();
			//	integer[i] = (int)(Math.random() * 100); // for testing
		}
		input.close();

		// processing
		for (int j = 0; j < integer.length - 1; j++){
			for (int i = j + 1; i < integer.length; i++){
				if (integer[j] > integer[i]){
					temp = integer[i];
					integer[i] = integer[j];
					integer[j] = temp;
				}
				/* DEBUG
				System.out.printf("\nj: %d i: %d integer[j]: %d integer[i]: %d\n", 
						j, i, integer[j], integer[i]);
				for(int k = 0; k < integer.length; k++){
					System.out.println(integer[k] + " ");
				}
				 */
			}
		}

		// output
		System.out.printf("The sorted integers are: ");
		for (int i = 0; i < integer.length; i++)
			System.out.printf("%d ", integer[i]);

	}

}
