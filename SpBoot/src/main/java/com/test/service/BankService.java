package com.test.service;

import com.test.beans.UserData;

public interface BankService {
	
	public void saveUser(UserData user);
	public UserData getUser(String userName,String password);

}
