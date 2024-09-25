import java.util.*;
public class findPower 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the number:");
		double base = sc.nextDouble();
		System.out.println("Enter the exponent of the number:");
		double exponent = sc.nextDouble();
		
		double result =  Math.pow(base, (exponent));
		System.out.println("base : " + base + "\n" + "exponent : " + exponent); 
		System.out.println("Power of the given number is : " + result );

	}

}
