import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the initial velocity (in meters per second): ");
		double v0 = stdin.nextDouble();
		System.out.print("Enter the final velocity (in meters per second): ");
		double v1 = stdin.nextDouble();
		System.out.print("Enter the time span (in seconds): ");
		double t = stdin.nextDouble();
		double a = ((v1 - v0) / t);
		System.out.printf("The average acceleration is: %.4f " ,a);
		stdin.close();
	}
}