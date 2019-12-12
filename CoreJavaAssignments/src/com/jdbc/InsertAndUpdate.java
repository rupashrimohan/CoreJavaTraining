package com.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class InsertAndUpdate {
	private static String url = "jdbc:mysql://localhost:3306/sakila";
	private static String username = "root";
	private static String password = "test";
	//private static String insertquery="Insert into Actor(actor_id,first_name,last_name)"+"values(?,?,?)";
	private static String updatequery="Update Actor Set first_name=? Where actor_id = ?";
	private static String selectquery = "Select * From actor where actor_id=302";
	
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Driver drive = new Driver();
			DriverManager.registerDriver(drive);
			
			Properties prop = new Properties();
			prop.getProperty("username", username);
			prop.getProperty("password", password);
			java.sql.Connection conn = DriverManager.getConnection(url, username, password);			
			
			/*
			 * PreparedStatement pstat = conn.prepareStatement(selectquery);
			 * pstat.setString(1, "Lamor"); pstat.setInt(2, 302);
			 */
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery(selectquery);
			if(rs != null) {
				String firstName = null;
				String lastname = null;
				Timestamp timestamp = null;
				int actorId = 0;
				while(rs.next()) {
					actorId = rs.getInt("actor_id");
					firstName = rs.getString("first_name");
					lastname = rs.getString("last_name");
					timestamp = rs.getTimestamp("last_update");
					System.out.println(actorId + "  " + firstName + "  " + lastname + "  " + timestamp);
				}
			}
			//int rowsaffected = pstat.executeUpdate();
		//	System.out.println("Rowsaffected:"+rowsaffected);
			System.out.println("Connection Object should not be NULL:"+conn);
			conn.close();
			
			
		}

			catch(SQLException sql)
		{
			sql.printStackTrace();
		}
	
	
	}
// TODO Auto-generated method stub

	}


