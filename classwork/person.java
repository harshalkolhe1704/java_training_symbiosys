import java.util.*;
public class person 
{
	int id;
	String name;
	int age;
	public person(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.println("Id is : " + id);
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
	}
	static
	{
		System.out.println("Hi.....");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many persons records:");
		int n = sc.nextInt();
		person [] p1 = new person[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Person :" + (i+1));
			System.out.println("---------------------");
			System.out.println("Enter the ID:");
			int id = sc.nextInt();
			System.out.println("Enter the name:");
			String name = sc.next();
			System.out.println("Enter the age:");
			int age = sc.nextInt();
			
			p1[i] = new person(id,name,age);
		}
		System.out.println("Details of the Person are:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Person :" + (i+1));
			System.out.println("---------------------");
			p1[i].display();
			
		}
		
		for(person p : p1)
		{
//			System.out.println("id :" + p.id);
//			System.out.println("name :" + p.name);
//			System.out.println("age:" + p.age)
//			System.out.println("Person :" + (p1));
			System.out.println("---------------------");
			p.display();

		}

	}

}
