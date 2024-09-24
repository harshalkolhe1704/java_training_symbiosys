package polymorphism;

public class student 
{
	int rollno;String name;
	public student()
	{
		//default constructor
	}
	public student(int a)
	{
		//parameterized constructor only one parameter
	}
	public student(int a,int b)
	{
		//parameterized constructor two parameter
	}
	public student(String a,String b)
	{
		//parameterized constructor two parameter with diff datatype
	}
	public void register()
	{
		System.out.println("No arguments method....");
	}
	
	public void register(int rn)
	{
		this.rollno = rn;
		System.out.println("Only to register with roll number...");
	}
	public void register(int rn,String name)
	{
		this.rollno = rn;
		this.name = name;
		System.out.println("Register with roll number as well as name...");
	}
	public void register(String name,int rn)
	{
		this.rollno = rn;
		this.name = name;
		System.out.println("Register with roll number as well as name Along with change is sequence");
	}
	
	public static void main(String [] args)
	{
		student s1 = new student();
		s1.register();
		s1.register(2);
		s1.register(2,"hk");
		s1.register("hk",2);
	}
	

}
