/*Write a java program to perform arithmatic operations */
import java.util.*;
public class ArithmaticOperations 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.Addition:");
		System.out.println("2.Substraction:");
		System.out.println("3.Multiplication:");
		System.out.println("4.Division:");
		
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		
		System.out.println("Enter the first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scan.nextInt();
		
		int result = 0;
		switch(choice)
		{
		case 1:
			   result = num1 + num2;
			   System.out.println("Addition is : " + result);
			   break;
		case 2:
			   result = num1 - num2;
			   System.out.println("Substraction is : " + result);
			   break;
		case 3:
			   result = num1 * num2;
			   System.out.println("Multifplication is : " + result);
			   break;
		case 4:
			   result = num1 / num2;
			   System.out.println("Division is : " + result);
			   break;
		default:
			   System.out.println("Invalid conditions...");
			   break;
		}
		
	
			
			   
	}	
	
}

