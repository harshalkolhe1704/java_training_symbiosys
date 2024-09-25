//13)sort an array in ascending order

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
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
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(array[i] < array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("After sorting the array:");
		for(int i=0;i<10;i++)
		{
			System.out.println(array[i]);
		}

	}

}
