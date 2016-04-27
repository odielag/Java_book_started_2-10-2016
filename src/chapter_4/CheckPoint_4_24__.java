package chapter_4;

public class CheckPoint_4_24__ {
	
	/*
Show the output of the following statements.
(a) System.out.printf("amount is %f %e\n", 32.32, 32.32);
(b) System.out.printf("amount is %5.2%% %5.4e\n", 32.327, 32.32);	// had to fix... (5.2...)
(c) System.out.printf("%6b\n" , (1 > 2));
(d) System.out.printf("%6s\n" , "Java");
(e) System.out.printf("%-6b%s\n", (1 > 2), "Java");
(f) System.out.printf("%6b%-8s\n", (1 > 2), "Java");
	 */
	
	public static void main(String[] args){
	
	
	/* My guesses
a.	"amount is 32.32 3.32*10^2"
	 */
	// System.out.printf("amount is %f %e\n", 32.32, 32.32);	"amount is 32.320000 3.232000e+01"
	
	/*
b.	"amount is 32.32% 3.232e+01" 
	 */
	//	System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);	"amount is 32.33% 3.2320e+01"
		
		/*
c.	" false"	
		 */
	//	System.out.printf("%6b\n" , (1 > 2));		" false"
		
		/*
d.	"  Java"
		*/
	//	System.out.printf("%6s\n" , "Java");	"  Java"
		
		/*
e.	"false Java"
		 */
	//	System.out.printf("%-6b%s\n", (1 > 2), "Java");		"false Java"
		
		/*
f.	" falseJava    "
		 */
	//	System.out.printf("%6b%-8s\n", (1 > 2), "Java");	" falseJava    "
		
	}
}
