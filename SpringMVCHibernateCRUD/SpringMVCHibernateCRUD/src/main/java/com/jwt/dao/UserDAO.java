package com.jwt.dao;

import com.jwt.model.User;

public interface UserDAO {

	public void addUser(User employee);
	public void login(User user);
	
}
