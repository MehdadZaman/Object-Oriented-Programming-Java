/* 
 * Name: Mehdad Zaman 
 * Stonybrook ID: 112323211
 */
import java.util.Scanner;
public class Location 
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int numrows = stdin.nextInt();
		int numcols = stdin.nextInt();
		double[][] arr = new double[numrows][numcols];
		System.out.println("Enter the array:");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = stdin.nextDouble();
			}
		}
		Location1 values =  new Location1();
		values = locateLargest(arr);
		System.out.println("The location of the largest element " + values.maxValue + " is at (" 
		+ values.row + ", " + values.column + ")");
		stdin.close();		
	}
	public static Location1 locateLargest(double[][] a)
	{
		double maxValue_1 = a[0][0];
		int row_1 = 0, column_1 = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(maxValue_1 < a[i][j])
				{
					maxValue_1 = a[i][j];
					row_1 = i;
					column_1 = j;
				}
			}
		}
		Location1 obj = new Location1(row_1, column_1, maxValue_1);
		return obj;
	}
}
class Location1 
{
	public int row, column;
	public double maxValue;
	public Location1() {}
	public Location1(int r, int c, double maxv) 
	{
		row = r;
		column = c;
		maxValue = maxv;
	}	
}