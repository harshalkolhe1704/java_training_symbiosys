//12)reverse an array

import java.util.*;
public class ReverseArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[10];
		System.out.println("Enter the array elements:");
		for(int i=0;i<10;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Elements in the arrays are:");
		for(int i=0;i<10;i++)
		{
			System.out.println(array[i]);
		}
		
		int start = 0;
		int end = array.length - 1;
		
		while(start < end)
		{
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println("Aftee Reversed the array:");
		for(int i=0;i<10;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
