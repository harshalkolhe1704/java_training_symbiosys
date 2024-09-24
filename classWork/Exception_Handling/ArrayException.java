
public class ArrayException 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] array = new int[] {25,9,4,5,32};
		for(int i=0;i<array.length;i++)
		
		{
			try
			{
				int result = array[i] / 0;
				System.out.println("Result is : " + result);

			}
			catch(ArithmeticException e)
			{
				System.out.println( e.getMessage());
			}
			
			
		}
		

	}

}
