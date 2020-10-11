public class Lab6_part1
{
	public static void main(String[] args)
	{
	double average;
	int total = 0;
	int num_value;
	for(int i = 0; i < 10; i++)
	{
		num_value = (int)(Math.random() * 100);
		System.out.println(num_value);
		total += num_value;	
	}
	average = total / 10.0;
	System.out.println(average);

}
}