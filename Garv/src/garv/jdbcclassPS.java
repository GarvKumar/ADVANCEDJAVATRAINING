package garv;
import java.sql.*;
import java. util. Scanner;
import java.util.*;

public class jdbcclassPS {
	 public static void main(String args[])
	    {
	        Scanner scan = new Scanner(System.in);
	        try {
	 
	            // loading driver class
	            Class.forName("com.mysql.cj.jdbc.Driver");
	             
	            // Step 3: Create connection object
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/garv",
	                "root", "root");
	 
	            // create the table
	            String sql1
	                = "CREATE TABLE Employee(EMPID VARCHAR(10) PRIMARY KEY,EMPNAME VARCHAR(50),EMPDEP VARCHAR(20))";
	            PreparedStatement ps
	                = con.prepareStatement(sql1);
	            ps.execute(sql1);
	 
	            // inserting records
	            String sql
	                = "Insert into Employee values(?,?,?)";
	            PreparedStatement ps1
	                = con.prepareStatement(sql);
	            for (int i = 0; i < 3; i++) {
	                System.out.println("Enter Emp ID");
	                String id = scan.nextLine();
	                System.out.println("Enter Emp Name");
	                String name = scan.nextLine();
	                System.out.println("Enter the Department");
	                String dept = scan.nextLine();
	                ps1.setString(1, id);
	                ps1.setString(2, name);
	                ps1.setString(3, dept);
	                // adding to batch
	                ps1.addBatch();
	            }
	            // executing the batch
	            ps1.executeBatch();
	           
	            // viewing the table
	            ResultSet rs
	                = ps.executeQuery("Select * from Employee");
	            System.out.println(
	                "EmpID\tName\t\tDepartment");
	            System.out.println(
	                "-------------------------------------------------------");
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + "\t\t"
	                                   + rs.getString(2)
	                                   + "\t\t"
	                                   + rs.getString(3));
	            }
	           // con.commit();
	            con.close();
	        }
	 
	        catch (Exception e) {
	            System.out.println(e);
	        }
	    }

}
