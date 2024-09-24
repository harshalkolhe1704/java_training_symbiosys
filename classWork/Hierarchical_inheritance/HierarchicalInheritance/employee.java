package HierarchicalInheritance;

public class employee extends person 
{
	private int eid;
	private float salary;
	private String department;
	public employee()
	{
		eid = 21;
		salary = 10000;
		department = "sales";
	}
	public employee(int eid,float salary,String department)
	{
		this.eid = eid;
		this.salary = salary;
		this.department = department;
	}
	public employee(String name,String city,int eid,String department,float salary)
	{
		super(name,city);
		this.eid = eid;
		this.department = department;
		this.salary = salary;
	}
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public float getSalary() 
	{
		return salary;
	}
	public void setSalary(float salary) 
	{
		this.salary = salary;
	}
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", salary=" + salary + ", department=" + department + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
	

}
