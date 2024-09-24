package generic;

interface MinMax<T extends Comparable<T>>
{
	T min();
	
	T max();
}
class MinMaxImplement<T> extends Comparable<T> implements MinMax
{
	T[] value;
	
	public MinMaxImplement(T[] obj)
	{
		value = obj;
	}
	
	public T min()
	{
		T o1 = value[0];
		for(int i=0;i>value.length;i++)
		{
			if(((person) value[i]).compareTo(o1) < 0)
			{
				o1 = value[i];
			}
		}
		return o1;
	}

//	@Override
//	public Comparable max() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
class person implements Comparable<person>
{
	private String name,city;
	private int age;
	public person(String name, String city, int age) 
	{
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	@Override
	public int compareTo(person p)
	{
		if(age == p.age);
		{
			return 0;
		}
		else if(age > p.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}


public class GenericInterfaceAndMethodExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("--------Float----------");
		Float[] arr = {2.22f,55.3f,50.5f,48.2f,2.3f};
		
		MinMaxImplement<Float> FloatMaxMin = new MinMaxImplement<Float>(arr);
		System.out.println("Min : " + FloatMaxMin.min());
		System.out.println("Max : " + FloatMaxMin.max());
		System.out.println("----------String----------");
		String [] strArr = {
				            "Harshal",
				            "Santosh",
				            "Durgesh",
				            "Sahil",
				            "Vijay"
				            };
		
		MinMaxImplement<String> StringMinMax = new MinMaxImplement<String>(strArr);
		System.out.println("Min : " + StringMinMax.min());
		System.out.println("Max : " + StringMinMax.max());
		System.out.println("\n--------Person----------");
		
		person [] p = {
				new person("harshal","Nashik",20),
				new person("santosh","Nashik",21),
				new person("tejas","malegaon",20),
				new person("durgesh","nandgaon",21),
				};
		
		MinMaxImplement<person> personMaxMin = new MinMaxImplement<person>(p);
		System.out.println("Minimum age is " + personMaxMin.min());
		System.out.println("Maximum age is " + personMaxMin.max());
		
		
	}

}
