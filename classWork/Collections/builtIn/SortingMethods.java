package builtIn;

import java.util.*;

class Book1 implements Comparable<Book1>
{
	int bookId;
	String bookName;
	
	public Book1(int bookId, String bookName) 
	{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	@Override
	public String toString() 
	{
		return "Book1 [\nbookId=" + bookId  + "\nbookName=" + bookName + "]" + "\n";
	}

	@Override
	public int compareTo(Book1 obj) 
	{
		 //TODO Auto-generated method stub
//		if(bookId == obj.bookId)
//		{
//			return 0;
//		}
//		else if(bookId > obj.bookId)
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
		return bookName.compareTo(obj.bookName);
	}
	
	
}

class person1 implements 
public class SortingMethods 
{
	public static void bookList()
	{
		ArrayList<Book1> list = new ArrayList<Book1>();
//		Scanner sc = new Scanner(System.in);
		Book1 b1 = new Book1(21,"D");
		Book1 b2 = new Book1(1,"A");
		Book1 b3 = new Book1(121,"L");
		Book1 b4 = new Book1(34,"P");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		System.out.println(list);
		System.out.println("-----------------------");
		System.out.println("After sort");
		Collections.sort(list);
		System.out.println(list);
		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 bookList();

	}

}
