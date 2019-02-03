package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Sales;

@Repository
public class SalesDAOImpl implements SalesDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addSales(Sales sales) {
		sessionFactory.getCurrentSession().saveOrUpdate(sales);

	}

	@Override
	public List<Sales> getSales(String county) {
		//String query = " SELECT * FROM SALES WHERE COUNTY="+county;
		String query = "select * from Sales where county= :county";
		//List<Sales> sales =sessionFactory.getCurrentSession().createQuery(query).list();
		  return sessionFactory.getCurrentSession().createQuery("FROM Sales u WHERE  u.county = :county").setParameter("county", county).list();
	}

}