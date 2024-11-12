//23.Find Duplicate in a array

import java.util.HashSet;
import java.util.Scanner;

public class A_23_FindDuplicate 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!s.add(arr[i]))
			{
				System.out.println("Duplicate numbers from the given array is : " + arr[i]);
			}
		}
	}
	
}
