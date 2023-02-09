package garv;
import java.sql.*;

public class stored_procedure {
	public static void main(String[] args) {
		Connection con=null;
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garv",
		             "root", "root");
			CallableStatement cs=con.prepareCall("{call updateempsalary(?,?)}");
			cs.setInt(1,1);
			cs.setDouble(2,0.1);
			cs.executeUpdate();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally {
			try
			{
				con.close();
			}
			catch (SQLException e)
			{
				System.out.println(e);
			}
		}
	}
}

