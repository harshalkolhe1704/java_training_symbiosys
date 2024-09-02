//15)find the minimum and maximum number from given array
import java.util.*;
public class MaxMinArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int [] array = new int[n];
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		int maximum = array[0];
		int minimum = array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if (array[i] > maximum)
			{
				maximum = array[i];
			}
			if(array[i] < minimum)
			{
				minimum = array[i];
			}
			
		}
		System.out.println("Maximum number from the array is: " + maximum);
		System.out.println("Minimum number from the array is: " + minimum);

	}

}
