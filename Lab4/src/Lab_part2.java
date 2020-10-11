import java.util.Scanner;
public class Lab_part2 {
	
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int user_int = stdin.nextInt();
		
		System.out.print("Is " + user_int + " divisible by 5 and 6? ");
		if((user_int % 5 == 0) && (user_int % 6 == 0))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.print("Is " + user_int + " divisible by 5 or 6? ");
		if((user_int % 5 == 0) || (user_int % 6 == 0))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.print("Is " + user_int + " divisible by 5 or 6, but not both? ");
		if(((user_int % 5 == 0) && (user_int % 6 != 0)) || ((user_int % 5 != 0) && (user_int % 6 == 0)) )
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		stdin.close();
	}
}
