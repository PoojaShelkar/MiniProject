package Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnect {
	
	 static final String driver="com.mysql.cj.jdbc.Driver";
	 static final String url="jdbc:mysql://localhost:3306/MiniProject";
	 static final String user="root";
	 static final String password="Pooja@123";
	 
	 public static Connection getConnection()
	 {  
		 Connection con=null;
		 try {
			con=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return con;
	 }
	
	
}



