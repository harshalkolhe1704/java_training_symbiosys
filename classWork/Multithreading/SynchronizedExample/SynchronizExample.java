package SynchronizedExample;

class person
{
	synchronized
	public void displayName(String name)
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(name);
		}
	}
}
class student extends Thread
{
	person p;
	String name;
	
	public student(person p1,String myname)
	{
		this.p = p1;
		this.name = myname;
	}
	public void run()
	{
		p.displayName(name);
	}
}
public class SynchronizExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		person p = new person();
		student s1 = new student(p, "Harshal");
		student s2 = new student(p, "Santosh");
		s1.start();
		s2.start();

	}

}
