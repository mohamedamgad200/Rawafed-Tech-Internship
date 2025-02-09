package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import org.postgresql.Driver;

public class JDBCConnect {
	public static void main(String[] args) {
		ResourceBundle rb=ResourceBundle.getBundle("com.jdbc.db_en_US");
		// 1- driver class
		Driver driver;
		// 2 - dtabase address (url)
//		String url = "jdbc:postgresql://localhost:5432/JDBCTest";
		String url=rb.getString("url");
		// 3 - database user name
//		String userName = "postgres";
		String userName=rb.getString("userName");
		// 4 - database password
//		String password = "admin";
		String password=rb.getString("password");
		try
		{
			Connection conn=DriverManager.getConnection(url, userName, password);
			String query="SELECT * from courses";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				int id=rs.getInt("course_id");
				String name=rs.getString("course_name");
				double price=rs.getDouble("price");
				System.out.printf("Course: %15s, ID: %d, Cost: %5f%n",name,id,price);
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
}
