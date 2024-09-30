package Day_23_PreparedStatement;

import java.sql.*;
public class PreparedStatement 
{
	static Connection cn;
	static java.sql.PreparedStatement pst;
	
	static
	{
		cn = dbutil.getConnection();
		if(cn != null)
		{
			System.out.println("JDBC : Connection is taken");
		}
	}
	
	public static int addVisitor(int visId,String visName,String gender,int rate,String location)
	{
		int n = 0;
		try 
		{
			pst = cn.prepareStatement("INSERT INTO visitors VALUES(?,?,?,?,?)");
										pst.setInt(1,visId);
										pst.setString(2, visName);
										pst.setString(3, gender);
										pst.setInt(4, rate);
										pst.setString(5, location);
		    n = pst.executeUpdate();
										
		}
		catch (SQLException e) 
		{
			// TODO: handle exception
			System.out.println("Error ......." + e.getMessage());
			n = 0;
		}
		return n;
	}
	
	public static int validateVisitor(int visId)
	{
		int n = 0;
		try 
		{
													
			pst = cn.prepareStatement("SELECT count(*) FROM visitors WHERE visitorId = ?");
			pst.setInt(1, visId); 
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				if(rs.getInt(1) != 0)
					n = 1;
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return n;
	}
	public static boolean updateVisitorName(int visId,String visName)
	{
		boolean status = false;
		try 
		{
			if(validateVisitor(visId) == 1)
			{
			     pst = cn.prepareStatement("UPDATE visitors set visitorName = ? WHERE visitorId = ?");
									pst.setString(1, visName);
									pst.setInt(2, visId);
				pst.executeUpdate();
				status = true;
			}
			else
			{
				System.out.println("Updated the visitors name......");
			}
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			System.out.println("ERROR CANNOT UPDATE THE NAME");
		}
		return status;
	}
	public static boolean updateVisitorRate(int visId,int rate)
	{
		boolean status = false;
		try 
		{
			if(validateVisitor(visId) == 1)
			{
				pst = cn.prepareStatement("UPDATE visitors set amtRate = ? WHERE visitorId = ?");
										pst.setInt(1,rate);
										pst.setInt(2, visId);
				pst.executeUpdate();
				status = true;
			}
			else
			{
				System.out.println("Updated the visitors Rate......");
			}
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			System.out.println("ERROR CANNOT UPDATE THE RATE");
		}
		return status;
	}
	public static boolean deleteVisitor(int visId)
	{
		boolean status = false;
		try 
		{
			int n = validateVisitor(visId);
			if(n == 1)
			{
				pst = cn.prepareStatement("DELETE FROM visitors WHERE visitorId = ? ");
									pst.setInt(1, visId);
			    pst.executeUpdate();
			    status = true;
			}
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			System.out.println("ERROR REOCRD IS NOT DELETED");
		}
		return status;
	}
	public static void showVisitors()
	{
		try 
		{
			String query = "SELECT * FROM visitors";
			pst=cn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				while(rs.next())
				{
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4) + "\t" + rs.getString(5));
				}
			}
			else
			{
				System.out.println("No visitors records..........");
				rs.close();
			}
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			System.out.println("Error......" + e.getMessage());
		}
	}
	
}
