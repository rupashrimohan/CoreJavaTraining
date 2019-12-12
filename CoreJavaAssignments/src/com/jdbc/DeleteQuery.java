package com.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DeleteQuery {
	private static String url = "jdbc:mysql://localhost:3306/sakila";
	private static String username = "root";
	private static String password = "test";
	//private static String insertquery="Insert into Actor(actor_id,first_name,last_name)"+"values(?,?,?)";
//	private static String updatequery="Update Actor Set first_name=? Where actor_id = ?";
//	private static String selectquery = "Select * From actor where actor_id=302";
	private static String deletequery = "Delete from actor Where actor_id=?";
	
	
	
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Driver drive = new Driver();
			DriverManager.registerDriver(drive);
			
			Properties prop = new Properties();
			prop.getProperty("username", username);
			prop.getProperty("password", password);
			java.sql.Connection conn = DriverManager.getConnection(url, username, password);			
			
			
			  PreparedStatement pstat = conn.prepareStatement(deletequery);
			   pstat.setInt(1, 301);
			   			 
			/*
			 * if(rs != null) { String firstName = null; String lastname = null; Timestamp
			 * timestamp = null; int actorId = 0; while(rs.next()) { actorId =
			 * rs.getInt("actor_id"); firstName = rs.getString("first_name"); lastname =
			 * rs.getString("last_name"); timestamp = rs.getTimestamp("last_update");
			 * System.out.println(actorId + "  " + firstName + "  " + lastname + "  " +
			 * timestamp); } }
			 */
		    int rows=pstat.executeUpdate();
		  System.out.println("Rowsaffected:"+rows);
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
