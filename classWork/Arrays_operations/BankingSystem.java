/*write a java program for banking system with the functionality of
 create customer and deposite and withdrawl facility for n number
 of customer where the balance is only available to a particular user.*/
import java.util.*;

public class BankingSystem

{
	int cid;
	String custname;
	double amount;
	public BankingSystem(int cid,String custname,double amount)
	{
		this.cid = cid;
		this.custname = custname;
		this.amount = amount;
	}
	public void deposite(double depositamount)
	{

		if(depositamount <= 0)
		{
			System.out.println("Amount not deposited or amount must be positive");
		}
		else
		{
			amount = amount + depositamount;
			System.out.println("Amount deposited : " + depositamount );
		}
	}
	public void withdraw(double withdrawamount)
	{
		if(withdrawamount <= 0)
		{
			System.out.println("Amount to withdrawl is must be positive:");
		}
		else if(withdrawamount > amount)
		{
			System.out.println("Insufficient balance.");
		}
		else
		{
			amount = amount - withdrawamount;
			System.out.println("Amount withdrawl : " + withdrawamount);
		}
	}
	
	public void show()
	{
		  System.out.println("Customer Id : " + cid);
		  System.out.println("Customer name is : " + custname);
		  System.out.println("Available Balance is : " + amount);
		  System.out.println("-----------------------");
		  
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter how many customer records do you want:");
//		int n = sc.nextInt();
			
		System.out.println("Enter the Customer Id:");
		int cid = sc.nextInt();
		System.out.println("Enter the Customer Name:");
		String custname = sc.next();
		System.out.println("Enter the Amount:");
		int amount = sc.nextInt();
		BankingSystem BS = new BankingSystem(cid,custname,amount);
		
	    
		do
		{
			
		System.out.println("1.Display customer details.");
		System.out.println("2.Deposit money.");
		System.out.println("3.Withdraw Money.");
		System.out.println("4.Exit");
		System.out.println("---------------------------");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			
			BS.show();
			break;
			
		case 2:
			System.out.println("Enter the amount to be deposit:");
			int depositeAmount = sc.nextInt();
			BS.deposite(depositeAmount);
			BS.show();
			break;
			
		case 3:
			System.out.println("Enter the amount to be withdraw:");
			int withdrawAmount = sc.nextInt();
			BS.withdraw(withdrawAmount);
			BS.show();
			break;
		case 4:
			System.exit(0);
			
		default:
			System.out.println("Invalid choice....please try again");
			break;
		
		}
		}while(true);
		
		
		


	}

}
