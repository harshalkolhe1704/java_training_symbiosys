
public interface Bank 
{
	double minBalance = 1000;
	double rateOfInterest = 7.5;
	double depositeLimit = 25000;
	
	void deposite(Account account,double amount);
	void withdraw(Account account,double amount);
	

}
