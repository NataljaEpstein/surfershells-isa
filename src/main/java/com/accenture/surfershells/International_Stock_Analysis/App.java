package com.accenture.surfershells.International_Stock_Analysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Connection to the driver could not be established.");
		}

		String url = "jdbc:mysql://localhost:3306/international_stock_analysis_db";
		try {
			Connection con = DriverManager.getConnection(url, "root", "Root");
		} catch (SQLException e) {
			System.out.println("Please check driver url, account name and password.");
		}
		
		// Verbindung zur Datenbank testen
		
		
		
		
	}
}
