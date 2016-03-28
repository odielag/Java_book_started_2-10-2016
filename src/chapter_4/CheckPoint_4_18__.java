package chapter_4;

public class CheckPoint_4_18__ {
	
	/*
Show the output of the following statements (write a program to verify your results):

System.out.println("1" + 1);				// 11
System.out.println('1' + 1);				// 11
System.out.println("1" + 1 + 1);			// 12
System.out.println("1" + (1 + 1));			// 12
System.out.println('1' + 1 + 1);			// 12
	 */

	public static void main(String[] args){
		
		System.out.println("1" + 1);				// 11		// 11
		System.out.println('1' + 1);				// 11		// 50
		System.out.println("1" + 1 + 1);			// 12		// 111
		System.out.println("1" + (1 + 1));			// 12		// 12
		System.out.println('1' + 1 + 1);			// 12		// 51
		
	}
	
}
