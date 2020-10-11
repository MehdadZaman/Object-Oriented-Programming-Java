public class Lab16_part1 {
	public static void main(String[] args)
	{
		int[] rowvals = new int[4];
		int[] colvals = new int[4];
		int[][] dubarr = new int[4][4];
		for(int i = 0; i < dubarr.length; i++)
		{
			for(int j = 0; j < dubarr[i].length; j++)
			{
				dubarr[i][j] = (int)(Math.random() * 2);
			}
		}
		for(int i = 0; i < dubarr.length; i++)
		{
			for(int j = 0; j < dubarr[i].length; j++)
			{
				if(dubarr[i][j] == 1)
				{
					rowvals[i]++;
				}
			}
		}
		for(int j = 0; j < dubarr[0].length; j++)
		{
			for(int i = 0; i < dubarr.length; i++)
			{
				if(dubarr[i][j] == 1)
				{
					colvals[j]++;
				}
			}
		}
		int largest_rowind = 0;
		int largest_rownum = 0;
		for(int i = 0; i < rowvals.length; i++)
		{
			if(rowvals[i] > largest_rownum)
			{
				largest_rownum = rowvals[i];
				largest_rowind = i;
			}
		}
		int largest_colind = 0;
		int largest_colnum = 0;
		for(int i = 0; i < colvals.length; i++)
		{
			if(rowvals[i] > largest_colnum)
			{
				largest_colnum = colvals[i];
				largest_colind = i;
			}
		}
		for(int i = 0; i < dubarr.length; i++)
		{
			for(int j = 0; j < dubarr[i].length; j++)
			{
				System.out.print(dubarr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The largest row index: " + largest_rowind);
		System.out.println("The largest column index: " + largest_colind);
	}
}