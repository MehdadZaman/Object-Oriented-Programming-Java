
public class Lab13_part2 {
	public static void main(String[] args)
	{
		int[] num_count = new int[10];
		int curr_int;
		for(int i = 0; i< 100; i++)
		{
			curr_int = (int)(Math.random() * 10);
			num_count[curr_int]++;
		}
		for(int i = 0; i < num_count.length; i++)
		{
			System.out.print(num_count[i] + " ");
		}
	}

}