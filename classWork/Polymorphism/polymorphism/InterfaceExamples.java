package polymorphism;

interface Bank
{
	public static int statA=8;
	public final int a = 99;
	
	public void rateOfInterest();
}
class SBI implements Bank
{
	public void rateOfInterest()
	{
		
	}
	
}
interface card 
{
	public static int cardCharges = 100;
}
class DebitCard implements card
{
	
}
class CreditCard implements card
{
	
}
class TravelCard implements card
{
	
}




public class InterfaceExamples 
{
	public int a;
	public final int b = 99;
	private static int statA = 8;
	public void test()
	{
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		
		

	}

}
