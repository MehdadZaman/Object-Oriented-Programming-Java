/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class ReverseFile_112323211 {
	public static void main(String[] args) throws IOException{
		File file = new File("randString.txt");
		int strlength;
		ArrayList<String> file_contents = new ArrayList<>();
		try
		{
			FileWriter foo = new FileWriter(file, false);
			PrintWriter input = new PrintWriter(foo);
			for(int i = 0; i < 100; i++)
			{
				strlength = (3 + (int)(Math.random() * 8));
				String currstr = "";
				for(int j = 0; j < strlength; j++)
				{
					currstr += (char)((Math.random() * 26) + 'A');
				}
				input.print(currstr + " ");
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
				String curr = output.next();
				file_contents.add(curr);
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
				if(file_contents.get(j).compareTo(file_contents.get(j + 1)) > 0)
				{
					String temp = file_contents.get(j);
					file_contents.set(j, file_contents.get(j+1));
					file_contents.set(j + 1, temp);
				}
			}	
		}
		try {
			FileWriter foo2 = new FileWriter(file, false);
			PrintWriter input2 = new PrintWriter(foo2);
			for(int i = 0; i < file_contents.size(); i++)
			{
				input2.print(file_contents.get(i) + " ");
			}
			input2.close();
		}
		catch(IOException IOE)
		{
			System.out.println("IOException");
		}
	}
}
