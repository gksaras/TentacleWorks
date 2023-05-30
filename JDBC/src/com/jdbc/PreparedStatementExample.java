package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {

	private void test_3() throws SQLException {

		//var insertQuery = "INSERT INTO SAKILA.ACTOR(first_name,last_name) VALUES ('JACK','SPARROW');";
		//var updateQuery = "UPDATE SAKILA.ACTOR SET last_name ='SYNDER' where actor_id = 202";
		//var deleteQuery = "DELETE FROM SAKILA.ACTOR where actor_id = 203";

		Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila", "root", "Gokul@2023");

//		try (var ps = connect.prepareStatement(insertQuery)) {
//			int result = ps.executeUpdate();
//			System.out.println(result);
//		}
//
//		try (var ps = connect.prepareStatement(updateQuery)) {
//			int result = ps.executeUpdate();
//			System.out.println(result);
//		}

//		try (var ps = connect.prepareStatement(deleteQuery)) {
//			int result = ps.executeUpdate();
//			System.out.println(result);
//		}
	}

	private void test_4() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila", "root", "Gokul@2023");

        var sql = "SELECT * FROM actor";
        try (var ps = conn.prepareStatement(sql); 
        		ResultSet rs = ps.executeQuery()) { 
        		System.out.println(rs.toString());
        }
	}

	private void test_5() throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila", "root", "Gokul@2023");

        var sql = "SELECT * FROM actor";
        try (var ps = conn.prepareStatement(sql)) {
        	
        	boolean execute = ps.execute();
        	if (execute) {
				try(var rs = ps.getResultSet()) {
					System.out.println("ran a query");
				}
			} else {
				int updateCount = ps.getUpdateCount();
				System.out.println(updateCount);
				System.out.println("ran an update");
			}
        }
	}
        

    public static void register(Connection conn, String firstName, String lastName) throws SQLException {

        String query = "INSERT INTO sakila.actor (first_name, last_name) VALUES (?, ?);";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.executeUpdate();
        }  
    }
	
	private void test_6() {

	}

	private void test_7() {

	}

	private void test_8() {

	}

	private void test_9() {

	}

	public static void main(String[] args) throws SQLException {

		PreparedStatementExample p = new PreparedStatementExample();
		p.test_3();
		p.test_4();
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila", "root", "Gokul@2023");
    	register(conn, "BEN", "AFFLECK");
	}
}
