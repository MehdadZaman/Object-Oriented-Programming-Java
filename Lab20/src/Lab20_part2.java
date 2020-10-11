import java.util.Scanner;
public class Lab20_part2 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = 1 + (int)(Math.random() * 100);
		}
		System.out.print("Enter an index of the array to see the corresponding value: ");
		int ind = stdin.nextInt();
		try {
			System.out.println(arr[ind]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Out of Bounds");
		}
		stdin.close();
	}
}
