/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */
import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int[] arr = new int[8];
		System.out.println("Begin toinput your list:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter the " + i + "th element: ");
			arr[i] = stdin.nextInt();
		}
		System.out.println("the largest element in the array is " + arrmax(arr));
		stdin.close();
	}
	public static int arrmax(int[] arr)
	{
		return largestelem(arr, (arr.length - 1), arr[(arr.length - 1)]);
	}
	public static int largestelem(int[] arr, int index, int maxval)
	{
		if(index < 0)
		{
			return maxval;
		}
		else
		{
			if(arr[index] > maxval)
			{
				maxval = arr[index];
			}
			return largestelem(arr, index - 1, maxval);
		}
	}
}