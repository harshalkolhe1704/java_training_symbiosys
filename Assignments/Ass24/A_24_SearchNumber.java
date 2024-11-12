//24.Search Number from Given 2D Matrix
import java.util.Scanner;
public class A_24_SearchNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns:");
		int cols = sc.nextInt();
		
		int [][] matrix = new int[rows][cols];
		System.out.println("Enter the elements in matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elements in the matrix are:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Enter the number to search in the matrix:");
		int num = sc.nextInt();
		
		boolean result = false;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(matrix[i][j] == num)
				{
					result = true;
					
					System.out.println("Number " + num + " found at position " + i + " , " + j );
					break;
				}
			}
			if(result) break; //if the number find, exit outer loop
		}
		if(!result)
		{
			System.out.println("Number " + num + " not found in the matrix.");
		}
	}
}
