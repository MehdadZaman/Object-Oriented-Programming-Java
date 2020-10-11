import java.util.Scanner;

public class Lab_part1 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int user_int;
		do
		{
		System.out.print("Enter a positive integer: ");
		user_int = stdin.nextInt();
		}
		while(user_int < 0);
		int product = 1;
		for(int i = user_int; i > 0; i--)
		{
			product *= i;
		}
		System.out.println("Factorial is " + product);
		stdin.close();
	}

}
