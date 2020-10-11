import java.util.Scanner;
public class Lab11_part1 
{
	public static int[] merge(int[] list1 , int[] list2)
	{
		int temp_place;
		int[] merged_array = new int[list1.length + list2.length];
		for(int i = 0; i < list1.length; i++)
		{
			merged_array[i] = list1[i];
		}
		for(int i = 0; i < list2.length; i++)
		{
			merged_array[(list1.length + i)] = list2[i];
		}
		for(int i = 0; i < merged_array.length; i++)
		{
			for(int j = i + 1; j < merged_array.length; j++)
			{
				if(merged_array[i] > merged_array[j])
				{
					temp_place = merged_array[i];
					merged_array[i] = merged_array[j];
					merged_array[j] = temp_place;	
				}
			}
		}
		return merged_array;
	}
	public static void main(String[] args)
	{
		int temp_place;
		Scanner stdin = new Scanner(System.in);
		int arr1_size, arr2_size;
		System.out.print("Enter list1 size and contents: ");
		arr1_size = stdin.nextInt();
		int[] arr1 = new int[arr1_size];
		for(int i = 0; i < arr1_size; i++)
		{
			arr1[i] = stdin.nextInt();
		}
		System.out.print("Enter list2 size and contents: ");
		arr2_size = stdin.nextInt();
		int[] arr2 = new int[arr2_size];
		for(int i = 0; i < arr2_size; i++)
		{
			arr2[i] = stdin.nextInt();
		}
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = i + 1; j < arr1.length; j++)
			{
				if(arr1[i] > arr1[j])
				{
					temp_place = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp_place;	
				}
			}
		}
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = i + 1; j < arr2.length; j++)
			{
				if(arr2[i] > arr2[j])
				{
					temp_place = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp_place;	
				}
			}
		}
		System.out.print("List1 is ");
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println("");
		System.out.print("List2 is ");
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
		System.out.println("");
		int[] new_arr = merge(arr1, arr2);
		System.out.print("The merged list is ");
		for(int i = 0; i < new_arr.length; i++)
		{
			System.out.print(new_arr[i] + " ");
		}
		stdin.close();
	}
}
