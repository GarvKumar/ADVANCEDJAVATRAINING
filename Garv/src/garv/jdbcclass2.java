package garv;

import java.sql.*;  //step 1

public class jdbcclass2 {

	public static void main(String args[]) throws SQLException, ClassNotFoundException
	    {
	        String url="jdbc:mysql://localhost:3306/garv";
	        String uname="root";
	        String pass="root";
	        String query
	            = "insert into student values(10, 'pihu', 'M.Tech Int.')";
	 
	        // Load driver class
	        Class.forName("com.mysql.cj.jdbc.Driver");
	 
	        // Obtain a connection
	        Connection con = DriverManager.getConnection(
	            url, uname, pass);
	 
	        // Obtain a statement
	        Statement st = con.createStatement();
	 
	        // Execute the query
	        int count = st.executeUpdate(query);
	        System.out.println(
	            "number of rows affected by this query= "
	            + count);
	 
	        // Closing the connection as per the
	        // requirement with connection is completed
	        con.close();
	    }
}
