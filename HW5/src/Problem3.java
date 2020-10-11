/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String inp = stdin.nextLine();
		System.out.println("Your input's reverse: " + reverstring(inp));
		stdin.close();
	}
	public static String reverstring(String input) 
	{
		return reverecur(input, (input.length() - 1), "");
	}
	public static String reverecur(String input, int currind, String output)
	{
		if(currind < 0)
		{
			return output;
		}
		else
		{
			output += input.charAt(currind);
			return reverecur(input, currind - 1, output);		
		}
	}
}