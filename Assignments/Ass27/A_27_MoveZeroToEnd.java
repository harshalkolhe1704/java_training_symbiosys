import java.util.Scanner;

public class A_27_MoveZeroToEnd 
{
	public static void movezero(int array[])
	{
		int nonZeroIndex = 0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] != 0)
			{
				int temp = array[i];
				array[i] = array[nonZeroIndex];
				array[nonZeroIndex] = temp;
				
				nonZeroIndex++;
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter the Elements in the array:");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements before moving to zero");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		movezero(arr);
		
		System.out.println("After moving zero to the end Array is:");
		for(int num : arr)
		{
			System.out.println(num + " ");
		}
	}

}
