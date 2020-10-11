import java.util.Scanner;
public class Lab_part2 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		double n = stdin.nextDouble();
		System.out.print("Enter the side: ");
		double s = stdin.nextDouble();
		double area = (n * (s * s)) / (4 * Math.tan(Math.PI/n));
		System.out.println("The area of the polygon is " + area);
		stdin.close();
	}

}
