package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class ReadingResultSetUsingHashMap {

	public static void main(String[] args) throws SQLException {
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila","root","Gokul@2023");
		
		String query = "SELECT actor_id,last_name from actor";
		
		var ToNameMap = new HashMap<Integer,String>();
		
		try(var ps = connect.prepareStatement(query);
				var rs = ps.executeQuery()){
			while(rs.next()) {
				int id = rs.getInt("actor_id");
				String lname = rs.getString("last_name");
				ToNameMap.put(id, lname);
			}
			System.out.println(ToNameMap);
		}
	}
}

