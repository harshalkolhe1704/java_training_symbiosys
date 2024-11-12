//25) Find the Minimum and Maximum Element with their Index Number from Given Array

import java.util.Scanner;

public class A_25_FindMInMaxWithIndex 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		int [] array = new int[size];
		System.out.println("Enter the Elements in the array:");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Elements in the array are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
		
		int minimum = array[0];
		int maximum = array[0];
		int minIndex = 0;
		int maxIndex = 0;
		
		for(int i=0;i<size;i++)
		{
			if(array[i] < minimum)
			{
				minimum = array[i];
				minIndex = i;
			}
			
			if(array[i] > maximum)
			{
				maximum = array[i];
				maxIndex = i;
			}
		}
		
		System.out.println("Minimum element in the array is : " + minimum + " at the index " + minIndex);
		System.out.println("Maximum element in the array is : " + maximum + " at the index " + maxIndex);
	}

}
