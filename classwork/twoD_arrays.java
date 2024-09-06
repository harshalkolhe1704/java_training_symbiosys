import java.util.*;
public class twoD_arrays 
{
	public static void td_example1()
	{
		int sum = 0;
		int nums[][] = new int[3][5];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				nums[i][j] = (i + 1) * (j + 1);
				sum += nums[i][j];
			}
		}
		System.out.println("Two Dimensional array:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(nums[i][j] + " ");
			
			}
			
			System.out.println();
			
		}
		System.out.println("Sum of the two dimensional array is:");
		System.out.println(sum);
	}
	public static void td_example2()
	{
		Scanner sc = new Scanner(System.in);
		
		int [][] nums = new int[3][2];
		int sum = 0;
		System.out.println("Enter the elements:");
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j] = sc.nextInt();
				sum = sum + nums[i][j];
			}
		}
		System.out.println("Elements of the array are:");
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of the two arrays are:");
		System.out.println(sum);
		
		
	}
	public static void td_example3()
	{
		Scanner scan = new Scanner(System.in);
		String [][] country = new String[2][3];
		
		
		for(int i=0;i<country.length;i++)
		{
			System.out.println("Enter the states :");
			country[i][0] = scan.next();
			System.out.println("Enter the cities:");
			for(int j=1;j<country[i].length;j++)
			{
			country[i][j] = scan.next();
			}
		}
		System.out.println("Display:");
		for(int i=0;i<country.length;i++)
		{
//			System.out.println("States are:");
//			System.out.print(country[i][0] + " ");
//			System.out.println("Cities are:");
			for(int j=0;j<country[i].length;j++)
			{
				System.out.print(country[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//twoD_arrays.td_example1();
		//twoD_arrays.td_example2();
		twoD_arrays.td_example3();

	}

}
