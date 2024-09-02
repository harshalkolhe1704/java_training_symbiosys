//1)calculate compound interest and simple interest


import java.util.*;
public class Interest 
{
	public static void calculate()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principle amount:");
		double priAmount = sc.nextDouble();
		System.out.println("Enter the Rate :");
		double rate = sc.nextDouble();
		System.out.println("Enter the years:");
		double years = sc.nextDouble();
		System.out.println("Enter the time money : ");
		double time = sc.nextDouble();
		
		//calculate simple interest..... p * r * n /100
		double simpleInterest = priAmount * rate * years / 100;
		System.out.println("Simple Interest is : " + simpleInterest);
		
		//calculate compound interest..... p(1+r/n)^nt
		double compoundInterest = priAmount  * Math.pow((1+rate/years),years*time);
		System.out.println("Compound year is : " + compoundInterest);

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interest.calculate();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the principle amount:");
//		double priAmount = sc.nextDouble();
//		System.out.println("Enter the Rate :");
//		double rate = sc.nextDouble();
//		System.out.println("Enter the years:");
//		double years = sc.nextDouble();
//		System.out.println("Enter the time money : ");
//		double time = sc.nextDouble();
//		
//		//calculate simple interest..... p * r * n /100
//		double simpleInterest = priAmount * rate * years / 100;
//		System.out.println("Simple Interest is : " + simpleInterest);
//		
//		//calculate compound interest..... p(1+r/n)^nt
//		double compoundInterest = priAmount  * Math.pow((1+rate/years),years*time);
//		System.out.println("Compound year is : " + compoundInterest);

	}

}
