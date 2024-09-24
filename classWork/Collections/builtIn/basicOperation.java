package builtIn;


import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class basicOperation  
{
 public static void main(String[] args) 
 {
	   LinkedList<Integer> list = new LinkedList<>();
	   Scanner scanner = new Scanner(System.in);
	    list.add(10);
	    list.add(30);
	    list.add(50);
System.out.println("Initial LinkedList: " + list);
 System.out.println("Enter an element to insert at the first position:");
	        int firstElement = scanner.nextInt();
	        list.addFirst(firstElement);
 System.out.println("Enter an element to insert at the last position:");
	        int lastElement = scanner.nextInt();
	        list.addLast(lastElement);
System.out.println("LinkedList after insertion: " + list);
System.out.println("Enter an element to search for:");
	        int searchElement = scanner.nextInt();
	        if (list.contains(searchElement)) 
	        {
System.out.println(searchElement + " is found in the LinkedList.");
	        } else
	        {
System.out.println(searchElement + " is not found in the LinkedList.");
	       
}
	   Collections.sort(list);
	  System.out.println("Sorted LinkedList: " + list);
	    scanner.close();
	    }
	}




