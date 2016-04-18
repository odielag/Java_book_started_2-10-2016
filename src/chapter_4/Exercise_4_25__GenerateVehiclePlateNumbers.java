package chapter_4;

public class Exercise_4_25__GenerateVehiclePlateNumbers {
	
	/*
(Generate vehicle plate numbers) Assume a vehicle plate number consists of three
uppercase letters followed by four digits. Write a program to generate a plate
number.
	 */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) 
			System.out.print((char)(65 + Math.random() * (90 - 65)));
		for (int i = 0; i < 4; i++)
			System.out.print((char)(48 + Math.random() * (57 - 48)));
		
	}

}
