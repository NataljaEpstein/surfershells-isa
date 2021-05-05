package com.accenture.surfershells.International_Stock_Analysis;

import java.sql.PreparedStatement;

public class InsertStockRecord {
	
	public boolean insertStockRecord() {
		// we need a db connection
		DbmsConnection connect = null;
		DbmsConnection con = null;
		PreparedStatement stmt = null;
		
		connect = new DbmsConnection("\"jdbc:mysql://localhost:3306/international_stock_analysis_db\"");
		
		
				
	}

}
