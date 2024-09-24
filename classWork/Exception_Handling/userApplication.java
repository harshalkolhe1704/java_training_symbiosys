/*
 * write a program to user management system where you register a user with 
 * username,age and address.if user age is below 18 and above 68 invalidate 
 * the user.where you need to find user based on userID which is generated at 
 * the time of registration. If the userId is not found should throw an exception.
 */
import java.util.Scanner;

class invalidageException extends Exception
{
	public invalidageException(String msg)
	{
		super(msg);
	}
}
class usernotfoundException extends Exception
{
	public usernotfoundException(String msg)
	{
		super(msg);
	}
}

class user
{
	static int ID;
	int userId;
	String userName;
	int age;
	static
	{
		ID = 100;
	}
	
	public user()
	{
		this.userId = ID;
		this.userName = userName;
		this.age = age;
		ID++;
	}

	public int getUserId() 
	{
		return userId;
	}

	public void setUserId(int userId) 
	{
		this.userId = userId;
	}

	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) throws invalidageException 
	{
		if(age < 18 || age > 68)
		{
			throw new invalidageException("Invalid User age.");
		}
		else
		{	
			this.age = age;
		}
	}

	@Override
	public String toString() 
	{
		return "User [userId=" + userId + ", userName=" + userName + ", age=" + age + "]";
	}
		
}
	
	

public class userApplication 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userName;
		int userId,age;
		user[] u = new user[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the user name:");
			userName = sc.next();
			System.out.println("Enter the user age:");
			age = sc.nextInt();
			
			u[i] = new user();
			
			try
			{
				u[i].setUserName(userName);
				u[i].setAge(age);
			}
			catch(invalidageException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(u[i]);
			
			System.out.println("Enter user id to find the user:");
			userId = sc.nextInt();
			try
			{
				if(u[i].getUserId() != userId)
				{
					throw new usernotfoundException("Invalid user id..please try again.");
				}
				else
				{
					System.out.println(u[i]);
				}
			}
			catch(usernotfoundException e )
			{
				System.out.println(e.getMessage());
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
