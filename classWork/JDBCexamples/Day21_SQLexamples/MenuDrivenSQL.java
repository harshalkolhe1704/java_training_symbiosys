package Day21_SQLexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDrivenSQL {
	static Connection con;
	static String mysqlUrl = "jdbc:mysql://localhost/employeeDb?useSSL=false";

	public static void testConnection() {
		try {
			con = DriverManager.getConnection(mysqlUrl, "root", "Harshal");
			System.out.println("Connection Established..............");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MenuDrivenSQL.testConnection();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------------------------------");
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.DISPLAY");
			System.out.println("----------------------------------");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the employee code:");
				int empCode = sc.nextInt();
				System.out.println("Enter the employee name:");
				String empName = sc.next();
				System.out.println("Enter the gross:");
				int gross = sc.nextInt();
				int n = 0;
				try {
					con = DriverManager.getConnection(mysqlUrl, "root", "Harshal");
					Statement smt = con.createStatement();
					String query = "INSERT INTO employeeTable(ecode,ename,gross)" + "VALUES ( " + empCode + " ,'"
							+ empName + " ' , " + gross + " )";

					n = smt.executeUpdate(query);
					if (n > 0) {
						System.out.println("Inserted");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter the employee code:");
				int eCode = sc.nextInt();

				System.out.println("Enter the gross:");
				int gro = sc.nextInt();
				int n1 = 0;

				try {
					con = DriverManager.getConnection(mysqlUrl, "root", "Harshal");
					Statement smt = con.createStatement();

					String query = "UPDATE employeeTable SET gross =" + gro + " WHERE ecode = " + eCode;
					n = smt.executeUpdate(query);
					if (n1 > 0) {
						System.out.println("Update");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Enter the employee code:");
				int ecode = sc.nextInt();
			    int no = 0;
				try
				{
					con = DriverManager.getConnection(mysqlUrl,"root","Harshal");
					Statement smt = con.createStatement();
					
					String query = "DELETE FROM employeeTable " + " WHERE ecode = " + ecode;
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
			break;
			case 4:
				try
				{
					con = DriverManager.getConnection(mysqlUrl,"root","Harshal");
					Statement smt = con.createStatement();
					ResultSet rs = smt.executeQuery("select * from employeeTable");
					while(rs.next())
					{
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(5));
					}
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			break;
			}

		} while (true);

	}

}
