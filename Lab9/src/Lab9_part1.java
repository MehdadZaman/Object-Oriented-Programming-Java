import java.util.Scanner;
public class Lab9_part1 {
	public static int count(String str, char a)
	{
		int counter = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == a)
			{
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = stdin.nextLine();
		System.out.print("Enter the letter for occurences in the string: ");
		char letter = stdin.next().charAt(0);
		System.out.println(count(word, letter));
		stdin.close();
	}

}
