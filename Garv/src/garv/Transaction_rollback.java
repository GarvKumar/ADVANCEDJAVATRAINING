package garv;
import java.sql.*;  
import java.io.*;
public class Transaction_rollback {
	public static void main(String args[]){  
	try{  
	  
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(
	             "jdbc:mysql://localhost:3306/garv",
	             "root", "root");  
		con.setAutoCommit(false);  
	  
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
	  
			System.out.println("enter id");  
			String s1=br.readLine();  
	//int id=Integer.parseInt(s1);  
	  
			System.out.println("enter name");  
			String name=br.readLine();  
	  
			System.out.println("enter dept");  
			String s3=br.readLine();  
		
		  
			ps.setString(1,s1);  
			ps.setString(2,name);  
			ps.setString(3,s3);  
			//ps.setInt(3,salary);  
			ps.executeUpdate();  
			  
			System.out.println("commit/rollback");  
			String answer=br.readLine();  
			if(answer.equals("commit")){  
				con.commit();  
			}  
			if(answer.equals("rollback")){  
				con.rollback();  
			}  
		  
			System.out.println("Want to add more records y/n");  
			String ans=br.readLine();  
			if(ans.equals("n")){  
				break;  
			}  
		}
		con.commit();  
		System.out.println("record successfully saved");  
		  
		con.close();//before closing connection commit() is called  
		}
		catch(Exception e){
			System.out.println(e);
		
	
	}

}
}
