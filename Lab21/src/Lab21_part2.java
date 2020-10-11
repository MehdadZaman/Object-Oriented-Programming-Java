import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
public class Lab21_part2 {
	public static void main(String[] args) throws IOException{
		ArrayList<String> strlist = new ArrayList<>();
		File file = new File("cities.txt");
		File outputl = new File("Output.txt");
		try(PrintWriter input = new PrintWriter(file))
		{
			input.print("Dallas Houston Chicago Denver Tampa Miami Charlotte Austin Detroit Seattle");
			input.close();
		}
		catch(IOException IOE)
		{
			System.out.println("IOException");
		}
		try(Scanner output = new Scanner(file);
			PrintWriter output1 = new PrintWriter(outputl);)
		{
			while(output.hasNext())
			{
				String currstr = output.next();
				strlist.add(currstr);
			}
			for(int i = strlist.size() - 1; i > 0; i--)
			{
				System.out.print(strlist.get(i) + " ");
				output1.print(strlist.get(i) + " ");
			}
		}		
		catch(IOException IOE)
		{
			System.out.println("IOException");
		}
	}

}
