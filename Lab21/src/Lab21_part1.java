import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
public class Lab21_part1 {
	public static void main(String[] args) throws IOException{
		Scanner stdin = new Scanner(System.in);
		double sum = 0;
		int num = 0;
		File file = new File("grades.txt");
		System.out.print("Enter file: ");
		try(PrintWriter f = new PrintWriter("grades.txt"))
		{
			f.print("100 99 98 97 96 100 95 93");
			f.close();	
		}
		catch(IOException IOE)
		{
			System.out.println("IOException");
		}
		
		try(Scanner output = new Scanner(file))
		{
			String inp = stdin.nextLine();
			if(!(inp.compareTo("grades.txt") == 0))
				throw new IOException("File does not exits");
			while(output.hasNext())
			{
				sum += output.nextInt();
				num++;
			}
			double average = sum / num;
			System.out.println("total: " + sum + " average: " + average);
		}
		catch(Exception IOE)
		{
			System.out.println("IOException");
		}
	}
}
