/* 
 * Name: Mehdad Zaman 
 * Stonybrook ID: 112323211
 */
import java.util.Scanner;
public class palindrome {
	public static boolean palindrome(String s)
	{
		String curr = "";
		boolean val = true;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				curr += s.charAt(i);
			}
		}
		curr = curr.toLowerCase();
		for(int j = 0, l = (curr.length() - 1); j <= l; j++, l--)
		{
			if(curr.charAt(j) == curr.charAt(l))
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
		System.out.print("Enter the input string: ");
		String inp = stdin.nextLine();
		boolean vali = palindrome(inp);
		if(vali == true)
		{
			System.out.println("Input string " + inp + " is a palindrome");
		}
		else
		{
			System.out.println("Input string " + inp + " is NOT a palindrome");
		}
		stdin.close();
	}
}
