package com.jwt.service;

import java.util.List;

import com.jwt.model.Sales;

public interface SalesService {
	
	public List<Sales> getSales(String county);
	public void addSales(Sales sales);

}
