package ObjectClass;

import java.lang.reflect.Constructor;

public class ObjectClassExample 
{
	String str = "hello from harshal";
	
	public static void ObjectMethod1()
	{
		//create a object using new operator
		ObjectClassExample obj1 = new ObjectClassExample();
		System.out.println(obj1.str);
		
	}
	public static void ObjectMethod2()
	{
		//creating object of a class using newInstance Method
		try
		{
			ObjectClassExample obj2 = ObjectClassExample.class.newInstance();
			System.out.println(obj2.str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	public static void ObjectMethod3()
	{
		try
		{
			Constructor<ObjectClassExample> obj3 = ObjectClassExample.class.getConstructor();
			ObjectClassExample obj = obj3.newInstance();
			System.out.println(obj.str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ObjectClassExample.ObjectMethod1();
		ObjectClassExample.ObjectMethod2();
		ObjectClassExample.ObjectMethod3();

	}

}
