package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcExample 
{
	static Connection con;
	//static String mysqlUrl = "jdbc:mysql://localhost/employeeDb";
	/*
	 * use this Exception for useSSL 
	 * static String mysqlUrl = "jdbc:mysql://localhost/employeeDb?useSSL=false";
	 */
	static String mysqlUrl = "jdbc:mysql://localhost/employeeDb?useSSL=false";
	
	public static void testConnection()
	{
		try 
		{
			con = DriverManager.getConnection(mysqlUrl,"root","Harshal");
			System.out.println("Connection Established..............");
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void insertData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee code:");
		int empCode = sc.nextInt();
		System.out.println("Enter the employee name:");
		String empName = sc.next();
		System.out.println("Enter the gross:");
		int gross = sc.nextInt();
		int n = 0;
		try
		{
			con = DriverManager.getConnection(mysqlUrl , "root" , "Harshal");
			Statement smt = con.createStatement();
			String query = "INSERT INTO employeeTable(ecode,ename,gross)" 
					      + "VALUES ( " + empCode + " ,'" + empName + " ' , " + gross + " )";
			
			n = smt.executeUpdate(query);
			if(n > 0)
			{
				System.out.println("Inserted");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static void updateData()
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee code:");
		int empCode = sc.nextInt();
		
		System.out.println("Enter the gross:");
		int gross = sc.nextInt();
		int n = 0;
		
		try
		{
			con = DriverManager.getConnection(mysqlUrl,"root","Harshal");
			Statement smt = con.createStatement();
			
			String query = "UPDATE employeeTable SET gross =" + gross + " WHERE ecode = " +empCode;
			n = smt.executeUpdate(query);
			if(n > 0)
			{
				System.out.println("Update");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("----------------------------------");		
	}
	
	public static void deleteData()
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee code:");
		int empCode = sc.nextInt();
		
	int n = 0;
		
		try
		{
			con = DriverManager.getConnection(mysqlUrl,"root","Harshal");
			Statement smt = con.createStatement();
			
			String query = "DELETE FROM employeeTable " + " WHERE ecode = " + empCode;
			n = smt.executeUpdate(query);
			if(n > 0)
			{
				System.out.println("Deleted");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("----------------------------------");
		
	}
	public static void selectData()
	{
		try
		{
			con = DriverManager.getConnection(mysqlUrl,"root","Harshal");
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select ecode from employeeTable");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ "\t" + rs.getString(2) + "\t" + rs.getString(5));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//jdbcExample.testConnection();
		//jdbcExample.insertData();
		//jdbcExample.updateData();
		//jdbcExample.deleteData();
		jdbcExample.selectData();
	}

}
