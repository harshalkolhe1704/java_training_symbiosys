//14)addition of two D matrices to give the third matrix
import java.util.*;
public class TwoMatrixAddition 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number rows :");
		int rows = sc.nextInt();
		System.out.println("Enter the number columns :");
		int cols = sc.nextInt();
		int [][] A = new int[rows][cols];
		int [][] B = new int[rows][cols];
		int [][] C = new int[rows][cols];
		
		System.out.println("Enter the elements of the matrix A:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Elements are [ " + i + "][" + j + "] :");
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the matrix B:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Elements are [ " + i + "][" + j + "] :");
				B[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		System.out.println("Matrix Addion Are:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(C[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
