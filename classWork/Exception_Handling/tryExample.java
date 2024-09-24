

public class tryExample 
{
	public static void t1()
	{
		int a,b,c;
		a=10;b=0;
		try
		{
			c = a/b;
			System.out.println(" C = " + c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static void t2()
	{
		int a,b,c;
		a=10;b=2;
		try
		{
			c = a/b;
			System.out.println(" C = " + c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Trying to divided a no by 0");
		}
		finally
		{
			System.out.println("Finally Executed");
		}
		c = a + b;
		System.out.println(" C = " + c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		tryExample.t1();
		tryExample.t2();

	}

}
