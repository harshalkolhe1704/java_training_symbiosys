import java.util.Scanner;
public class SwappingValues 
{
	public static void Swapped1()//using temp variable
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scan.nextInt();
		System.out.println("-------------------------------");
		System.out.println("Before swapping the numbers:");
		System.out.println("Firts number is : " + num1);
		System.out.println("Second number is: " + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("-------------------------------");
		System.out.println("After swapping the numbers:");
		System.out.println("First number is : " + num1);
		System.out.println("Second number is : " + num2);
	}
	public static void Swapped2()//using without temp variable
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scan.nextInt();
		System.out.println("-------------------------------");
		System.out.println("Before swapping the numbers:");
		System.out.println("Firts number is : " + num1);
		System.out.println("Second number is: " + num2);
		
		num1 = num1 - num2; 
		num2 = num1 + num2; 
		num1 = num2 - num1; 
		System.out.println("-------------------------------");
		System.out.println("After Swapping the numbers:");
		System.out.println("First number is : " + num1);
		System.out.println("second number is : " + num2);
		
	}
    public static void SwapByValue(int a,int b)
    {
    	int temp = a;
		a = b;
		b = temp;
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//SwappingValues.Swapped1();
		//SwappingValues.Swapped2();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scan.nextInt();
		System.out.println("-------------------------------");
		System.out.println("Before swapping the numbers:");
		System.out.println("Firts number is : " + num1);
		System.out.println("Second number is: " + num2);
		
		SwappingValues.SwapByValue(num1,num2);
		
		System.out.println("-------------------------------");
		System.out.println("After swapping the numbers:");
		System.out.println("Firts number is : " + num1);
		System.out.println("Second number is: " + num2);


	}

}