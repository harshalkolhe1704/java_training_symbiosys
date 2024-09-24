package multithreadExample;

class myThread extends Thread
{
    myThread() 
	{
		// TODO Auto-generated constructor stub
		super();
	}
	myThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(getName() + " - i : " + i);
		}
	}
}

public class ThreadDemo3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		myThread mt1 = new myThread();
		myThread mt2 = new myThread("child 2");
		System.out.println("mt1 threads initial name and priority");
		System.out.println("mt1 name: " + mt1.getName());
		System.out.println("mt1 priority : " + mt1.getPriority());
		System.out.println();
		System.out.println("mt2 threads initial name and priority");
		System.out.println("mt2 name: " + mt1.getName());
		System.out.println("mt2 priority : " + mt1.getPriority());
		mt1.setName("Child 1");
		System.out.println();
		mt1.setPriority(6);
		mt2.setPriority(9);
		System.out.println();
		System.out.println("mt1 threads initial name and priority");
		System.out.println("mt1 name: " + mt1.getName());
		System.out.println("mt1 priority : " + mt1.getPriority());
		System.out.println();
		System.out.println("mt2 threads initial name and priority");
		System.out.println("mt2 name: " + mt2.getName());
		System.out.println("mt2 priority : " + mt2.getPriority());
		mt1.start();
		mt2.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main i : " + i);
		}
	}

}
