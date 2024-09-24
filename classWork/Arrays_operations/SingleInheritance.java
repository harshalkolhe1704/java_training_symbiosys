/*write a java program to calculate netpay for an employee whose basic salary is 10000rs
  DA is 2% of basic,HRA is 5% of basic,TA is 1% of basic and he is eligible for 2500
  permonth as a PA contribution.you are requested to accept the data from the user as 
  personal details like(name,age,address,date_of_birth)*/
//access personal details to set data 
//calpay()
// show()

class employee
{
	String name;
	int age;
	String address;
	String DOB;
	public String getName() 
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}
	public String getAddress() 
	{
		return address;
	}
	public String getDOB() 
	{
		return DOB;
	}
	public void setData()
	{
		this.name = "harsh";
		this.address = "nashik";
	}

	//	public employee()
//	{
//		name = name;
//		age = age;
//		address = address;
//		DOB = DOB;
//	}
//	public employee(String name,int age,String address,String DOB)
//	{
//		this.name = name;
//		this.age = age;
//		this.address = address;
//		this.DOB = DOB;
//	}
	
	
}
class manager extends employee
{
	float salary = 10000 ;
//	public manager()
//	{
//		salary = salary;
//	}
	public manager(String name,int age,String address,String DOB,float salary ) 
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.DOB = DOB;
		this.salary = salary;
	}
	
//	public void calpay(double DA)
//	{
//	    DA = (2/100) * salary;
//		System.out.println("DA is : " + DA );
//	}
	
	public void show1()
	{
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
		System.out.println("Address is : " + address);
		System.out.println("Date of birth is : " + DOB);
		System.out.println("Salary is :" + salary);
		//System.out.println("DA is : " + DA );
		
	}
}


public class SingleInheritance {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		manager m1 = new manager("harsh",20,"nashik","17/7/04",10000);
		m1.show1();
		
		

	}

}
