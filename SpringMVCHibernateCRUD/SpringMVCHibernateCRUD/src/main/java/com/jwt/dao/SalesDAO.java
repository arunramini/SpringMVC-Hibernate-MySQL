package com.jwt.dao;

import java.util.List;

import com.jwt.model.Sales;

public interface SalesDAO {

	public List<Sales> getSales(String county);
	public void addSales(Sales sales);
	
}
