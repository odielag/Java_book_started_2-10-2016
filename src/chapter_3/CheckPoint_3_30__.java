package chapter_3;

public class CheckPoint_3_30__ {
	
	/*
What is y after the following switch statement is executed? Rewrite the code using
an if-else statement.

x = 3; y = 3;
switch (x + 3) {
case 6: y = 1;
default: y += 1;
}
	 */
	
	/*
int x = 3; int y = 3;
if (x + 3 == 6)
	y = 1;
else y += 1;
System.out.printf("y: %d\nx: %d", y, x);
	 */

	public static void main(String[] args) {
		
		int x = 3; int y = 3;
		if (x + 3 == 6)
			y = 1;
		else y += 1;
		System.out.printf("y: %d\nx: %d", y, x);
		
	}

}
