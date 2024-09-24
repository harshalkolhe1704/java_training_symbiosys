package hasAinheritance;

class employee1
{
	private int eid;
	private String name;
	
	public employee1()
	{
		System.out.println("employee object constructed..");
		eid = 123;
		name = "Harshal";
	}

	public String toString() {
		return "employee [eid=" + eid + ", name=" + name + "]";
	}
	
	
}
class department1
{
	private employee1 e = new employee1();
	private int departid = 1001;
	private String departName = "IT";
	
	public String toString() {
		return "department [e=" + e + ", departid=" + departid + ", departName=" + departName + "]";
	}
	
	
}


public class EmployeeApplication 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		department1 d = new department1();
		System.out.println(d);
	}

}
//public int getEid() {
//return eid;
//}
//public void setEid(int eid) {
//this.eid = eid;
//}
//public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}

//public int getDepartid() {
//return departid;
//}
//public void setDepartid(int departid) {
//this.departid = departid;
//}
//public String getDepartName() {
//return departName;
//}
//public void setDepartName(String departName) {
//this.departName = departName;
//}

//employee e1 = new employee();
//e1.setEid(2);
//e1.setName("Harshal");
//department d1 = new department();
//d1.setDepartid(1001);
//d1.setDepartName("IT");
//
//System.out.println("Employee ID is :" + e1.getEid() + " and " + " Employee name is : " + e1.getName() + " has a department whose " + "\n" +  "ID is : " + d1.getDepartid() + " and Name is :" + d1.getDepartName());
