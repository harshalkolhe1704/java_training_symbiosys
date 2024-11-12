import java.util.Scanner;

public class A_28_SearchStringWithFirstChar 
{
	public static int searchCharInString(String str, String SearchStr)
	{
		if(SearchStr.isEmpty())
		{
			return -1;
		}
		
		char firstChar = SearchStr.charAt(0);
		
		return str.indexOf(firstChar);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First String:");
		String str1 = scan.next();
		System.out.println("Enter the Second String:");
		String str2 = scan.next();
		
		int index = searchCharInString(str1, str2);
		if(index != -1)
		{
			System.out.println("Second String first character present at first string " + index + " index");
		}
		else
		{
			System.out.println("Second String first character not present at first string ");

		}
	}

}
