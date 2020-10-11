import java.util.Scanner;
public class Lab10_part2 {
	public static int[] eliminateDuplicate(int[] list)
	{
		int curr_num_ind;
		int[] arr_count = new int[10];
		int[] new_arr;
		for(int i = 0; i < list.length; i++)
		{
			curr_num_ind = list[i] - 1;
			arr_count[curr_num_ind]++;
		}
		return arr_count;
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int[] inp = new int[10];
		System.out.println("Enter 10 numbers: ");
		for(int i = 0; i < inp.length; i++)
		{
			inp[i] = stdin.nextInt();
		}
		int[] new_arr = eliminateDuplicate(inp);
		System.out.print("The distinct numbers are: ");
		for(int i = 0; i < new_arr.length; i++)
		{
			if(new_arr[i] > 0)
			{
				System.out.print("" + (i+1));
			}
		}
		stdin.close();
	}


}
