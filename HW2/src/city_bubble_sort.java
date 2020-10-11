/* 
 * Name: Mehdad Zaman 
 * Stonybrook ID: 112323211
 */
import java.util.Scanner;

public class city_bubble_sort {
	public static String[] city_sort(String[] s)
	{
		String current;
		for(int i = 0; i < s.length; i++)
		{
			for(int j = 0; j < s.length - 1; j++)
			{
				if(s[j].compareToIgnoreCase(s[j+1]) > 0)
				{
					current = s[j];
					s[j] = s[j + 1];
					s[j + 1] = current;					
				}
			}
		}
		return s;
	}


	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		String[] arrn = new String[10];
		System.out.print("Enter 10 strings: ");
		for(int i = 0; i < arrn.length; i++)
		{
			arrn[i] = stdin.nextLine();
			System.out.print(", ");
		}
		String[] arrn_1 = city_sort(arrn);
		System.out.print("Sorted Strings: ");
		for(int i = 0; i < arrn.length; i++)
		{	
			System.out.print(arrn_1[i] + ", ");
		}
		stdin.close();			
	}
	

}
