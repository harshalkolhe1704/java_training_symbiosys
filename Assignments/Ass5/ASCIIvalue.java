//5)find the ASCII value of given character

import java.util.*;
public class ASCIIvalue 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = sc.next().charAt(0);
		
		int asciivalue = (int) ch;
		
		System.out.println("Ascii Value of Given character " + 
		ch + " is : " + asciivalue );

	}

}
