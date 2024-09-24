package InterThreadComm;

class reserve extends Thread
{
	int numberOfSeats = 2;
	int wanted;
	public reserve(int wanted) 
	{
		super();
		this.wanted = wanted;
	}
	@Override
	public void run()
	{
		BookTicket();
		{
			
		}
	}
	private void BookTicket() 
	{
		// TODO Auto-generated method stub
		String tName = Thread.currentThread().getName();
		System.out.println("Number of Seats Available " + numberOfSeats);
		synchronized (this) 
		{
			if(numberOfSeats >= wanted)
			{
				System.out.println("Trying to book " + wanted + " Seats available " + numberOfSeats);
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				numberOfSeats = numberOfSeats - wanted;
				System.out.println(wanted + " Seats booked for " + tName);
			}
			else
			{
				System.out.println("--------------------------------------");
				System.out.println("seats not available");
			}
		}
		
	}
}

public class ReservationSystem 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		reserve rs = new reserve(1);
		Thread t1 = new Thread(rs);
		Thread t2 = new Thread(rs);
		Thread t3 = new Thread(rs);
		t1.setName("Passenger - 1");
		t2.setName("Passenger - 2");
		t3.setName("Passenger - 3");
		t1.start();
		t2.start();
		t3.start();

	}

}
