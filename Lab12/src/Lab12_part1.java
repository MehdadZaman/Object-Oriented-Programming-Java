import java.util.Scanner;
public class Lab12_part1 {
	public static int[] locateLargest(double[][] a)
	{
		int rowind = 0, colind = 0;
		double largest = a[0][0];
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(largest < a[i][j])
				{
					largest = a[i][j];
					rowind = i;
					colind = j;
				}
			}
		}
		int[] largest_ind = new int[2];
		largest_ind[0] = rowind;
		largest_ind[1] = colind;
		return largest_ind;
		
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int row_num = stdin.nextInt();
		int col_num = stdin.nextInt();
		double[][] array_inp = new double[row_num][col_num];
		System.out.println("Enter the array:");
		for(int i = 0; i < array_inp.length; i++)
		{
			for(int j = 0; j < array_inp[i].length; j++)
			{
				array_inp[i][j] = stdin.nextDouble();
			}
		}
		int[] largest_ind = new int[2];
		largest_ind = locateLargest(array_inp);
		System.out.println("(" + largest_ind[0] + "," + largest_ind[1] + ")");
		stdin.close();
	}

}
