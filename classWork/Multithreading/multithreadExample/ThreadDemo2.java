package multithreadExample;

class A1 extends Thread
{
	public void run()
	{
		System.out.println("Thread A");
		System.out.println("i in Thread A");
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " - i = " + i);
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Thread A is Finished");
	}
}
class B1 extends Thread
{
	public void run()
	{
		System.out.println("Thread B");
		System.out.println("i in Thread B");
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " - i = " + i);
			
		}
		System.out.println("Thread B is finished");
	}
}

public class ThreadDemo2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A1 threadA = new A1();
		threadA.setName("A");
		B1 threadB = new B1();
		threadB.setName("B");
		//Both the above thread are in runnable state
		//Running state of thread A & B
		threadA.start();
		//Move control to another thread
		threadA.yield();
		//Blocked state of thread B
		try
		{
			threadA.sleep(200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		threadB.start();
		System.out.println("Main Thread End");

	}

}
