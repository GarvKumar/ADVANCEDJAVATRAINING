package garv;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class details_of_employee {
	public static void main(String[] args) {
		 Connection connection = null;
		 Statement selectStmt = null;
		 try
		    {
		      Class.forName("com.mysql.jdbc.Driver");
		      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/garv", "root", "root");
		       
		      
		      selectStmt = connection.createStatement();
		      ResultSet rs = selectStmt.executeQuery("SELECT empid,empname,empdep FROM employee WHERE empdep='it'");
		      while(rs.next())
		      {
		        System.out.println(rs.getString(1));  //First Column
		        System.out.println(rs.getString(2));  //Second Column
		        System.out.println(rs.getString(3));  //Third Column
		      }
		    } 
		    catch (Exception e) {
		      e.printStackTrace();
		    }finally {
		      try {
		        selectStmt.close();
		        connection.close();
		      } catch (Exception e) {
		        e.printStackTrace();
		      }
		    }
	}

}
