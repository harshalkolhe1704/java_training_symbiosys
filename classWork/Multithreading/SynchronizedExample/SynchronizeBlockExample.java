package SynchronizedExample;

class myClassSynchronized
{
	private static int count = 0;
	public void add(int value)
	{
		synchronized (this) 
		{
			this.count += value;
			System.out.println("\n" + count);
		}
	}
}

public class SynchronizeBlockExample extends Thread
{
	myClassSynchronized obj = new myClassSynchronized();
	public void run()
	{
		obj.add(100);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SynchronizeBlockExample obj1 = new SynchronizeBlockExample();
		SynchronizeBlockExample obj2 = new SynchronizeBlockExample();
		obj1.start();
		obj2.start();
	}

}
