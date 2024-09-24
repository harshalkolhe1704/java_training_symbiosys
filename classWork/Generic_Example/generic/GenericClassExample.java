package generic;

public class GenericClassExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GenericClass<String> obj1 = new GenericClass<String>();
		obj1.set("Harshal");
		System.out.println("HI " + obj1.get());
		
		GenericClass<Integer> obj2 = new GenericClass<Integer>();
		obj2.set(10);
		System.out.println("Value is " + obj2.get());

	}

}
