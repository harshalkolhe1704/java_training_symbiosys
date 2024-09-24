//Syntax--->
//for(datatype or classname identifier : collectionname)

import java.util.Scanner;

public class foreach 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
    	
		int [] marks = new int [5];
    	System.out.println("Entet the marks:");
    	for(int i=0;i<marks.length;i++)
    	{
    		marks[i] = scan.nextInt();
    	}
    	
    	for(int i : marks)
    	{
    		System.out.println(i);
    	}

	}

}
