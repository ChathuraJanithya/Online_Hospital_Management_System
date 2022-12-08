package com.rec;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	public static String url = "jdbc:mysql://localhost:3306/Online_Hospital_Management_system";
	public static String user = "root";
	public static String pass = "macbookm1";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection(url, user, pass);
		
	}
		catch(Exception e){
			System.out.println("Database connection failed...");
			
		}
		
		return con;
	}
	
	
}
