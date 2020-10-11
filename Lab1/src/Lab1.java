import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args)
	{
		double radius;
		double area;
		System.out.print("Enter the radius: ");
		Scanner stdin = new Scanner(System.in);
		radius = stdin.nextDouble();
		area = radius * radius * 3.14159;
		System.out.println("The area for the circle of radius " + radius + "is " + area);
		stdin.close();
		
	}
}