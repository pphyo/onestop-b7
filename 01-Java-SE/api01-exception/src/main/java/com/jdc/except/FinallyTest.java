package com.jdc.except;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyTest {

	public static void main(String[] args) {
		System.out.println("Beginning...");

		try {
			
			System.exit(0);
//			System.out.println(3 / 0);
			
//			System.out.println("Try Ending...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("Program Terminated...");
		
	}
	
	void run() {
		
		try(var close = new AutoClosableSub()) {
			
		}
		
		// try with resources
		try(Connection conn = getConnection()) {
			
		} catch (Exception e) {
			e.printStackTrace();
		} //finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/test_db", 
				"root", 
				"pyaephyo"
				);
	}

}