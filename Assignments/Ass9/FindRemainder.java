/*Write a program to find remainder without using % operator*/

import java.util.*;
public class FindRemainder 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the divident :");
		int divident = sc.nextInt();
		System.out.println("Enter the divisor : ");
		int divisor = sc.nextInt();
		
		
		int quotient = divident / divisor;
		
		int remainder = divident - (divisor * quotient);
		System.out.println("The quotient is : " + quotient + "\n " +" Remainder is: " + remainder);
		

	}

}
