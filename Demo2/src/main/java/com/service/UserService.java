package com.service;

import com.model.User;


public interface UserService {
	
	public void saveUser(User user);
	public User getUser(long id);

}
