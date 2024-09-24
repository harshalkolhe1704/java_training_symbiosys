package polymorphism;

public class myAdd 
{
	public static void add(double a[])
	{
		double total = 0;
		int len = a.length;
		for(int i=0;i<a.length;i++)
		{
			
		}
		for(double d : a)
		{
			total = total + d;
		}
		System.out.println("Total is : " + total);
	}
	public static void add(int ...a)
	{
		int sum =0;
		for(int i : a)
		{
			sum = sum + i;
		}
		System.out.println("Sum is : " + sum);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		myAdd.add(5,3,4,2);
		myAdd.add(1,1,2,2,3,4,4,3,2,1,1,43,2,2,1,3);

	}

}
