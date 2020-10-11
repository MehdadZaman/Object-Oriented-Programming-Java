import java.util.Scanner;
import java.util.ArrayList;
public class Lab17_part2 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inp = stdin.nextLine();
		ArrayList<Character> inparr = toCharacterArray(inp);
		for(int i = 0; i < inparr.size(); i++)
		{
			System.out.print(inparr.get(i) + " ");
		}
		stdin.close();
	}
	public static ArrayList<Character> toCharacterArray(String s)
	{
		ArrayList<Character> arr = new ArrayList<>();
		for(int i = 0; i < s.length(); i++)
		{
			arr.add(s.charAt(i));
		}
		return arr;
	}
}