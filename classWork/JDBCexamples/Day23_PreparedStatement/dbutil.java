package Day_23_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbutil 
{
	private static Connection con;
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Harshal";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/employeedb?useSSL=false";
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName(DB_DRIVER_CLASS);//to load the database driver
			System.out.println("Driver loaded successfully....");
			
			//connect the database
			con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			System.out.println("Connection established successfully.....");
		
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error........" + e.getMessage());
		}
		catch(SQLException e)
		{
			System.out.println("Error........" + e.getMessage());
		}
		return con;
	}

}
