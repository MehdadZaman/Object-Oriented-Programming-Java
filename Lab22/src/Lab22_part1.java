import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Lab22_part1{
	
	public static String filecompare(File x, File y) throws IOException{
		boolean samefile = true;
		int difflines = 0;
		String curr1;
		String curr2;
		try {
			Scanner forx = new Scanner(x);
			Scanner fory = new Scanner(y);
			while(forx.hasNext() && fory.hasNext())
			{
				if(!(forx.next().compareTo(fory.next()) == 0))
				{
					samefile = false;
				}
			}
			Scanner forxcount = new Scanner(x);
			Scanner forycount = new Scanner(y);
			{
				while(forxcount.hasNextLine() && forycount.hasNextLine())
				{
					curr1 = forxcount.nextLine();
					curr2 = forycount.nextLine();
					if(!(curr1.equals(curr2)))
					{
						difflines++;
					}
				}
			}
		}
		catch(IOException ioe)
		{
			System.out.println("IOException");
		}
		return "are the files the same: " + samefile + " the number of lines that are the same: " + difflines;
	}
	public static void main(String[] args) throws IOException
	{
		try {
			File file1 = new File("file1.txt");
			File file2 = new File("file2.txt");
			PrintWriter forfile1 = new PrintWriter(file1);
			PrintWriter forfile2 = new PrintWriter(file2);
			forfile1.print("this is just a test");
			forfile2.print("this is just a test");
			
			forfile1.close();
			forfile2.close();
			System.out.println(filecompare(file1, file2));
		}
		catch(IOException ioe)
		{
			System.out.println("IOException");
		}
		
	}
}