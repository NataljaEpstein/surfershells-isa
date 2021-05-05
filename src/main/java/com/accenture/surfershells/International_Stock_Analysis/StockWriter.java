package com.accenture.surfershells.International_Stock_Analysis;

import java.sql.Connection;

public class StockWriter {
		private Connection con;
		
		public StockWriter (Connection con) {
			this.con = con;
		}
}
