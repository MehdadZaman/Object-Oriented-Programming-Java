import java.util.Scanner;
public class Lab14_part2 {
	public static double sumMajorDiagonal(double[][] m)
	{
		int length = m.length;
		double sum = 0;
		for(int i = 0; i < length; i++)
		{
			sum += m[i][i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] inp = new double[4][4];
		for(int i = 0; i < inp.length; i++)
		{
			for(int j = 0; j < inp[i].length; j++)
			{
				inp[i][j] = stdin.nextDouble();
			}
		}
		double main_diagonal = sumMajorDiagonal(inp);
		System.out.println("Sum of the elements in the major diagonal is " + main_diagonal);
		stdin.close();
	}
}
