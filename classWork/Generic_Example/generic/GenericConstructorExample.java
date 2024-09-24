package generic;

class GenericConstructor
{
	private double v;
	public <T extends Number> GenericConstructor(T t)
	{
		this.v = t.doubleValue();
	}
	void show()
	{
		System.out.println("Value of V double type is : " + v);
	}
}


public class GenericConstructorExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GenericConstructor obj = new GenericConstructor(20);
		obj.show();

	}

}
