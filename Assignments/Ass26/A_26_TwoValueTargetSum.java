
/*
 26) Given an Array of Integers and One Integer Value as Target Sum, Return the 
 Indexes of Two Elements that Add Up to the Target Value
 */

import java.util.Scanner;

public class A_26_TwoValueTargetSum 
{
	public static int[] findTargetSum(int[] array, int TargetSum)
	{
		int[] indices = new int[2];
		for(int i=0;i<array.length;i++)
		{
			for(int j= i+1;j<array.length;j++)
			{
				if(array[i] + array[j] == TargetSum)
				{
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the Elements in the array:");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements Are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the Target Sum:");
		int TargetSum = sc.nextInt();
		int[] indices = findTargetSum(arr, TargetSum);
		if(indices[0] == -1)
		{
			System.out.println("Target Sum Not Found");
		}
		else
		{
			System.out.println("Indices: " + indices[0] + " , " + indices[1]);
		}
	}

}
