import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class A_21_EmployeeRetirement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Date of Birth of the Employee(YYYY-MM-DD):");
		String date_of_Birth = sc.next();
		System.out.println("Enter the joining date of the of the Employee(YYYY-MM_DD):");
		String Date_of_joining = sc.next();
		
		LocalDate BirthDate = LocalDate.parse(date_of_Birth);
		LocalDate joiningDate = LocalDate.parse(Date_of_joining);
		
		LocalDate Date_of_Retirement = BirthDate.plusYears(58);
		
		Period YearsRemainimg = Period.between(joiningDate, Date_of_Retirement);
		
		System.out.println("Remaining Years for the employee retirement:");
		System.out.println(YearsRemainimg.getYears() + " Years");
		System.out.println(YearsRemainimg.getMonths() + " Months");
		System.out.println(YearsRemainimg.getDays() + " Days");
		System.out.println("Retirement Date of the employee is : " + BirthDate.plusYears(58));
	}

}
