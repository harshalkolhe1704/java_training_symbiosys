package hasAinheritance;

class person1
{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class address
{
	private String state;
	private String city;
	private int pincode;
	
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public int getPincode()
	{
		return pincode;
	}
	public void setPincode(int pincode)
	{
		this.pincode = pincode;
	}
}



public class ManyToMany 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		person1 p1 = new person1();
		p1.setName("Harshal");
		person1 p2 = new person1();
		p2.setName("Durgesh");
		
		address a1 = new address();
		a1.setState("Maharashtra");
		a1.setCity("Nashik");
		a1.setPincode(422003);
		
		address a2 = new address();
		a2.setState("Gujrat");
		a2.setCity("Baroda");
		a2.setPincode(321112);
		
		System.out.println(p1.getName() + " lives at address " + a1.getCity() + " "  + a1.getState() + " " + a1.getPincode() + " but he has also live in " + a2.getCity() + " " + a2.getState() + " " + a2.getPincode());
		System.out.println(p2.getName() + " lives at address " + a2.getCity() + " " + a2.getState() + " " + a2.getPincode()  + " but he has also live in " + a1.getCity() + " " + a1.getState() + " " + a1.getPincode());
		

	}

}
