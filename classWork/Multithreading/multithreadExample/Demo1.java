package multithreadExample;

public class Demo1 extends Thread 
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread t1 = new Demo1();
		t1.setName("Child thread 1");
		t1.setPriority(8);
		t1.start();
		
		Demo1 d1 = new Demo1();
		d1.setPriority(MAX_PRIORITY);
		d1.start();
		
		System.out.println(t1.currentThread().getName());
		System.out.println(t1.currentThread().getPriority());
		
		Demo1 d2 = new Demo1();
		d2.start();

	}

}
