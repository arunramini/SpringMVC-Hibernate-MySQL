package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.SalesDAO;
import com.jwt.model.Sales;

@Service
@Transactional
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SalesDAO salesDao;

	@Override
	@Transactional
	public void addSales(Sales sales) {
		salesDao.addSales(sales);
	}

	@Override
	public List<Sales> getSales(String  county) {
		return salesDao.getSales(county);
	}


	
}
