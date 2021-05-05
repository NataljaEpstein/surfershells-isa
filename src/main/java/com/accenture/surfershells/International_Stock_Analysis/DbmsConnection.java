package com.accenture.surfershells.International_Stock_Analysis;

import java.sql.*; // Connection Klasse kann genutzt werden

public class DbmsConnection {
	
	String url;
	String password;
	String username;
	
	public DbmsConnection (String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Connection to the driver could not be established.");
		}

		String url = "jdbc:mysql://localhost:3306/international_stock_analysis_db";
		try {
			DbmsConnection con = (DbmsConnection) DriverManager.getConnection(url, "root", "Root");
		} catch (SQLException e) {
			System.out.println("Please check driver url, account name and password.");
		}
		return null;
	}
	
	public void closeConnection(Statement stmt, DbmsConnection con) throws SQLException {
		
		stmt.close();
	}
}
