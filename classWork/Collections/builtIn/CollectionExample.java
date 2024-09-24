package builtIn;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.ListIterator;
import java.util.*;

//class person
//{
//	
//}

public class CollectionExample 
{
	public static void ArrayListexample1()
	{
		ArrayList mylist = new ArrayList();
		mylist.add("H");
		mylist.add(1);
		mylist.add('C');
		mylist.add(13.43);
		System.out.println(mylist);
		System.out.println("-------------------------------");
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		System.out.println("-------------------------------");
		for(Object O : mylist)
		{
			System.out.println(O);
		}
		System.out.println("--------------------------------");
		Iterator it = mylist.iterator();
		while(it.hasNext())
		{
			Object object = (Object) it.next();
			System.out.println(object);
		}
		System.out.println("---------------------------------");
		ListIterator list = mylist.listIterator();
		while(list.hasNext())
		{
			Object object = (Object) list.next();
			System.out.println(object);
		}
		System.out.println("---------------------------------");
		while(list.hasPrevious())
		{
			Object object = (Object) list.previous();
			System.out.println(object);
		}
		
	}
	public static void example2()
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Rohit");
		a1.add("Durgesh");
		a1.add("Santosh");
		a1.add("Harshal");
	    System.out.println("---------------------------------");
	    System.out.println(a1);
		a1.addFirst("Tejas");
		System.out.println("---------------------------------");
		System.out.println(a1);
		a1.addFirst("Sai");
		System.out.println("---------------------------------");
		System.out.println(a1);
		a1.addFirst("Vijay");
		System.out.println("---------------------------------");
		System.out.println(a1);
		a1.remove(1);
		System.out.println("----------------------------------");
		System.out.println(a1);
		
		System.out.println("----------------------------------");
		System.out.println("Is list empty " + a1.isEmpty());
		System.out.println("Size of List " + a1.size());
		System.out.println("Found " + a1.contains("Harshal"));
		
		Collections.sort(a1);
		System.out.println("----------------------------------");
		System.out.println(a1);
		
		
	}

	public static void LinkedListExample3()
	{
		LinkedList li = new LinkedList();
		li.add("ABC");
		li.add(12);
		li.add(21.3);
		System.out.println("--------------------");
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.get(1));
		System.out.println(li.getFirst());
		li.remove(2);
		System.out.println(li);
		
	}
	public static void StackExample4()
	{
		Stack<String> s = new Stack<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		System.out.println(s);
		s.push("E");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		s.add(1, "Test");
		s.add("Test 3");
		System.out.println(s);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//CollectionExample.ArrayListexample1();
		//CollectionExample.example2();
		CollectionExample.LinkedListExample3();
		CollectionExample.StackExample4();

	}

}
