//8)find the square root of given number

import java.util.*;
public class SquareRoot 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		double SquareRoot = Math.sqrt(num);
		System.out.println("Square root of the given number = " + " is : " + SquareRoot);

	}

}
