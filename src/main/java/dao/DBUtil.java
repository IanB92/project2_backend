package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exceptions.SystemException;

public class DBUtil {
	// Using static to save memory because we only wanna call this once when
	// for each method.
	// Step 1 connect to driver
	static Connection conn;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Step 2 connect to Database

	static Connection getConnected() {
		/*
		 * String username = "postgres";
		  String password = "Yeshua7753";
		  String connectionUrl = "jdbc:postgresql://127.0.0.1:5432/bank";
		 * 
		 */
		
		String username = "postgres";
		String password = "Yeshua7753";
		//String connectionUrl = "jdbc:postgresql://127.0.0.1:5432/project_1";
		String connectionUrl ="jdbc:postgresql://ip-172-31-24-207.ec2.internal:5432/project2_backend";
				
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(connectionUrl, username, password);
				System.out.println("Connections established");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
