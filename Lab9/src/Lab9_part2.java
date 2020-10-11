public class Lab9_part2 {
	public static double summation(int x)
	{
		int i = 0;
		double sum = 0;
		for( ; i <= x; i++)
		{
			sum += (i) / (i + 1.0); 
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println("i m(i)");
		for(int i = 1; i <= 20; i++)
			System.out.println(i + " " + summation(i));
	}

}