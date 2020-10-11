/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */

import java.util.Scanner;

public class uppercase_count {

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String user_input = stdin.nextLine();
		int capital_count = 0;
		for(int i = 0; i < user_input.length(); i++)
		{
			if(user_input.charAt(i) >= 'A' && user_input.charAt(i) <= 'Z')
			{
				capital_count++;
			}
		}
		System.out.println("The number of uppercase letters is: " + capital_count);
		stdin.close();
	}

}
