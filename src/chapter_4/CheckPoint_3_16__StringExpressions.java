package chapter_4;

public class CheckPoint_3_16__StringExpressions {
	
	/*
4.16
number to string
Suppose that s1 , s2 , and s3 are three strings, given as follows:
String s1 = "Welcome to Java";
String s2 = "Programming is fun";
String s3 = "Welcome to Java";
What are the results of the following expressions?

(a)s1 == s2
(b)s2 == s3
(c)s1.equals(s2)
(d)s1.equals(s3)
(e)s1.compareTo(s2)
(f)s2.compareTo(s3)
(g)s2.compareTo(s2)
(h)s1.charAt(0)
(i)s1.indexOf('j')
(j)s1.indexOf("to")
(k)s1.lastIndexOf('a')
(l)s1.lastIndexOf("o" , 15)
(m)s1.length()
(n)s1.substring(5)
(o)s1.substring(5, 11)
(p)s1.startsWith("Wel")
(q)s1.endsWith("Java")
(r)s1.toLowerCase()
(s)s1.toUpperCase()
(t)s1.concat(s2)
(u)s1.contains(s2)
(v)"\t Wel \t".trim()

	 */
	
	public static void main(String[] args){
		
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		//									// guesses		// answer
		System.out.println();
		// (a)s1 == s2						// false		// false
		System.out.println(s1 == s2);
		// (b)s2 == s3						// false		// false
		System.out.println(s2 == s3);
		// (c)s1.equals(s2)					// false		// false
		System.out.println(s1.equals(s2));
		// (d)s1.equals(s3)					// true			// true
		System.out.println(s1.equals(s3));
		// (e)s1.compareTo(s2)				// -4			// 7
		System.out.println(s1.compareTo(s2)	);
		// (f)s2.compareTo(s3)				// -7			// -7
		System.out.println(s2.compareTo(s3));
		// (g)s2.compareTo(s2)				// 0			// 0
		System.out.println(s2.compareTo(s2));
		// (h)s1.charAt(0)					// W			// W
		System.out.println(s1.charAt(0));
		// (i)s1.indexOf('j')				// ?			// -1
		System.out.println(s1.indexOf('j'));
		// (j)s1.indexOf("to")				// 8			// 8
		System.out.println(s1.indexOf("to"));
		// (k)s1.lastIndexOf('a')			// 14			// 14
		System.out.println(s1.lastIndexOf('a'));
		// (l)s1.lastIndexOf("o" , 15)		// -1			// 9
		System.out.println(s1.lastIndexOf("o" , 15));
		// (m)s1.length()					// 15			// 15
		System.out.println(s1.length()	);
		// (n)s1.substring(5)				// me to Java	// me to Java
		System.out.println(s1.substring(5)	);
		// (o)s1.substring(5, 11)			// me to 		// me to 
		System.out.println(s1.substring(5, 11));
		// (p)s1.startsWith("Wel")			// true			// true
		System.out.println(s1.startsWith("Wel"));
		// (q)s1.endsWith("Java")			// true			// true
		System.out.println(s1.endsWith("Java")	);
		// (r)s1.toLowerCase()				// welcome to java		// welcome to java
		System.out.println(s1.toLowerCase()	);
		// (s)s1.toUpperCase()				// WELCOME TO JAVA		// WELCOME TO JAVA
		System.out.println(s1.toUpperCase()	);
		// (t)s1.concat(s2)					// Welcome to JavaProgramming is fun	// Welcome to JavaProgramming is fun
		System.out.println(s1.concat(s2)	);
		// (u)s1.contains(s2)				// false		// false
		System.out.println(s1.contains(s2));
		// (v)"\t Wel \t".trim()			// Wel			// Wel
		System.out.println("\t Wel \t".trim());
		
		
	}

}
