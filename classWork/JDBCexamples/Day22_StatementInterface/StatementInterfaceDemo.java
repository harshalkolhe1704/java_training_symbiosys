package Day_22_StatementInterface;

import java.sql.*;
public class StatementInterfaceDemo 
{
	static Connection cn;
	static Statement st;
	static
	{
		cn = DButil.getConnection();
		try
		{
			st = cn.createStatement();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static int addEmployee(int empId,String empName,int empSalary)
	{
		int n = 0;
		try
		{
			String query = "INSERT INTO employee VALUES(" + empId + " , '" + empName + " , '" + empSalary + ")";
			n = st.executeUpdate(query);
		}
		catch(SQLException e)
		{
			System.out.println("Error....." + e.getMessage());
			//e.printStackTrace();
			n = 0;
		
		}
		return n;
	}
	
	public static int validateEmp(int empId)
	{
		
		int n = 0;
		try
		{
			String query = "SELECT count(*) FROM employee where empNo = " + empId;
			ResultSet rs = st.executeQuery(query);
			if(rs.next())
			{
				if(rs.getInt(1) != 0)
					n = 1;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return n;
	}
	
	public static boolean deleteEmp(int empId)
	{
		boolean status = false;
			try 
			{
				int n = validateEmp(empId);
				if (n == 1) 
				{
					String query = "DELETE FROM employee WHERE empNo = " + empId;
					st.executeUpdate(query);
					status = true;
				}
			} 
			catch (SQLException e) 
			{
				System.out.println("Error ....." + e.getMessage());
			}
			return status;
	}
	
	public static boolean updateEmpName(int empId,String empName)
	{
		boolean status = false;
		try 
		{
			if(validateEmp(empId) == 1)
			{
				String query = "UPDATE employee set empName ='" + empName + "' WHERE empNo=" + empId;
				st.executeUpdate(query);
				status = true;
			}
			else
			{
				System.out.println("Updated the employee name........");
			}
		} catch (SQLException e) 
		{
			// TODO: handle exception
			System.out.println("Error....." + e.getMessage());
		}
		return status;
	}
	public static boolean updateEmpSalary(int empId,int empSalary)
	{
		boolean status = false;
		try 
		{
			if(validateEmp(empId) == 1)
			{
				String query = "UPDATE employee set salary =" + empSalary + " WHERE empNo =" + empId;
				st.executeUpdate(query);
				status = true;
			}
			else
			{
				System.out.println("Updated the employee salary........");
			}
		} catch (SQLException e) 
		{
			// TODO: handle exception
			System.out.println("Error..." + e.getMessage());
		}
		return status;
	}
	public static void showEmp()
	{
		try 
		{
			String query = "SELECT * FROM employee";
			ResultSet rs = st.executeQuery(query);
			
			if(rs.next())
			{
				while(rs.next())
				{
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(4));
				}
			}
			else
			{
				System.out.println("No employee records..........");
				rs.close();
			}
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			System.out.println("Error......" + e.getMessage());
		}
	}
	public void closeConnection()
	{
		try
		{
			st.close();
			cn.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}




















