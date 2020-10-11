/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */
import java.util.Scanner;
public class trianglecalc_1 
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		double side1, side2, side3, perimeter;
		
		System.out.println("Input the lengths of the sides of your triangle,"
				+ " and I will calculate the perimeter.But make sure "
				+ "the lengths of the sides make sensse!");
		
		System.out.print("Start by entering the length of your first side: ");
		side1 = stdin.nextDouble();
		System.out.print("Now enter the length of your second side: ");
		side2 = stdin.nextDouble();
		System.out.print("Finally enter the end of your third side: ");
		side3 = stdin.nextDouble();
		
		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
		{
			perimeter = side1 + side2 + side3;
			System.out.printf("The perimeter of your triangle is %f", perimeter);
		}
		else
		{
			System.out.println("Your input is invalid; try again.");
		}	
		stdin.close();
	}
}
