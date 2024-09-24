import java.util.*;
class userException extends Exception
{
	public userException(String a)
	{
		super(a);
	}
}
class invalidCountryException extends Exception
{
	public invalidCountryException(String a)
	{
		super(a);
	}
}
public class userdefineException 
{
	String countryName;
	public void registerUser(String countryName) throws invalidCountryException,userException
	{
		if(!countryName.equals("India"))
		{
			throw new invalidCountryException("NRIs not allowed");
		}
//		else
//		{
//			System.out.println("only Indians allowed");
//		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		userdefineException ud1 = new userdefineException();
		try
		{
			ud1.registerUser("India");
		}
		catch(invalidCountryException | userException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
