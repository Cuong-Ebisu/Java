package vn.ltweb.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	//private static String DB_URL = "jdbc:mysql://localhost:3306/mvcservletltweb2021";
	//private static String USER_NAME = "root";
	//private static String PASSWORD  = "123456@a";
	private static Connection con;
	
	public static Connection getConnection() throws IOException{
		con = null;
		
		try {
			//driver register
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
		}
		catch(SQLException ex){
			
		}
		return (con);
	}
}
