package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ResultSetExample {

	private void test_1() throws SQLException {
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila","root","Gokul@2023");
		
		var query = "SELECT count(*) from actor";
		
		try(var ps = connect.prepareStatement(query);
			
				var rs = ps.executeQuery();) {
			
			while(rs.next()) {
				
				int count = rs.getInt(1);
				System.out.println(count);
			}
		}
		
	}
	
	private void test_2() throws SQLException {
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila","root","Gokul@2023");
		
		var query = "SELECT count(*) as total from actor";
		
		try(var ps = connect.prepareStatement(query);
			
				var rs = ps.executeQuery();) {
			
			while(rs.next()) {
				
				var count = rs.getInt("total");
				System.out.println(count);
			}
		}
	}
	
	private void test_3() throws SQLException {

	Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila","root","Gokul@2023");
		
		var query = "SELECT * from actor where first_name = ''";
		
		try(var ps = connect.prepareStatement(query);
			
				var rs = ps.executeQuery();) {
			
			if(rs.next()) {
				
				var fname = rs.getString(2);
				System.out.println(fname);
			} else {
				System.out.println("Name not Found");
			}
		}
	}
	
	private void test_4() throws SQLException {
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila","root","Gokul@2023");
		
		var query = "SELECT count(*) from customer";
		
		try(var ps = connect.prepareStatement(query);
			
				var rs = ps.executeQuery();) {
			
			while(rs.next()) {
				
				var count = rs.getInt(1);
				System.out.println(count);
			}
		}
	}
	
	public static void main(String[] args) throws SQLException {
		
		ResultSetExample r = new ResultSetExample();
		r.test_1();
		r.test_2();
		r.test_3();
		r.test_4();
		
		
	}
}
