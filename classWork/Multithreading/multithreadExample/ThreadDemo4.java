package multithreadExample;

public class ThreadDemo4 extends Thread
{
	Thread t;
	public ThreadDemo4()
	{
		t = new Thread(this);
		System.out.println("T is born");
		System.out.println("T is ready!!!");
		t.start();
	}
	public void m1()
	{
		System.out.println("Method 1");
	}
	public void run()
	{
		System.out.println("T is running!!!!");
		m1();
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new ThreadDemo4();

	}

}
