
public class BankApplication {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bank bank = new BankImplement();
		Account account = new Account(123,"Harshal",10000,bank);
		
		account.deposite(1500);
		System.out.println("Deposite money : " + account);
		System.out.println("After withdraw money:");
		account.withdraw(2000);
		System.out.println(account);

	}

}
