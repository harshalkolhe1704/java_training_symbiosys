package builtIn;

import java.util.*;
class student 
{
	int rollno;
	String studName;
	int studAge;
	public student(int rollno, String studName, int studAge) 
	{
		super();
		this.rollno = rollno;
		this.studName = studName;
		this.studAge = studAge;
	}
	@Override
	public String toString() 
	{
		return "student [rollno=" + rollno + ", studName=" + studName + ", studAge=" + studAge + "]";
	}	
	
}
class rnComparator implements Comparator<student>
{
	public int compare(student s1, student s2)
	{
		if(s1.rollno == s2.rollno)
		{
			return 0;
		}
		else if(s1.rollno > s2.rollno)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

class nameComparator implements Comparator<student>
{
	public int compare(student s1, student s2)
	{
		return s1.studName.compareTo(s2.studName);
	}
}
class AgeComparator implements Comparator<student>
{
	public int compare(student s1 , student s2)
	{
		if(s1.studAge == s2.studAge)
		{
			return 0;
		}
		else if(s1.studAge > s2.studAge)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}


public class ComparatorMethod 
{
	public static void example1()
	{
        ArrayList<student> list = new ArrayList<student>();
		
		list.add(new student(28,"Durgesh",21));
		list.add(new student(59,"Harshal",20));
		list.add(new student(13,"Santosh",19));
		list.add(new student(102,"Gaurav",18));
		
		System.out.println(list);
		System.out.println("-----------------------------------------");
		System.out.println("---------Before sorting------------");
		for(student s : list)
		{
			System.out.println(s);
		}
		System.out.println("-----------------------------------------");
		System.out.println("----------Sorting with roll numbers-------");
		Collections.sort(list, new rnComparator());
		System.out.println(list);
		for(student s : list)
		{
			System.out.println(s);
		}
		System.out.println("-----------------------------------------");
		System.out.println("----------Sorting with Names-------");
		Collections.sort(list, new nameComparator());
		System.out.println(list);
		for(student s : list)
		{
			System.out.println(s);
		}
		System.out.println("-----------------------------------------");
		System.out.println("----------Sorting with Age-------");
		Collections.sort(list, new AgeComparator());
		System.out.println(list);
		for(student s : list)
		{
			System.out.println(s);
		}
	}
	
	public static void example2()
	{
		ArrayList<student> studlist = new ArrayList<student>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the roll number:");
			int rn = sc.nextInt();
			System.out.println("Enter the name:");
			String name = sc.next();
			System.out.println("Enter the age:");
			int age = sc.nextInt();
			
			studlist.add(new student(rn,name,age));
		}
		for(student s : studlist)
		{
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//example1();
	    
		
	}

}
