import java.util.Scanner;
public class Lab12_part2 {
	public static boolean isMarkovMatrix(double[][] m)
	{
		boolean val = true;
		double colsum = 0;
		for(int j = 0; j < m[0].length; j++)
		{
			colsum = 0;
			for(int i = 0; i < m.length; i++)
			{
				colsum += m[i][j];
			}
			if(colsum != 1)
			{
				val = false;
				break;
			}
		}
		return val;
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		double[][] inp_arr = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for(int i = 0; i < inp_arr.length; i++)
		{
			for(int j = 0; j < inp_arr[i].length; j++)
			{
				inp_arr[i][j] = stdin.nextDouble();
			}
		}
		boolean valinp = isMarkovMatrix(inp_arr);
		if(valinp == true)
		{
			System.out.println("It is a Markov matrix");
		}
		else
		{
			System.out.println("It is not a Markov matrix");
		}
		stdin.close();
	}
}
