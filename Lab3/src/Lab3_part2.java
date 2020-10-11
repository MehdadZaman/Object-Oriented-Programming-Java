import java.util.Scanner;
public class Lab3_part2 {
	
	public static void main(String[] args)
	{
		double w;
		Scanner stdin = new Scanner(System.in);
		System.out.print("Input the weight of your package in pounds: ");
		w = stdin.nextDouble();
		if(w <= 1 && w > 0)
		{
			System.out.println("3.5");
		}
		else if(w <= 3 && w > 1)
		{
			System.out.println("5.5");
		}
		else if(w <= 10 && w > 3)
		{
			System.out.println("8.5");
		}
		else if(w <= 20 && w > 10)
		{
			System.out.println("10.5");
		}
		else if(w > 20)
		{
			System.out.println("The package cannot be shipped");
		}
		else
		{
			System.out.println("Invalid input");
		}
		stdin.close();
	}

}
