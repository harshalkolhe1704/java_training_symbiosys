package HierarchicalInheritance;

public class studnt extends person
{
    
	private String Class;
	private float percent;
	public studnt()
	{
		System.out.println("--Default constructor--");
		Class = "BCA";
		percent = 70;
	}
	public studnt(String name,String city, String Class,float percent)
	{
		super(name,city);
		this.Class = Class;
		this.percent = percent;
	}
	public String getClas() 
	{
		return Class;
	}
	public void setClass(String Class) 
	{
		this.Class = Class;
	}
	public float getPercent() 
	{
		return percent;
	}
	public void setPercent(float percent) 
	{
		this.percent = percent;
	}
	@Override
	public String toString() 
	{
		return "studnt [Class=" + Class + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	

	

}
