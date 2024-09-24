/*Write a program to create two students by coping their properties to each other
*/
package ObjectClass;

public class TwoStudents implements Cloneable
{
	int rn;
	String name;
	public static void copyProperties()
	{
		TwoStudents ts1 = new TwoStudents();
		TwoStudents ts2 = new TwoStudents();
		
		int a = 88; int b = 21;
		String str1 = "harshal";
		String str2 = "Santosh";
		
		ts1.name = "harshal";
		ts1.rn = 12;
		
		
		try
		{
			TwoStudents ts3 = (TwoStudents) ts1.clone();
			System.out.println(ts1.equals(ts3));
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TwoStudents.copyProperties();
		

	}

}
