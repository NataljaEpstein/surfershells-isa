package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.accenture.surfershells.International_Stock_Analysis.StockElement;

public class ImportCsv {
	
	public Connection con;
	
	public ImportCsv (Connection con) {
		this.con = con;
	}
	
	public ArrayList<StockElement> importCsv () throws SQLException{
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM stockELement");
		
		ArrayList <StockElement> stockElements = new ArrayList<>();
		
		while (resultSet.next()) {
			StockElement stockElement = new StockElement();
			stockElement.setStockName(resultSet.getString("stock_name"));
			stockElement.setIndustryName(resultSet.getString("industry_name"));
			stockElement.setPrice(resultSet.getString("price"));
			stockElement.setPriceDate(resultSet.getString("priceDate")); //?
			
			stockElement.add(stockElement);			
		}
		return stockElements;
		
		/*
		
		for (StockElement stockElement: stockElements) {
			PreparedStatement statementIndustry = con
					.prepareStatement("INSERT IGNORE INTO industry (industry_name) VALUES (?)");
			statement.setString(1,stockElement.getIndustryName());
			
			
		}*/
	}

}
