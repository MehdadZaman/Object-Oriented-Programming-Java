/* 
 * Name: Mehdad Zaman 
 * Stonybrook ID: 112323211
 */
import java.util.Scanner;
public class matrixmultiply {
	public static double [][] multiplyMatrix(double[][] a, double[][] b)
	{
		
		double[][] c = new double[a.length][b[0].length];
		double num = 0;
		for(int i = 0; i < a[0].length; i++)
		{
			for(int r = 0; r < a[0].length; r++)
			{
				for(int j = 0; j < b.length; j++)
				{
					num += a[i][j] * b[j][r];
				}
				c[i][r] = num;
				num = 0;
			}
		}
		return c;
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter matrix1: ");
		double[][] dub_arr1 = new double[3][3];
		for(int i = 0; i < dub_arr1.length; i++)
		{
			for(int j = 0; j < dub_arr1[i].length; j++)
			{
				dub_arr1[i][j] = stdin.nextDouble();
			}
		}
		System.out.println("Enter matrix2: ");
		double[][] dub_arr2 = new double[3][3];
		for(int i = 0; i < dub_arr2.length; i++)
		{
			for(int j = 0; j < dub_arr2[i].length; j++)
			{
				dub_arr2[i][j] = stdin.nextDouble();
			}
		}
		System.out.println("Multiplication of the matrices is: ");
		double[][] multip_arr =  multiplyMatrix(dub_arr1, dub_arr2);
		for(int i = 0; i < multip_arr.length; i++)
		{	
			for(int j = 0; j < multip_arr[i].length; j++)
			{
				System.out.print(multip_arr[i][j] + " ");
			}
			System.out.println("");
		}
		stdin.close();
	}

}