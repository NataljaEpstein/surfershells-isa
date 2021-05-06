package com.accenture.surfershells.International_Stock_Analysis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StockElement {
		
		private String stockName;
		private String industryName;
		private String price;
		private LocalDate priceDate;
		
		public StockElement (String stockName, String industryName, String price, String priceDate) {
			this.stockName = stockName;
			this.industryName = industryName;
			this.price = price.replaceAll("[€]", "EUR").replace(",", ".");
			this.priceDate = LocalDate.parse(priceDate, DateTimeFormatter.ofPattern("dd.MM.yy").withLocale(Locale.GERMAN));
			
			return;
		}

		public String getStockName() {
			return stockName;
		}
		public void setStockName(String stockName) {
			this.stockName = stockName;
		}
		public String getIndustryName() {
			return industryName;
		}
		public void setIndustryName(String industryName) {
			this.industryName = industryName;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public LocalDate getPriceDate() {
			return priceDate;
		}
		public void setPriceDate(LocalDate priceDate) {
			this.priceDate = priceDate;
		}

		public String toString() {
			return "StockElement [stockName=" + stockName + ", industryName=" + industryName + ", price=" + price
					+ ", priceDate=" + priceDate + "]";		
		}
	}
