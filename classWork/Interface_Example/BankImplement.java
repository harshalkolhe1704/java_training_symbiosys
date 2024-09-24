
public class BankImplement implements Bank
{
	
	

	public void deposite(Account account,double amount)
	{
		if(amount > depositeLimit)
		{
			System.out.println("Deposite limit exceed");
		}
		else
		{
			account.setBalance(account.getBalance() + amount);
			System.out.println("Deposited " + amount + " into account " + account.getAccNo());
		}
	}
	
	public void withdraw(Account account,double amount)
	{
		if(account.getBalance() - amount >= minBalance)
		{
			account.setBalance(account.getBalance() - amount);
			System.out.println("Withdrawn : " + amount + " from account : " + account.getAccNo());
			
		}
		else
		{
			System.out.println("Insufficient Balance in account " + account.getAccNo());
		}
	}


	

}
