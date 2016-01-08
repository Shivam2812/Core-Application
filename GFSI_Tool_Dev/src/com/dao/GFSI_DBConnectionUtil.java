package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GFSI_DBConnectionUtil {
	
	private String username;
	private String password ;
	private String driverName;
	private String connectUrl;
	private static Connection con;
	
	
	public static Connection getConnection()
	{
		 if(con == null){
		 try {
			
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con = DriverManager.
	                getConnection("jdbc:oracle:thin:@<hostname>:<port num>:<DB name>"
	                    ,"user","password");
		
	            System.out.println("Created DB Connection....");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		 
		 return con;
		 }
	return con;
		
	}

}
