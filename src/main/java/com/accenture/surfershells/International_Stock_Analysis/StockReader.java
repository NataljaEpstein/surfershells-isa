package com.accenture.surfershells.International_Stock_Analysis;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StockReader {
	private Connection con;
	
	public StockReader (Connection con) {
		this.con = con;
	}
	
	public ArrayList<StockElement> read() throws Exception {
		

		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from stock");
		
		ArrayList<StockElement> stocks = new ArrayList<>();
		
		while (resultSet.next()) {
			StockElement stock = new StockElement ();
			stock.setStockName(resultSet.getString("stock_name"));
			stock.setIndustryName(resultSet.getString("industry_name"));
			stock.setPrice(resultSet.getDouble("price"));
			stock.setPriceDate(resultSet.getString("priceDate"));
			
			stocks.add(stock);
		}
		for (StockElement stock: stocks) {
			System.out.println(stock.getStockName()+ ": " + stock.getIndustryName() + ": " + stock.getPrice() + ": " + stock.getPriceDate());
		}
		return stocks;
	}
}
