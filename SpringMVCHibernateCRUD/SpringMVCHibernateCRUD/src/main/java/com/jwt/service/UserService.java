package com.jwt.service;

import com.jwt.model.User;

public interface UserService {
	
	public void addUser(User employee);
	public void login(User user);

}
