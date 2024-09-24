/*write a program to accept the 5 subjects marks and calculate total 
and percentage for batch of 5 student*/

import java.util.*;
public class Student_Marks 
{
	int rollno;
	String name;
	int marks;
	
	public Student_Marks(int rollno,String name,int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("Roll number is : " + rollno);
		System.out.println("Name is : " + name);
		System.out.println("Marks are : " + marks);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the how many students records:");
		int n = scan.nextInt();
		
		Student_Marks batch[] = new Student_Marks[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the roll number:");
			int rollno = scan.nextInt();
			
			//scan.next();
			
			System.out.println("Enter the name:");
			String name = scan.next();
			
			//scan.nextInt();
			
			System.out.println("Enter the marks:");
			int marks = scan.nextInt();
			
			batch[i] = new Student_Marks(rollno,name,marks);
			
		}
		System.out.println("Records of the students are:");
		for(int i=0;i<n;i++)
		{
			batch[i].display();
		}
		
		int total = 0;
		
		for(int i=0;i<n;i++)
		{
			total = total + batch[i].marks;
		}
		System.out.println("Total Marks are : " + total);
		double percentage = 0;
		for(int i=0;i<n;i++)
		{
			percentage = total * 100 / 400;
		}
		System.out.println("Percentage of the students: " + percentage);

	}

}
