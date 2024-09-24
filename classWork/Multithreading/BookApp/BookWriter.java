package BookApp;

public class BookWriter implements Runnable
{
	Book b1;

	public BookWriter(Book b1) 
	{
		super();
		this.b1 = b1;
	}
	@Override
	public void run()
	{
		synchronized (b1) 
		{
			System.out.println("Writer writes book : " + b1.getTitle());
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			b1.setisComplete(true);
			System.out.println("Book Completed");
			b1.notify();
			System.out.println("notify reader");
		}
	}
}
