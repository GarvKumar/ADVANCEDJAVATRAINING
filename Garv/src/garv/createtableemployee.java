package garv;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class createtableemployee {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//serverhost = localhost, port=3306, username=root, password=root
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/garv","root","root");
			Statement smt=cn.createStatement();
			//query to create table Employees with fields name(empid,empname,dob,city,salary)
			String q="create table Employees(empid varchar(10) primary key,empname varchar(45),dob date,city varchar(45),salary varchar(45))";
			//to execute the update
			smt.executeUpdate(q);
			System.out.println("Table Created....");
			cn.close();

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
