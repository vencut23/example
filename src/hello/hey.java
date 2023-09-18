package hello;

import java.sql.*;

public class hey {

	public static void main(String[] args) {
		 
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/venkat","root","9865271790a");  
			//here sonoo is database name, root is username and password  
			}catch(Exception e){ System.out.println(e);}  
			}  
		
}
