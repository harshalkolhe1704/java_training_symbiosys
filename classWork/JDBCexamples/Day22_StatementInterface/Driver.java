package Day_22_StatementInterface;

public class Driver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StatementInterfaceDemo.showEmp();
		System.out.println("-----------------------------------------------------");
		
	    StatementInterfaceDemo.updateEmpName(1002,"Prasad");
	    StatementInterfaceDemo.showEmp();
	    
	    System.out.println("-------------------------------------------");
		StatementInterfaceDemo.updateEmpSalary(1002, 50000);
		StatementInterfaceDemo.showEmp();
		System.out.println("-----------------------------------------------");
		
		System.out.println("----------After updating Name and salary--------------------");
		StatementInterfaceDemo.showEmp();
		System.out.println("------------------------------------------------------");
		StatementInterfaceDemo.deleteEmp(1003);
		//StatementInterfaceDemo.deleteEmp(1005);
		
		System.out.println("----------After deleting-----------------------------");
		StatementInterfaceDemo.showEmp();

	}

}
