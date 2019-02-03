package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.UserDAO;
import com.jwt.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	@Override
	@Transactional
	public void addUser(User employee) {
		userDao.addUser(employee);
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		userDao.login(user);
	}


	
}
