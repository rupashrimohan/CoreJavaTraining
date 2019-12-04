package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;
import java.util.Date;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestJDBC {
	
	private static String url = "jdbc:mysql://localhost:3306/sakila";
	private static String username = "root";
	private static String password = "test";
	private static String selectquery="select * from film";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		Driver mysqldriver = new Driver();
		DriverManager.registerDriver(mysqldriver);
		Properties prop = new Properties();
		prop.setProperty(username,"root");
		prop.setProperty(password,"test");	
		Connection  conn = DriverManager.getConnection(url, username, password);
		Statement state= conn.createStatement();
		ResultSet res = state.executeQuery(selectquery);
		if(res!=null)
		{
			int filmID = 0;
			int language_id =0;
			String title =null;
			String description = null;
			int original_language_id =0;
			Date year = null;
			
			while(res.next())
			{
				title = res.getString("title");
				filmID = res.getInt("film_id");
				description= res.getString("description");
				language_id =res.getInt("language_id");
				year =res.getDate("release_year"); 
				original_language_id =res.getInt("original_language_id");
System.out.println(filmID+" "+title+" "+description+"\n"+" "+year+" "+language_id+" "+original_language_id);
			}
		}
		
		
		
		System.out.println("Connection Object should not be NULL:"+conn);
		conn.close();
		
		
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
	

	}

}
