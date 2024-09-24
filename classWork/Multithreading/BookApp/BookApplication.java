package BookApp;

public class BookApplication 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Book book = new Book("java");
//		Book b1 = new Book("Python");
		BookReader bookreader1 = new BookReader(book);
		BookReader bookreader2 = new BookReader(book);
		
		Thread thread1 = new Thread(bookreader1 , "Harshal");
		Thread thread2 = new Thread(bookreader2 , "Santosh");
		
		thread1.start();
		thread2.start();
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		BookWriter bookwriter = new BookWriter(book);
		Thread bookwriterThread = new Thread(bookwriter);
		bookwriterThread.start();
//		BookWriter bookwriter2 = new BookWriter(b1);
//		Thread bookwriterThread2 = new Thread(bookwriter2);
//		bookwriterThread2.start();
	}

}
