/*
 Write a program to show the person details like name and city from a person class
 where the deposit and withdraw come through bank interface. limit on withdraw 
 and minimum balance criteria this also has a implementation of a interface
 saving account class it also has-A relationship with person class.where 
 saving account show the details like account no,available balance, 
 before and after withdraw and deposit operations
 */
public class person 
{
	private String name;
	private String city;
	
	public person(String name,String city)
	{
		this.name = name;
		this.city = city;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String toString()
	{
		return "Person [name = " + name + "\n" + " city " + city ;
	}

}
