import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class Problem1 {
	public static void main(String[] args) throws IOException{
		ArrayList<Integer> file_contents = new ArrayList<>();
		File file = new File("integerFile.txt");
		try
		{
			FileWriter foo = new FileWriter(file, false);
			PrintWriter input = new PrintWriter(foo);
			for(int i = 0; i < 100; i++)
			{
				input.print((int)(Math.random() * 101) + " ");
			}
			input.close();
		}
		catch(IOException IOE)
		{
			System.out.println("IOException");
		}
		try
		{
			Scanner output = new Scanner(file);
			while(output.hasNext())
			{
				int x = output.nextInt();
				file_contents.add(x);
			}
		}
		catch(IOException IOE)
		{
			System.out.println("IOException");
		}
		for(int i = 0; i < file_contents.size(); i++)
		{
			for(int j = 0; j < file_contents.size() - 1; j++)
			{
				if(file_contents.get(j) > file_contents.get(j + 1))
				{
					int temp = file_contents.get(j);
					file_contents.set(j, file_contents.get(j+1));
					file_contents.set(j + 1, temp);
				}
			}	
		}
		for(int i = 0; i < file_contents.size(); i++)
		{
			System.out.print(file_contents.get(i) + " ");
		}
	}
}