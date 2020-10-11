
public class Lab7_part2 {
		public static void main(String[] args)
		{
			char letter;
			int number;
			for(int i = 0; i < 3; i++)
			{
				letter = (char)(((int)(Math.random() * 26)) + 'A');
				System.out.print(letter);
			}
			for(int i = 0; i < 4; i++)
			{
				number = ((int)(Math.random() * 10));
				System.out.print(number);
			}
		}

}
