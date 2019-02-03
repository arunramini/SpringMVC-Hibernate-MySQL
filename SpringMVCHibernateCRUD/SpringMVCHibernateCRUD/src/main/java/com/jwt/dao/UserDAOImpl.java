package com.jwt.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);

	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}


}