/*Write a program to grade a student based on their marks of 5 subjects
  were the personal details of the student are accepted by the parent 
  class using IS-A inheritance. */
import java.util.*;
class student
{
	int rollno;
	String studname;
	String department;
	public student(int rollno,String studname,String department)
	{
		this.rollno = rollno;
		this.studname = studname;
		this.department = department;
	}
	public void showdetails()
	{
		System.out.println("Roll number is:" + rollno);
		System.out.println("Student name is:" + studname);
		System.out.println("Department name is : " + department);
		
	}
}
class marks extends student
{
	Scanner sc = new Scanner(System.in);
	
	int [] marks = new int[] {60,70,65,86,72};
	int total = 0;

	public marks(int rollno, String studname,String department) 
	{
		super(rollno, studname,department);
		//this.marks = marks;
	}
	public void showdetails1()
	{
		
		System.out.println("Roll number is:" + rollno);
		System.out.println("Student name is:" + studname);
		System.out.println("Department name is : " + department);
		System.out.println("Marks of the Students: ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
			total = total + marks[i];
			
		}
		System.out.println("Total marks are: " + total );
		float percent = total * 100 / 500;
		System.out.println("Percentage of the student: " + percent);
		
		if(percent  > 90)
		{
			System.out.println("Grade is A");
		}
		else if(percent > 70)
		{
		    System.out.println("Grade is B");
		}
		else if(percent > 60)
		{
			System.out.println("Grade is C");
		}
		else if(percent >= 40)
		{
			System.out.println("Grade is D");
		}
		else 
		{
			System.out.println("Student is Failed..");
		}
	
	}
}
					
public class MultiLevelInheritance 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		marks m1 = new marks(1,"Santosh","BCA");
		m1.showdetails1();
		

	}

}
