package enumPack;

enum days
{
	SUNDAY(20),MONDAY(10),TUESDAY(30);
	int MYNO;
	days(int i)
	{
		this.MYNO = i;
	}
	public int getMYNO()
	{
		return MYNO;
	}
}
enum TVS
{
	SonyTV(60000),LGTV(70000),SamsungTV(80000);
	int price;
	TVS(int i)
	{
		this.price = i;
	}
	public int getPrice()
	{
		return price;
	}
}

public class EnumExample 
{
	private int no;
	public String name;
	public void show()
	{
		days mydays[] = days.values();
		for(days dd : mydays)
		{
			System.out.println(dd);
		}
		for(days dd : days.values())
		{
			System.out.println(dd.ordinal());
		}
	}
	public void showTVS()
	{
		TVS tvlist[] = TVS.values();
		for(TVS tv : tvlist)
		{
			System.out.println("Price of " + tv + " is : " + tv.getPrice() );
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enum Example...");
		EnumExample obj = new EnumExample();
		obj.show();
		days d = days.MONDAY;
		System.out.println(d);
		days d1 = days.SUNDAY;
		System.out.println(d1);
		days d2 = days.TUESDAY;
		System.out.println(d2);
		obj.showTVS();
	}

}
