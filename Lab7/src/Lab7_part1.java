import java.util.Scanner;
public class Lab7_part1 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String city_1 = stdin.nextLine(); 
		System.out.print("Enter the second city: ");
		String city_2 = stdin.nextLine(); 
		System.out.print("Enter the third city: ");
		String city_3 = stdin.nextLine();
		if(city_1.compareToIgnoreCase(city_2) < 0 && city_1.compareToIgnoreCase(city_3) < 0)
		{
			if(city_2.compareToIgnoreCase(city_3) < 0)
			{
				System.out.println("The three cities in alphabetical order are " +
						city_1 + ", " + city_2 + ", " + city_3);
			}
			else
			{
				System.out.println("The three cities in alphabetical order are " +
						city_1 + ", " + city_3 + ", " + city_2);
			}
		}
		else if(city_2.compareToIgnoreCase(city_1) < 0 && city_2.compareToIgnoreCase(city_3) < 0)
		{
			if(city_1.compareToIgnoreCase(city_3) < 0)
			{
				System.out.println("The three cities in alphabetical order are " +
						city_2 + ", " + city_1 + ", " + city_3);
			}
			else
			{
				System.out.println("The three cities in alphabetical order are " +
						city_2 + ", " + city_3 + ", " + city_1);
			}
		}
		else
		{
			if(city_1.compareToIgnoreCase(city_2) < 0)
			{
				System.out.println("The three cities in alphabetical order are " +
						city_3 + ", " + city_1 + ", " + city_2);
			}
			else
			{
				System.out.println("The three cities in alphabetical order are " +
						city_3 + ", " + city_2 + ", " + city_1);
			}
		}
		stdin.close();
	}

}
