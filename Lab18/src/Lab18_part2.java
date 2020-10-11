import java.util.Scanner;
import java.util.ArrayList;
public class Lab18_part2 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.print("Enter five integers for list1: ");
		for(int i = 0; i < 5; i++)
		{
			list1.add(stdin.nextInt());
		}
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.print("Enter five integers for list2: ");
		for(int i = 0; i < 5; i++)
		{
			list2.add(stdin.nextInt());
		}
		ArrayList<Integer> list3 = union(list1, list2);
		System.out.print("The combined list is: ");
		for(int i = 0; i < list3.size(); i++)
		{
			System.out.print(list3.get(i) + " ");
		}
		stdin.close();
		
	}
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> list3 = new ArrayList<>();
		for(int i = 0; i < list1.size(); i++)
		{
			list3.add(list1.get(i));
		}
		for(int i = 0; i < list2.size(); i++)
		{
			list3.add(list2.get(i));
		}
		return list3;
	}
}
