//10)calculate grades of the student based on their marks
import java.util.*;
public class CalculateGrades 
{
	public static String showGrades(int marks)
	{
  
		if(marks >= 85)
		{
			return "A Grade";
		}
		else if(marks >= 70)
		{
			return "B Grade";
		}
		else if(marks >= 60)
		{
			return "C Grade";
		}
		else if(marks >= 40)
		{
			return "D Grade";
		}
		else 
		{
			return "Student is Fail";
			
		}

	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		int [] marks = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks of the students " + (i+1) + " : ");
			marks[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			String grades = showGrades(marks[i]);
			System.out.println("Students " + (i+1) + " with marks " + marks[i] + "\n" +
			"Grade of student " + (i+1) + " is :" + grades); 
		
		}
	}
}
