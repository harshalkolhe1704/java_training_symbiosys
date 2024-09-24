import java.util.*;

class myexception extends Exception
{
	public myexception(String a)
	{
		super(a);
	}
}
public class ExceptionsExamples 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		try
		{
			if(age<0)
			{
				throw new myexception("My Exception catched");
			}
		}
		catch(myexception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
