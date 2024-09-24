package multithreadExample;

public class RunnableExample implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println("I : " + i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RunnableExample obj = new RunnableExample();
		
		Thread t1 = new Thread(obj);
		t1.start();
		System.out.println(Thread.currentThread().getName());

	}

}
