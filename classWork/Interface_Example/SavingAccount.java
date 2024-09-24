
public class SavingAccount extends person implements Bank2 
{
	private int accNo;
	private int balAmount;
	public SavingAccount(String name, String city, int accNo, int balAmount) 
	{
		super(name, city);
		this.accNo = accNo;
		this.balAmount = balAmount;
	}
	
	public int getAccno()
	{
		return accNo;
	}
	public void setAccno(int accNo)
	{
		this.accNo = accNo;
	}
	public int getBalAmount() 
	{
		return balAmount;
	}
	public void setBalAmount(int balAmount) 
	{
		this.balAmount = balAmount;
	}
	
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balAmount=" + balAmount + ", getAccno()=" + getAccno()
				+ ", getBalAmount()=" + getBalAmount() + "]";
	}
	
	public void deposit(int amount) 
	{
		System.out.println("Deposit ()");
	}
	
	public void withdraw(int amount) 
	{
		System.out.println("Withdraw ()");
	}
}
