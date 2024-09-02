//11)calculate average of number in given array
import java.util.*;
public class AvrageNoArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int [] number = new int[size];
		int sum = 0;
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Enter the number :" + (i+1));
		    number[i] = sc.nextInt();
		    sum = sum + number[i];
		}
		System.out.println("Sum of the array is : " + sum);
		int avrage = sum / number.length;
		System.out.println("Average of the array is : " + avrage);
		
		
	

	}

}
