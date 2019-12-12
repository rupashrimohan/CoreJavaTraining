package com.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;

public class JDBCInstance {
	
	private static String url = "jdbc:mysql://localhost:3306/sakila";
	private static String username = "root";
	private static String password = "test";
	private static String selectquery="select * from film where film_id > ? and title like ?";
	private static java.sql.Connection conn;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Driver drive = new Driver();
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Properties prop = new Properties();
			prop.getProperty("username", username);
			prop.getProperty("password", password);
			//java.sql.Connection 
			conn = DriverManager.getConnection(url, username, password);			
			
			PreparedStatement pstat = conn.prepareStatement(selectquery);
			pstat.setInt(1, 1);
			pstat.setString(2, "%A");
			ResultSet res = pstat.executeQuery();
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

			catch(SQLException sql)
		{
			sql.printStackTrace();
		}
	catch(ClassNotFoundException ex)
		{
		ex.printStackTrace();
		}
	
	}

}
