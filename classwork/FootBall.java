package hasAinheritance;

public class FootBall 
{
	private String type,size,weight;
	
	public FootBall(String type,String size,String weight)
	{
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getSize() 
	{
		return size;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	public String getWeight() 
	{
		return weight;
	}
	public void setWeight(String weight) 
	{
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "FootBall [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}
	
	

}
