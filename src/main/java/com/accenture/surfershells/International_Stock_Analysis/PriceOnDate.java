package com.accenture.surfershells.International_Stock_Analysis;

import java.sql.Date;

public class PriceOnDate {
	
	private Integer id;
	private String name;
	private Double price;
	private Date onDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getDate() {
		return onDate;
	}
	public void setDate(Date date) {
		this.onDate = date;
	}
	
	

}
