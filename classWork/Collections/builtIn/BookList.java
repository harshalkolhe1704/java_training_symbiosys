/*
 *1) Create a arrayList with bookId, bookName, authorName and publisher.
 * 
 *2)Create a list of employees with their empid,name and salary
 */


package builtIn;

import java.util.*;
class book
{
	int bookId;
	String bookName;
	String authorName;
	String publishYear;
	public book(int bookId, String bookName, String authorName, String publishYear) 
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishYear = publishYear;
	}
	public int getBookId() 
	{
		return bookId;
	}
	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}
	public String getBookName() 
	{
		return bookName;
	}
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
	public String getAuthorName() 
	{
		return authorName;
	}
	public void setAuthorName(String authorName) 
	{
		this.authorName = authorName;
	}
	public String getPublisher() 
	{
		return publishYear;
	}
	public void setPublisher(String publisher) 
	{
		this.publishYear = publisher;
	}
	@Override
	public String toString() 
	{
		return "book [bookId=" + bookId + "\n"
			   +      " bookName=" + bookName + "\n"
			   +      " authorName=" + authorName +  "\n"
			   +      " publisher="  + publishYear + "]";
	}

}

class employee
{
	int empId;
	String empName;
	int empSalary;
	public employee(int empId, String empName, int empSalary) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public int getEmpSalary() 
	{
		return empSalary;
	}
	public void setEmpSalary(int empSalary) 
	{
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}

class mobile
{
	int mobileId,mobNo;
	String mobileName,serviceProvider;
	public mobile(int mobileId, int mobNo, String mobileName, String serviceProvider) 
	{
		super();
		this.mobileId = mobileId;
		this.mobNo = mobNo;
		this.mobileName = mobileName;
		this.serviceProvider = serviceProvider;
	}
	public int getMobileId() 
	{
		return mobileId;
	}
	public void setMobileId(int mobileId) 
	{
		this.mobileId = mobileId;
	}
	public int getMobNo() 
	{
		return mobNo;
	}
	public void setMobNo(int mobNo) 
	{
		this.mobNo = mobNo;
	}
	public String getMobileName() 
	{
		return mobileName;
	}
	public void setMobileName(String mobileName) 
	{
		this.mobileName = mobileName;
	}
	public String getServiceProvider() 
	{
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) 
	{
		this.serviceProvider = serviceProvider;
	}
	@Override
	public String toString() {
		return "mobile [mobileId=" + mobileId + ", mobNo=" + mobNo + ", mobileName=" + mobileName + ", serviceProvider="
				+ serviceProvider + "]";
	}
	
	
	
	
}

public class BookList 
{
	public static void bookList()
	{
		ArrayList<book> arr = new ArrayList<book>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{	
			System.out.println("Enter the book Id:");
			int bookId = sc.nextInt();
			System.out.println("Enter the book name:");
			String bookName = sc.next();
			System.out.println("Enter the Author name:");
			String authorName = sc.next();
			System.out.println("Enter the publish year:");
			String publishYear = sc.next();
			arr.add(new book(bookId,bookName,authorName,publishYear));
		}
		for(book b : arr)
		{
			System.out.println(b);
		}
		
	}
	

	public static void employeeList()
	{
		ArrayList<employee> emplist = new ArrayList<employee>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("------------------------------------------------");
			System.out.println("Enter the information of employee " + (i+1) + "");
			System.out.println("Enter the employee id:");
			int empid = sc.nextInt();
			System.out.println("Enter the employee name:");
			String empName = sc.next();
			System.out.println("Enter the salary:");
			int empSalary = sc.nextInt();
			
			emplist.add(new employee(empid,empName,empSalary));
		}
		for(employee e : emplist)
		{
			System.out.println(e);
		}
	}
	public static void mobileList()
	{
		ArrayList<employee> mobiles = new ArrayList<employee>();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("");
			System.out.println("");
		}
		while()
		
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//BookList.bookList();
		BookList.employeeList();
		BookList.mobileList();
		

	}

}
