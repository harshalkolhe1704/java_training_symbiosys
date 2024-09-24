/*write a java for String array with user define value and sort it*/


package builtIn;


import java.util.*;
public class SortArrayList 
{
	public static void sortArray()
	{
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		System.out.println("Enter the Strings:");
		for(int i=0;i<str.length;i++)
		{
			System.out.println("Strings " + (i+1) + " :");
			str[i] = sc.next();
		}	
		System.out.println("Elements are : ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		Arrays.sort(str);
		System.out.println("After sorting:");
		System.out.println("Elements are : ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		Arrays.sort(str, str.length, 0);
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	public static void arraylist()
	{
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SortArrayList.sortArray();

	}

}




//ArrayList<String> arr = new ArrayList<String>();
//
//arr.add("Durgesh");
//arr.add("Aditya");
//arr.add("Rohit");
//System.out.println(arr);
//System.out.println("---------------------------------");
//System.out.println("After Sorting elements");
//Collections.sort(arr);
//System.out.println("---------------------------------");
//System.out.println(arr);
//Collections.reverse(arr);
//System.out.println(arr);
