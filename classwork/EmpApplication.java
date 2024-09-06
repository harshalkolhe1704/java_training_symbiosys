package hasAinheritance;

import java.util.*;
public class EmpApplication 
{
	public static Employee createEmp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department number:");
		int deptid = sc.nextInt();
		System.out.println("Enter the department name:");
		String dName = sc.next();
		System.out.println("Enter the employee Id : ");
		int eid = sc.nextInt();
		System.out.println("Enter the employee name : ");
		String eName = sc.next();
		
		Employee e1 = new Employee();
		Department d1 = new Department();
		
		d1.setDeptName(dName);
		d1.setDeptNo(deptid);
		e1.setEmpId(eid);
		e1.setEmpName(eName);
		e1.setDept(d1);
		return e1;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1 = createEmp();
		System.out.println("Department details : " + e1.getDept().getDeptName() + " " + e1.getDept().getDeptNo());
		System.out.println("Employee details : " + e1.getEmpId() + " Employee name is : " + e1.getEmpName());

	}

}
