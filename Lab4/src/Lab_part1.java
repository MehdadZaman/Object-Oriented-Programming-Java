import java.util.Scanner;
public class Lab_part1 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int user_int = stdin.nextInt();
		int first_num = user_int / 100;
		int third_num = user_int % 10;
		
		if(first_num == third_num)
		{
			System.out.println(user_int + " is a palindrome");
		}
		else
		{
			System.out.println(user_int + " is not a palindrome");
		}		
		stdin.close();

}
}
