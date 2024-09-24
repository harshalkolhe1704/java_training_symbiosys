package hasAinheritance;

class simCard
{
	private int cardNo;
	public simCard()
	{
		System.out.println("Simcard object constructed.");
		cardNo = 131;
	}
	@Override
	public String toString() 
	{
		return "simCard [cardNo=" + cardNo + "]";
	}
	
}
class mobile 
{
	private simCard mysim = new simCard();//used of aggregation has-A
	private String mobileName = "Samsung";
	private int modelNo = 1243;
	@Override
	public String toString() {
		return "mobile [mysim=" + mysim + ", mobileName=" + mobileName + ", modelNo=" + modelNo + "]";
	}
	
//	public String toString()
//	{
//		return mysim + " For " + mobileName + "  " + modelNo;  
//	}
	
	
	
	
}

public class MobileApplication 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		mobile mymobile = new mobile();
		System.out.println(mymobile);

	}

}
