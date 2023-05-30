package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstDatabaseConnection { 

	public static void main(String[] args) throws SQLException {
	
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user = "root";
		String pass = "Gokul@2023";

		try (Connection conn = DriverManager.getConnection(url, user, pass);
				// System.out.println(conn);
				PreparedStatement ps = conn.prepareStatement("SELECT * from actor");
				ResultSet res = ps.executeQuery()) {
			while (res.next()) {
	
			System.out.println(res.getString(1)+" "+res.getString(2)
			);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}  
	}
}
