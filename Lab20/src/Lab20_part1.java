import java.util.Scanner;
import java.util.InputMismatchException;
public class Lab20_part1 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int inp1, inp2;
		boolean stat = true;
		do
		{
			try{
					System.out.print("Enter two integers for the program to display the sum: ");
					inp1 = stdin.nextInt();
					inp2 = stdin.nextInt();
					int sum = inp1 + inp2;
					System.out.println("Sum: " + sum);
					stat = false;
				}
			catch(InputMismatchException ex){
					System.out.println("You have inputted the incorrect datatype.");
					stdin.nextLine();
			}
		}
		while(stat);
		stdin.close();
	}
}