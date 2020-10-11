/* 
 * Name: Mehdad Zaman 
 * Stonybrook ID: 112323211
 */

import java.util.Scanner;

public class anagram {
	public static boolean anagram(String str1, String str2)
	{
		boolean val = true;
		int currentlet;
		String str1_curr = "", str2_curr = "";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) != ' ')
			{
				str1_curr += str1.charAt(i);
			}
		}
		for(int i = 0; i < str2.length(); i++)
		{
			if(str2.charAt(i) != ' ')
			{
				str2_curr += str2.charAt(i);
			}
		}
		str1_curr = str1_curr.toLowerCase();
		str2_curr = str2_curr.toLowerCase();
		int[] alpha_str1 = new int[26], alpha_str2 = new int[26];
		for(int i = 0; i < str1_curr.length(); i++)
		{
			currentlet = str1_curr.charAt(i) - 'a';
			alpha_str1[currentlet]++;
		}
		for(int i = 0; i < str2_curr.length(); i++)
		{
			currentlet = str2_curr.charAt(i) - 'a';
			alpha_str2[currentlet]++;
		}
		for(int i = 0; i < 26; i++)
		{
			if(alpha_str1[i] == alpha_str2[i])
			{
				val = true;
			}
			else
			{
				val = false;
				break;
			}
		}
		return val;
	}
	
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = stdin.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = stdin.nextLine();
		boolean valft = anagram(str1, str2);

		if(valft == true)
		{
			System.out.println("" + str1 + " and " + str2 + " are anagrams");
		}
		else
		{
			System.out.println("" + str1 + " and " + str2 + " are NOT anagrams");
		}
		stdin.close();
	}
	
		
}
