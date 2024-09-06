package hasAinheritance;

class person
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class passport
{
	private int passportNo;

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
}



public class OneToOne 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		person p1 = new person();
		p1.setName("Harshal");
		person p2 = new person();
		p2.setName("Shraddha");
		
		passport n1 = new passport();
		n1.setPassportNo(12342121);
		passport n2 = new passport();
		n2.setPassportNo(34222356);
		
		System.out.println(p1.getName() + " has a US passprt whose passport no is : " + n1.getPassportNo());
		System.out.println(p2.getName() + " has a Canada passport whose passport no is :" + n2.getPassportNo());

	}

}
