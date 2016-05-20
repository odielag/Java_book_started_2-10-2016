package chapter_6;

import java.util.Scanner;

/**
 * <h1>(Check password )</h1> Some websites impose certain rules for passwords.
 * Write a method that checks whether a string is a valid password. Suppose the
 * password rules are as follows:
 * 
 * A password must have at least eight characters. A password consists of only
 * letters and digits. A password must contain at least two digits.
 * 
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-19
 *
 */

public class Exercise_6_18__CheckPassword
{
	/** main method for testing */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String password = "";
		System.out.print("Please enter a password: ");
		password = input.nextLine();
		System.out.printf("The password of %s is %s", password, (checkPassword(password))?"valid":"invalid");
		input.close();
	}

	/** function to check if a password is valid */
	public static boolean checkPassword(String password)
	{
		int digitCount = 0;
		// at least 8 characters?
		if (password.length() < 8)
		{
			System.out.println("The password is too short");
			return false;
		}
			// only letters and digits?
		for (int i = 0; i < password.length(); i++)
			if ((Character.toUpperCase(password.charAt(i)) >= 'A' && Character.toUpperCase(password.charAt(i)) <= 'Z')
					|| (password.charAt(i) >= '0' && password.charAt(i) <= '9'))
				continue;
			else
			{
				System.out.println("The password is not using just letters and digits.");
				return false;
			}
		for (int i = 0; i < password.length(); i++)
		{
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
				++digitCount;
		}
		// at least 2 digits?
		if (digitCount < 2)
		{
			System.out.println("The password needs at least 2 digits.");
			return false;
		}
		// If the password passed all those steps it is true (valid).
		System.out.println("The password seems to have passed all tests.");
		return true;
	}
}
