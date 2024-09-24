package SynchronizedExample;

class mytable
{
	public synchronized static void testTable()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("\n" + i);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
class thread1 extends Thread
{
	@Override
	public void run()
	{
		mytable.testTable();
	}
}
class thread2 extends Thread
{
	@Override
	public void run()
	{
		mytable.testTable();
	}
}

public class StaticSynchronizExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		thread1 obj1 = new thread1();
		thread2 obj2 = new thread2();
		obj1.start();
		obj2.start();

	}

}
