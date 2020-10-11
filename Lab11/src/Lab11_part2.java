import java.util.Scanner;
public class Lab11_part2 {
	public static int[] reverse(int[] n)
	{
		int temp;
		for(int i = 0, j = (n.length - 1); i <= j; i++, j--)
		{
			temp = n[i];
			n[i] = n[j];
			n[j] = temp;	
		}
		return n;
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int[] new_arr = new int[10];
		System.out.print("Enter a list of numbers: ");
		for(int i = 0; i < new_arr.length; i++)
		{
			new_arr[i] = stdin.nextInt();
		}
		new_arr = reverse(new_arr);
		for(int i = 0; i < new_arr.length; i++)
		{
			System.out.print(new_arr[i] + " ");
		}
		stdin.close();
	}

}
