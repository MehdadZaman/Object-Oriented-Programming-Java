/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */
import java.util.Scanner;
public class consonant_vowel_2 {

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String user_input = stdin.nextLine();
		int consonant_count = 0; 
		int vowel_count = 0;  
		for(int i = 0; i < user_input.length(); i++)
		{
			if(user_input.charAt(i) == 'A' || user_input.charAt(i) == 'E' 
					|| user_input.charAt(i) == 'I' || user_input.charAt(i) == 'O'
					|| user_input.charAt(i) == 'U' || user_input.charAt(i) == 'a'
					|| user_input.charAt(i) == 'e' || user_input.charAt(i) == 'i'
					|| user_input.charAt(i) == 'o' || user_input.charAt(i) == 'u')
			{
				vowel_count++;
			}
			else if((user_input.charAt(i) >= 'a' && user_input.charAt(i) <= 'z') 
					|| (user_input.charAt(i) >= 'A' && user_input.charAt(i) <= 'Z') )
			{
				consonant_count++;
			}
		}
		System.out.println("The number of vowels is " + vowel_count);
		System.out.println("The number of consonants is " + consonant_count);
		
		stdin.close();
	}
}
