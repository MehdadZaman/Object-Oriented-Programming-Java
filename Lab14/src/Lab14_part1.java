import java.util.Scanner;
public class Lab14_part1 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = stdin.nextDouble();
		double b = stdin.nextDouble();
		double c = stdin.nextDouble(); 
		QuadraticEquation user_inp = new QuadraticEquation(a, b, c);
		double root1, root2;
		double discriminant = user_inp.getDiscriminant();
		if(discriminant < 0)
		{
			System.out.println("The equation has no real roots");
		}
		else 
		{
			root1 = user_inp.getRoot1();
			root2 = user_inp.getRoot2();
			if(root1 == root2)
			{
				System.out.println("The equation has one root " + root1);
			} 
			else
			{
				System.out.println("The equation has two roots " + root1 + " and " + root2);
			}
		}
		stdin.close();
	}
}
class QuadraticEquation
{
	private double a, b, c;
	QuadraticEquation(double num1, double num2, double num3)
	{
		a = num1;
		b = num2;
		c = num3;
	}
	public double access_a() 
	{
		return a;
	}
	public double access_b() 
	{
		return b;
	}
	public double access_c() 
	{
		return c;
	}
	public double getDiscriminant()
	{
		return (Math.pow(b, 2) - (4 * a * c));
	}
	public double getRoot1()
	{
		return (((-1 * b) + Math.pow((Math.pow(b, 2) - (4 * a * c)), 0.5)) / (2 * a));
	}
	public double getRoot2()
	{
		return (((-1 * b) - Math.pow((Math.pow(b, 2) - (4 * a * c)), 0.5)) / (2 * a));
	}
}
