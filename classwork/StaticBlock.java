
public class StaticBlock 
{
	private int section;//non static or instance variable
	private static int srNo;//static or class variable
	//static block
	static
	{
		System.out.println("---------within static block------");
		srNo = 1000;
	}
	//static method
	static void display()
	{
		System.out.println("Serial No : " + srNo);
	}
	//default constructor
	StaticBlock()
	{
		System.out.println("----within default constructor-----");
		srNo++;
		section++;
	}
	public String toString()
	{
		return "MyClass [serial No " + srNo + ", section=" + section + "]";
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StaticBlock sb1 = new StaticBlock();
		System.out.println(sb1);
		//static method with class name
		StaticBlock.display();
		StaticBlock sb2 = new StaticBlock();
		System.out.println(sb2);
		StaticBlock.display();
		StaticBlock sb3 = new StaticBlock();
		System.out.println(sb3);
		StaticBlock.display();
		
		

	}

}
