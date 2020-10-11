import java.util.Scanner;

public class Lab8_part1 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the phone number: ");
		String phone_number = stdin.nextLine();
		System.out.println("(" + phone_number.substring(0, 3) + ")" + phone_number.substring(3, 6) 
		+ "-" + phone_number.substring(6, 10));
		stdin.close();
	}

}