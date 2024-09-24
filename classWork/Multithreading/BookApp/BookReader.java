package BookApp;

public class BookReader implements Runnable
{
	Book b1;
	
	public BookReader(Book b1)
	{
		super();
		this.b1 = b1;
	}
	@Override
	public void run()
	{
		synchronized (b1) 
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				b1.wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Book reading over " + Thread.currentThread().getName());
			//b1.notify();
			b1.notifyAll();
			
		}
	}
}
