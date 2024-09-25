//7)check number is palindrome or not

import java.util.*;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		
		while(num != 0)
		{
			int dig = num % 10;
			rev = rev * 10 + dig;
			num = num / 10;
		}
		if(temp == rev)
		{
			System.out.println( temp + " is a palindrome number :");
		}
		else
		{
			System.out.println(temp + " is not a palidndrome number :");
		}
		
		

	}

}
