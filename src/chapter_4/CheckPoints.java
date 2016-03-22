package chapter_4;

public class CheckPoints {
	
	public static void main(String[] args){
		
		// 4.1
		/// a. Math.sqrt(4) = 2;
		//System.out.println(Math.sqrt(4));	//2.0
		
		/// b. Math.sin(2 * Math.PI)		//2 ?
		//System.out.println(Math.sin(2 * Math.PI));
		
		// 4.8
		/*
Use print statements to find out the ASCII code for '1' , 'A' , 'B' , 'a' , and 'b' .
Use print statements to find out the character for the decimal codes 40 , 59 , 79 , 85 ,
and 90 . Use print statements to find out the character for the hexadecimal code 40 ,
5A , 71 , 72 , and 7A .
		 */
		/*
		System.out.print((int)'1' + " ");
		System.out.println((char)49);
		System.out.print((int)'A' + " ");
		System.out.println((char)65);		
		System.out.print((int)'B' + " ");
		System.out.println((char)66);		
		System.out.print((int)'a' + " ");
		System.out.println((char)97);		
		System.out.print((int)'b' + " ");
		System.out.println((char)98);		
		*/
		
		// 4.9
		/*
Which of the following are correct literals for characters?
'1' , '\u345dE' , '\u3fFa' , '\b' , '\t'
		 */
		/*
		System.out.println((char)'1');
		//System.out.println((char)'\u345dE');		//had an error
		System.out.println((char)'\u3fFa');
		System.out.println((char)'\b');
		System.out.println((char)'\t');
		System.out.println((int)(char)'\t');
		*/
		
		// 4.10
		/*
How do you display the characters \ and " ?
		 */
		//System.out.println("\\?");		//output= \?
		
		
		// 4.11
		/*
Evaluate the following:
int i = '1';
int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
int k = 'a';
char c = 90;
		 */
		/*
		 i == 41
		 */
		/*
		int i = '1';
		int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
		int k = 'a';
		char c = 90;
		System.out.printf("i = %d\nj = %d\nk = %d\nc = %c", i, j, k, c);
		*/
		/*	// output
		i = 49
		j = 100
		k = 97
		c = Z
		 */
		
		
		// 4.12
		/*
Can the following conversions involving casting be allowed? If so, find the converted
result.
char c = 'A';			// my guess = yes
int i = (int)c;			// yes
float f = 1000.34f;		// yes
int i = (int)f;			// yes
double d = 1000.34;		// yes
int i = (int)d;			// yes
int i = 97;				// yes
char c = (char)i;		// no
		 */
		/*
		char c = 'A';			// my guess = yes
		System.out.println("c = " + c);
		int i = (int)c;			// yes
		System.out.println("i = " + i);
		float f = 1000.34f;		// yes
		System.out.println("f = " + f);
		i = (int)f;			// yes
		System.out.println("i = " + i);
		double d = 1000.34;		// yes
		System.out.println("d = " + d);
		i = (int)d;			// yes
		System.out.println("i = " + i);
		i = 97;				// yes
		System.out.println("i = " + i);
		c = (char)i;		// no
		System.out.println("c = " + c);		// turned out to be yes on all of them.
		*/
		
		
		/*	4.13
Show the output of the following program:

public class Test {
	public static void main(String[] args) {
		char x = 'a';
		char y = 'c';
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(x - y);
	}
}
		 */
		/* My guess
		b
		c
		I don't know
		 */
		/*
		char x = 'a';
		char y = 'c';
		System.out.println(++x);		// b
		System.out.println(y++);		// c
		System.out.println(x - y);		// -2
		*/
		
		
		// 4.14
		/*
Write the code that generates a random lowercase letter.
		 */
		//System.out.println((int)'a' + " " + (int)'z');		// 97 122
		/*
		for(int j = 0; j < 10; j++){
			for(int i = 0; i < 40; i++)System.out.print((char)(int)(97 + Math.random() * 26) + " ");
			System.out.println();
		}
		*/
		/*was testing
		for(int i = 0; i < 400000; i++){
			int z = ((char)(int)(97 + Math.random() * 26));
			if (z == 'z') System.out.println("found it\n");
		}
		*/
		////// my answer: (char)(int)(97 + Math.random() * 26)
		
		
		// 4.15
		/*
Show the output of the following statements:		// my guesses
System.out.println('a' < 'b');						// true
System.out.println('a' <= 'A');						// false
System.out.println('a' > 'b');						// false
System.out.println('a' >= 'A');						// true
System.out.println('a' == 'a');						// true
System.out.println('a' != 'b');						// true
		 */
		/*
		System.out.println('a' < 'b');						// true
		System.out.println('a' <= 'A');						// false
		System.out.println('a' > 'b');						// false
		System.out.println('a' >= 'A');						// true
		System.out.println('a' == 'a');						// true
		System.out.println('a' != 'b');						// true
		*/													// I was correct!
		
		//System.out.print("sometest\nsome more text");
	
	
	}

}
