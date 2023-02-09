package garv;

import java.sql.*;
import java. util. Scanner;
import java.util.*;

public class createtabledeptPS {
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
                = "CREATE TABLE Department(DepID INTEGER NOT NULL PRIMARY KEY,DepNAME VARCHAR(50))";
            PreparedStatement ps
                = con.prepareStatement(sql1);
            ps.execute(sql1);
 
            // inserting records
            String sql
                = "Insert into Department values(?,?)";
            PreparedStatement ps1
                = con.prepareStatement(sql);
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter Dep ID");
                String id = scan.nextLine();
                System.out.println("Enter Dep Name");
                String name = scan.nextLine();
                ps1.setString(1, id);
                ps1.setString(2, name);
                // adding to batch
                ps1.addBatch();
            }
            // executing the batch
            ps1.executeBatch();
           
            // viewing the table
            ResultSet rs
                = ps.executeQuery("Select * from Department");
            System.out.println(
                "DepID\t\tName");
            System.out.println(
                "-------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t\t"
                                   + rs.getString(2)
                                   );
            }
           // con.commit();
            con.close();
        }
 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
