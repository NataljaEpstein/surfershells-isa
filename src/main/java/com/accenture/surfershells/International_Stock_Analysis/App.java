package com.accenture.surfershells.International_Stock_Analysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.accenture.surfershells.International_Stock_Analysis_Commandos.ImportCsv;

public class App {
	public static void main(String[] args) throws Exception {
		

		try {
			ArrayList<StockElement> stockElements = new ArrayList <StockElement>();
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/international_stock_analysis_db";
			Connection con = DriverManager.getConnection(url, "root", "Root");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to the Stock App! Please choose between the following commandos:");
			System.out.println("");

		while (true) {
			System.out.println(
					"1. To import STOCK_DATA.csv, please enter 'i' for import.");
			System.out.println(
					"2. To delete STOCK_DATA.csv, please enter 'd' for delete.");
			System.out.println(
					"3. To search for the id of a company, please enter the first 3 characters of this company.");
			System.out.println(
					"4. To show you the last ten prices for a stock with a specific id, please enter 'show id'. Please replace id with the id number you are searching for.");
			System.out.println(
					"5. To add a new id, date and price for a specific time, please enter 'add id, date, price'. Please replace id, date and price with the new data.");
			System.out.println(
					"6. To show you the the highest price for a stock ever had, please enter 'm' for max id.");
			System.out.println(
					"7. To show you the the lowest price for a stock ever had, please enter 'l' for low id.");
			System.out.println(
					"8. To show show the difference between the highest and the lowest price ever recorded, please enter 'g' for gap id.");
			System.out.println(
					"9. To update a stocks industry, please enter 'u id, industry'. Please replace id and industry with the new data. ");
			System.out.println(
					"9. To update a stocks industry, please enter 'u id, industry'. Please replace id and industry with the new data. ");
			System.out.println(
					"10. To list all industries in the database with its ID and the number of stocks assigned to this industry, please enter 'industries'.");
			
			String input = scanner.nextLine();
			
			break;
		}
		System.out.println("");
		
	} catch (ClassNotFoundException e) {
		System.out.println("Connection to the driver could not be established.");// Mit Treiber verbunden?
		System.out.println("");
		
	} catch (SQLException e) {
		System.out.println("Please check driver url, account name and password.");// Logindaten richtig?
	}
		// ImportCsv.importCsv("STOCK_DATA_test.csv");
	}
}