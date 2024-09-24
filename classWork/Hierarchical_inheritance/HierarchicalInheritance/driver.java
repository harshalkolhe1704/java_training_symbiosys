package HierarchicalInheritance;

public class driver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		person p1 = new person();
		System.out.println("Personal details");
		System.out.println(p1);
		person p2 = new person("harshal","nashik");
//		System.out.println(p2);
		if(p2 instanceof person)
		{
			System.out.println("Person details " + p2);
		}
		p2 = new employee(21,10000,"IT");
		
		if(p2 instanceof employee)
		{
			System.out.println("employee details " + p2);
		}
		
		p2 = new studnt("harshal","nashik","BCA",75);
		if(p2 instanceof studnt)
		{
			System.out.println("Student details: " + p2 );
		}

	}

}
