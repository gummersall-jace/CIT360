package edu.gummersall.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/Employee?useSSL=false";
		String user = "user1";
		String pass = "letmein";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConnection =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Successful connection\n\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
