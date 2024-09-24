
public class BankDriver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SavingAccount s1 = new SavingAccount("Harshal", "Nashik", 0674, 3500);
		System.out.println(s1);
		s1.deposit(1000);
		s1.withdraw(200);
		System.out.println(s1);

	}

}
