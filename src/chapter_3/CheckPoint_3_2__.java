package chapter_3;

public class CheckPoint_3_2__ {
	
	/*
Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
Thursday, Friday, Saturday, if day is 0 , 1 , 2 , 3 , 4 , 5 , 6 , accordingly.
	 */

	/*
	public static void main(String[] args){
	
		// input
		String[] dayName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		Int dayNumber;
		String output;
		
		System.out.println("Enter the day in the week. (example: Sunday = 0, Monday = 1, ...)\n");
		java.util.Scanner input = new java.util.Scanner(System.in); 
		dayNumber = input.nextInt;
		input.close();
				
		// processing
		switch (dayNumber){
			case 0: output = dayName[0]; break;
			case 1: output = dayName[1]; break;
			case 2: output = dayName[2]; break;
			case 3: output = dayName[3]; break;
			case 4: output = dayName[4]; break;
			case 5: output = dayName[5]; break;
			case 6: output = dayName[6]; break;
			default: System.exit(improper input);
		}
		// output
		System.out.println(output);
	}
	 */
	
	public static void main(String[] args){
		
		// input
		String[] dayName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int dayNumber;
		String output = "";
		
		System.out.println("Enter the day in the week. (example: Sunday = 0, Monday = 1, ...)");
		java.util.Scanner input = new java.util.Scanner(System.in); 
		dayNumber = input.nextInt();
		input.close();
				
		// processing
		switch (dayNumber){
			case 0: output = dayName[0]; break;
			case 1: output = dayName[1]; break;
			case 2: output = dayName[2]; break;
			case 3: output = dayName[3]; break;
			case 4: output = dayName[4]; break;
			case 5: output = dayName[5]; break;
			case 6: output = dayName[6]; break;
			default: System.exit(1);
		}
		// output
		System.out.printf("%s", output);
	}
	
}
