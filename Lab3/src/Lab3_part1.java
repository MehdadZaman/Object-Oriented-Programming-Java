import java.util.Scanner;
public class Lab3_part1 {
	public static void main(String[] args)
	{
		int a, b, c; 
		double discriminant, root1, root2;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a b c: ");
		a = stdin.nextInt();
		b = stdin.nextInt();
		c = stdin.nextInt();
		discriminant = ((b*b) - (4 *a *c));
		if(discriminant > 0 )
		{
			root1 = ((-b + Math.pow(((b*b) - (4 *a *c)), (1.0/2))) / (2 *a));
			root2 = ((-b - Math.pow(((b*b) - (4 *a *c)), (1.0/2))) / (2 *a));
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		}
		else if(discriminant == 0)
		{
			root1 = (-b / (2*a));
			System.out.println("The equation has one root " + root1);
		}
		else
		{
			System.out.println("The equation has no real roots.");
		}
		
		stdin.close();
	}

}
