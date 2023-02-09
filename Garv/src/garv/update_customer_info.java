package garv;

import java.sql.*; 

public class update_customer_info { public static void main(String args[]) throws Exception{
String url="jdbc:mysql://localhost:3306/garv";
String userName="root";
String password="root";
String query="update customer set cname = 'harsh' where cid = 11";
Class.forName("com.mysql.cj.jdbc.Driver");//step 2
Connection con = DriverManager.getConnection(url,userName,password);//step3
Statement st= con.createStatement();//step4
int n = st.executeUpdate(query);
if(n == 1)
System.out.println("updated");
else
System.out.println("not updated");
st.close();
con.close();
}
}
