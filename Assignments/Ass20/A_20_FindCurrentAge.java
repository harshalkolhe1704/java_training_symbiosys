//Accept person date of birth and find out current age.
import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class A_20_FindCurrentAge {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date of Birth of the person : DD-MM-YYYY");
		
		String dob = sc.next();
		
		
		LocalDate db = LocalDate.parse(dob);
		LocalDate currentdate = LocalDate.now();
		
		Period age = Period.between(db, currentdate);
		
		System.out.println("You are current age is : " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days old");
		
		
	}	
}
