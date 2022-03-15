package atlas2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import exception.SystemException;

public class DbUtil {
	
		static Connection conn;
		static {
			//step1
			try {
				Class.forName("org.postgresql.Driver");
				//System.out.println("Driver Loaded....");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	  static Connection receiveConnection() throws SystemException {
		  //singleton design pattern
		  //step2
			String connectionUrl = "jdbc:postgresql://localhost:5437/project_1";
			String userName = "postgres";
			String password = "allstar92";
			
		  
		  if(conn == null) {
		  try { // System.out.println("Connection Established");
			  conn = DriverManager.getConnection(connectionUrl, userName, password); // this line should only execute once
		  }catch(SQLException e) {
			  throw new SystemException();
		  }
		
	  }
		return conn;
	  }
	  static void closeConnection() throws SystemException {
		  try{
			  conn.close();
		  } catch(SQLException e) {
			  throw new SystemException();
		  }}
}
