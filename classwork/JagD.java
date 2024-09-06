import java.util.*;
public class JagD 
{
	public static void jagD_example1()
	{
		String [] cities = {"mumbai","Nashik","Pune"};
		
		for(String i : cities)
		{
			System.out.println( i + " ");
		}
	}
	
	public static void jagD_example2()
	{
		Scanner scan = new Scanner(System.in);
		
		String [] cities = new String[3];
		
		System.out.println("Enter the cities:");
		for(int i=0;i<cities.length;i++)
		{
			cities[i] = scan.next();
		}
		System.out.println("cities are :(using for loop)");//using for loop
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
		System.out.println("cities are :(using foreach loop)");//using foreach loop
		for(String x : cities)
		{
			System.out.println( x + " ");
		}
	}
    
	public static void jaggedArray1()
	{
		int myarray[][] = new int[3][];
		//define and initialize jagged array
		myarray[0] = new int[] {1,2,3};
		myarray[1] = new int[] {4,5};
		myarray[2] = new int[] {6,7,8,9};
		//display the jagged array
		System.out.println("Two dimensional jagged array:");
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=0;j<myarray[i].length;j++)
			{
				System.out.print(myarray[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void jaggedArray2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array row:");
		//creating an array
		int n = sc.nextInt();
		int array[][] = new int[n][];
		for(int i=0;i<n;i++)
		{
			System.out.println("Input number of element in " + (i+1) + " row");
			array[i] = new int[sc.nextInt()];
		}
		int count = 0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				count++;
			}
		}
		System.out.println("Input " + count + " array elements :");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array elements is:");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void jaggedArray3() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array row:");
		//creating an array
		int row = sc.nextInt();
		String array[][] = new String[row][];
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter the states " + (i+1) + " row");
			array[i] = new String[sc.nextInt()];
		}
		int count = 0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				count++;
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter the states:");
			array[i][0] = sc.next();
			System.out.println("Enter the cities:");
			for(int j=1;j<array[i].length;j++)
			{
				array[i][j] = sc.next();
			}
		}
		System.out.println("states and Cities are :");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//JagD.jagD_example1();
		//JagD.jagD_example2();
		//JagD.jaggedArray1();
		//JagD.jaggedArray2();
		JagD.jaggedArray3();


		

	}

}
