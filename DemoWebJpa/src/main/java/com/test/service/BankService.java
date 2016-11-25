/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.test.service;

import com.test.beans.UserData;

public interface BankService {
	void saveUser(UserData arg0);

	UserData getUser(String arg0, String arg1);
}