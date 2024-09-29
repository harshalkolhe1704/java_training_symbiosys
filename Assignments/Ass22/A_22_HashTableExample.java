/*
 * java program to create a hash table for a student data like rollno ,
 * date of birth, student name and course enroll where rollno key for 
 * a roll no and print the hash table.
 */

import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Scanner;

class student
{
	int rollNo;
	String StudName;
	LocalDate date_of_birth;
	String enrollCourse;
	public student(int rollNo, String studName, String date_of_birth, String enrollCourse) 
	{
		this.rollNo = rollNo;
		this.StudName = studName;
		this.date_of_birth = LocalDate.parse(date_of_birth);
		this.enrollCourse = enrollCourse;
	}
	@Override
	public String toString() 
	{
		return "student [rollNo=" + rollNo + ", StudName=" + StudName + ", date_of_birth=" + date_of_birth
				+ ", enrollCourse=" + enrollCourse + "]";
	}
	
	
}
public class A_22_HashTableExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hashtable<Integer, student> studentTable = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student into the HashTable:");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
				System.out.println("Enter the Roll no of the student:");
				int rollNo = sc.nextInt();
				System.out.println("Enter the name of the student:");
				String name = sc.next();
				System.out.println("Enter the date of birth of student:");
				String DOB = sc.next();
				System.out.println("Enter the course name:");
				String courseName = sc.next();
				
				studentTable.put(rollNo,new student(rollNo,name,DOB,courseName));
				
		}
		
		for(Integer rollNo : studentTable.keySet())
		{
			System.out.println(studentTable.get(rollNo));
		}
	}

}
