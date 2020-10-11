/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */

import java.util.Scanner;
public class consonant_vowel_1 {
		public static void main(String[] args)
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print("Enter a letter: ");
			char user_input = stdin.next().charAt(0);
			
				if(user_input == 'A' || user_input == 'E' 
						|| user_input == 'I' || user_input == 'O'
						|| user_input == 'U' || user_input == 'a'
						|| user_input == 'e' || user_input == 'i'
						|| user_input == 'o' || user_input == 'u')
				{
					System.out.println(user_input + " is a vowel");
				}
				else if((user_input >= 'a' && user_input <= 'z') 
						|| (user_input >= 'A' && user_input <= 'Z') )
				{
					System.out.println(user_input + " is a consonant");
				}
				else
				{
					System.out.println(user_input + " is an invalid input");
				}
			
			stdin.close();
			
		}
}
