/*
  Write a program for accepting data like empid, name, salary and location.
  depending upon user choice search a particular employee and sort the 
  employee from the collection of employee.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class employee
{
	int empId;
	String empName;
	int salary;
	String location;
	public employee(int empId, String empName, int salary, String location) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.location = location;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId 
				+ ", empName=" + empName 
				+ ", salary=" + salary 
				+ ", location=" + location
				+ "]";
	}
}

class idComparator implements Comparator<employee>
{
	public int compare(employee e1, employee e2)
	{
		if(e1.empId == e2.empId)
		{
			return 0;
		}
		else if(e1.empId > e2.empId)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class nameComparator implements Comparator<employee>
{
	public int compare(employee e1, employee e2)
	{
		return e1.empName.compareTo(e2.empName);
	}
}
class salaryComparator implements Comparator<employee>
{
	public int compare(employee e1, employee e2)
	{
		if(e1.salary == e2.salary)
		{
			return 0;
		}
		else if(e1.salary > e2.salary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class locationComparator implements Comparator<employee>
{
	public int compare(employee e1, employee e2)
	{
		return e1.location.compareTo(e2.location);
	}
}


public class A_19_EmployeeCollection 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<employee> emplist = new ArrayList<employee>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the employee id:");
			int empId = sc.nextInt();
			System.out.println("Enter the employee name:");
			String empName = sc.next();
			System.out.println("Enter the employee salary:");
			int salary = sc.nextInt();
			System.out.println("Enter the employee location:");
			String location = sc.next();
			
			emplist.add(new employee(empId,empName,salary,location));
		}
		for(employee s : emplist)
		{
			System.out.println(s);
		}
		do {
		System.out.println("-------------------------------------");
		System.out.println("1.Sort using the employee id:");
		System.out.println("2.Sort using the employee name:");
		System.out.println("3.Sort using the employee salary:");
		System.out.println("4.Sort using the employee location:");
		System.out.println("5. Exit");
		System.out.println("-------------------------------------");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 : 
			System.out.println("-----------------Sorting using id-------------------------");
			Collections.sort(emplist, new idComparator());
			System.out.println(emplist);
			for(employee s : emplist)
			{
				System.out.println(s);
			}
		break;
		case 2:
			System.out.println("--------------Sorting using name--------------------------");
			Collections.sort(emplist, new nameComparator());
			System.out.println(emplist);
			for(employee e : emplist)
			{
				System.out.println(e);
			}
		break;
		case 3:
			System.out.println("--------------Sorting using salary--------------------------");
			Collections.sort(emplist, new salaryComparator());
			System.out.println(emplist);
			for(employee e : emplist)
			{
				System.out.println(e);
			}
		break;
		case 4:
			System.out.println("--------------Sorting using location--------------------------");
			Collections.sort(emplist, new locationComparator());
			System.out.println(emplist);
			for(employee e : emplist)
			{
				System.out.println(e);
			}
		break;
		case 5 :
			System.exit(0);
		}

		}while(true);
		
	}

}

