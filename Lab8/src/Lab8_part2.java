import java.util.Scanner;
public class Lab8_part2 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter your encrypted message: ");
		String encrypted_message = stdin.nextLine(); 
		for(int i = 0; i < 5; i++)
		{
			System.out.print(encrypted_message.charAt(i*2));
		}
		System.out.println("");
		stdin.close();
	}
}
