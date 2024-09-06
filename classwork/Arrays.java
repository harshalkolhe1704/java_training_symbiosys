import java.util.*;
public class Arrays 
{
	public static void sd_example1()
	{
		int [] marks = new int[5];//declaring the array with size 5
		int [] rollno = new int[] {1,2,3,4,5};//declaring an array with initial value
		marks[0] = 5;
		marks[1] = 56;
		marks[2] = 69;
		marks[3] = 45;
		marks[4] = 40;
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
		
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println(rollno[i]);
		}
		
		
		
	}
	public static void sd_example2()

	{
		Scanner scan = new Scanner(System.in);
		
		int [] marks = new int[5];
		
		System.out.println("Enter the marks:");
		for(int i=0;i<marks.length;i++)
		{
			marks[i] = scan.nextInt();
		}
		System.out.println("Display the marks:");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		
		
		
	}

    public static void sd_example3()
    {
        Scanner scan = new Scanner(System.in);
		
		int [] marks = new int[5];
		int sum = 0;
		
		System.out.println("Enter the marks:");
		for(int i=0;i<marks.length;i++)
		{
			marks[i] = scan.nextInt();
			sum += marks[i];
		}
		System.out.println("sum of the marks:");
		System.out.println(sum);
	 }
    
    public static void sd_example4()
    {
        Scanner scan = new Scanner(System.in);
		
		int [] marks = new int[5];
		
		System.out.println("Enter the marks:");
		for(int i=0;i<marks.length;i++)
		{
			marks[i] = scan.nextInt();
		}
		System.out.println("Before sorting:");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		//System.out.println("display the marks");
		for(int i=0;i<marks.length;i++)
			{
				for(int j=0;j<marks.length;j++)
				{
					if(marks[i] < marks[j])
					{
						int temp = marks[i];
						marks[i] = marks[j];
						marks[j] = temp;
					}
				}
				
				
			}
			System.out.println("After sorting the marks:");
			for(int i=0;i<marks.length;i++)
			{
				System.out.println(marks[i]);
			}
			
			for(int i=0;i<marks.length;i++)
			{
				for(int j=0;j<marks.length;j++)
				{
					if(marks[i] > marks[j])
					{
						int temp = marks[i];
						marks[i] = marks[j];
						marks[j] = temp;
					}
				}
				
				
			}
			System.out.println("After Reversed the marks:");
			for(int i=0;i<marks.length;i++)
			{
				System.out.println(marks[i]);
			}
			
		
		
		
		
	}
    public static void sd_example5()
    {
    	Scanner scan = new Scanner(System.in);
    	
    	int [] marks = new int [5];
    	System.out.println("Entet the marks:");
    	for(int i=0;i<marks.length;i++)
    	{
    		marks[i] = scan.nextInt();
    	}
    	System.out.println("Display:");
    	for(int i=0;i<marks.length;i++)
    	{
    		System.out.println(marks[i]);
    	}
    	
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Arrays.sd_example1();
		//Arrays.sd_example2();
		//Arrays.sd_example3();
		//Arrays.sd_example4(); 
		
	}

}
