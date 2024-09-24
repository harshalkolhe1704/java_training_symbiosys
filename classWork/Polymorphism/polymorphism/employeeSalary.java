package polymorphism;

import java.util.*;
public class employeeSalary 
{
	int TA;//traveling allowance 100
	int HRA;//500
	int PF = 2500;//provident fund
	int DA;//200
	int basic;//1000
	
	public void calpay()
	{
		System.out.println("Providend Fund : " + PF);
		System.out.println("--------------------------------------------");
	}
	public void calpay(int TA,int basic)
	{
		this.TA = TA;
		this.basic = basic;
		float netpay = TA + basic - PF;
		System.out.println("Netpay with TA and Basic : " + netpay);
		System.out.println("--------------------------------------------");
	}
	public void calpay(int basic,int HRA,int TA)
	{
		this.basic = basic;
		this.HRA = HRA;
		float netpay = HRA + TA + basic - PF;
		System.out.println("Netpay with TA,HRA and Basic is : " + netpay);
		System.out.println("--------------------------------------------");
	}
	public void calpay(int basic,int HRA,int TA,int DA)
	{
		this.DA = DA;
		this.basic = basic;
		this.HRA = HRA;
		float netpay = DA + HRA + TA + basic - PF;
		System.out.println("Netpay with TA,HRA,DA and Basic is : " + netpay);
		System.out.println("--------------------------------------------");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int PF = 2500;
		System.out.println("Enter the Travellig Allowance:");
		int TA = sc.nextInt();
		System.out.println("Enter the HR Allowance:");
		int HRA = sc.nextInt();
		System.out.println("Enter the D Allowance:");
		int DA = sc.nextInt();
		System.out.println("Enter the Basic salary:");
		int basic = sc.nextInt();
		
		employeeSalary e1 = new employeeSalary();
		do {
		System.out.println("--------------------------------------------");
		System.out.println("1.You displayed the provindent fund.");
		System.out.println("2.You displayed the basic and TA");
		System.out.println("3.You displyed the basic,TA and HRA");
		System.out.println("4.You displyed the basic,TA,DA and HRA");
		System.out.println("--------------------------------------------");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
//		employeeSalary e1 = new employeeSalary();
		switch(choice)
		{
		case 1 :e1.calpay();
			    break;
			    
		case 2:e1.calpay(TA,basic);
				break;
		
		case 3:e1.calpay(basic,HRA,TA);
		      break;
		      
		case 4:e1.calpay(basic,HRA,TA,DA);
		       break;
		       
		default:
			System.out.println("invalid case:");
			System.exit(0);
			break;
		} }while(true);
		
		
		
		
//		employeeSalary e1 = new employeeSalary();
//		e1.calpay();
//		e1.calpay(1000,10000);
//		e1.calpay(10000,500,100);
//		e1.calpay(10000,500,100,200);
		
		

	}

}
