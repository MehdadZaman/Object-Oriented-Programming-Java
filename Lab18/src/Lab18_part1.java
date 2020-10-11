import java.util.ArrayList;
import java.util.Arrays;
public class Lab18_part1 {
	public static void main(String[] args)
	{
		String[] list1arr = {"Austin", "Dallas", "San Fransisco"};
		ArrayList<String> lst1 = new ArrayList<>(Arrays.asList(list1arr));
		String[] list2arr = { "Boston", "Chicago", "Denver", "Seattle"};
		ArrayList<String> lst2 = new ArrayList<>(Arrays.asList(list2arr));
		ArrayList<String> lst3 = mergeList(lst1, lst2);
		System.out.println(lst3);
	}
	public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2)
	{
		String temp;
		ArrayList<String> newlist = new ArrayList<>();
		for(int i = 0; i < lst1.size(); i++)
		{
			newlist.add(lst1.get(i));
		}
		for(int i = 0; i < lst2.size(); i++)
		{
			newlist.add(lst2.get(i));
		}
		for(int i = 0; i < newlist.size(); i++) 
		{
			for(int j = 0; j < newlist.size() - 1; j++)
			{
				if(newlist.get(j).compareToIgnoreCase(newlist.get(j + 1)) > 0)
				{
					temp = newlist.get(j);
					newlist.set(j, newlist.get(j + 1));
					newlist.set(j + 1, temp);
				}
			}
		}
		return newlist;
	}
}