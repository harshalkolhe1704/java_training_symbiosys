package InterThreadComm;

class OddEvenClass
{
	boolean Flag = false;
	public synchronized void printOddNumber(int number) throws InterruptedException
	{
		while(Flag)
		{
			wait();
		}
		Flag = true;
		Thread.currentThread().setName("Odd Thread :: ");
		System.out.println(Thread.currentThread().getName() + " " + number);
		notify();
	}
	public synchronized void printEvenNumber(int number) throws InterruptedException
	{
		while(!Flag)
		{
			wait();
		}
		Flag = false;
		Thread.currentThread().setName("Even Thread :: ");
		System.out.println(Thread.currentThread().getName() + " " + number);
		notify();
	}
}
class Odd extends Thread
{
	int MaxOddNumber;
	OddEvenClass Odd;
	Odd(int number, OddEvenClass Odd)
	{
		this.MaxOddNumber = number;
		this.Odd = Odd;
	}
	public void run()
	{
		int MinOddNumber = 1;
		try
		{
			while(MinOddNumber <= MaxOddNumber)
			{
				Odd.printOddNumber(MinOddNumber);
				MinOddNumber = MinOddNumber + 2;
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class Even extends Thread
{
	int MaxEvenNumber;
	OddEvenClass Even;
	Even(int number,OddEvenClass Even)
	{
		this.MaxEvenNumber = number;
		this.Even = Even;
		
	}
	public void run()
	{
		int MinEvenNumber = 2;
		try
		{
			while(MinEvenNumber <= MaxEvenNumber)
			{
				Even.printEvenNumber(MinEvenNumber);
				MinEvenNumber = MinEvenNumber + 2;
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class OddEven 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OddEvenClass oddEven = new OddEvenClass();
		Odd oddNum = new Odd(10,oddEven);
		Even evenNum = new Even(10,oddEven);
		oddNum.start();
		evenNum.start();

	}

}
