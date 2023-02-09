package garv;
import java.sql.*; 
public class transaction_management1 { 
	public static void main(String args[]) throws Exception{  
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/garv","root", "root");  
		con.setAutoCommit(false);  
		  
		Statement stmt=con.createStatement();  
		stmt.executeUpdate("insert into department values(4,'IoT')");  
		stmt.executeUpdate("insert into department values(5,'AIML')");  
		  
		con.commit();  
		con.close();
		}
}

