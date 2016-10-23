package chapter_10;

import java.util.Arrays;

public class CheckPoint_10_15
{
	public static void main(String[] args)
	{
		String s1 = "Welcome to Java";
		String s2 = s1;
		String s3 = new String("Welcome to Java");
		String s4 = "Welcome to Java";
		
		// a.
		System.out.println("a. " + (s1 == s2));
		
		// b.
		System.out.println("b. " + (s1 == s3));
		
		// c.
		System.out.println("c. " + (s1 == s4));
		
		// d.
		System.out.println("d. " + (s1.equals(s3)));
		
		// e.
		System.out.println("e. " + (s1.equals(s4)));
		
		// f.
		System.out.println("f. " + "Welcome to Java".replace("Java", "HTML"));
	
		// g.
		System.out.println("g. " + (s1.replace('o', 'T')));
	
		// h.
		System.out.println("h. " + (s1.replaceAll("o", "T")));
		
		// i.
		System.out.println("i. " + (s1.replaceFirst("o", "T")));
		
		// j.
		System.out.println("j. " + (Arrays.toString(s1.toCharArray())));
		
	}
}
