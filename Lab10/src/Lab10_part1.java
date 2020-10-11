import java.util.Scanner;
public class Lab10_part1 {
	public static double mean(double[] x) 
	{
		double sum_val_mn = 0;
		double mean;
		for(int i = 0; i < x.length; i++)
		{
			sum_val_mn += x[i]; 
		}
		mean = sum_val_mn / x.length;
		return mean;
	}
	public static double deviation(double[] x) 
	{
		double sum_val_std = 0;
		double curr_num;
		double std = 0;
		double meanl = mean(x);
		for(int i = 0; i < x.length; i++)
		{
			sum_val_std += Math.pow((x[i] - meanl), 2);
		}
		curr_num = (sum_val_std) / (x.length - 1);
		std = Math.sqrt(curr_num);
		return std;
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] num_inp = new double[10];
		for(int i = 0; i < num_inp.length; i++)
		{
			num_inp[i] = stdin.nextDouble();
		}
		double mean = mean(num_inp);
		double std = deviation(num_inp);
		System.out.printf("The mean is %.2f \n" , mean);
		System.out.printf("The standard deviation is %.5f \n" , std);
		stdin.close();
	}
}
