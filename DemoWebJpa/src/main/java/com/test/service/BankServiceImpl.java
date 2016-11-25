/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.test.service;

import com.test.beans.UserData;
import com.test.repository.UserCurdRepository;
import com.test.repository.UserRepository;
import com.test.service.BankService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class BankServiceImpl implements BankService {
	@Autowired
	UserRepository userRepo;
	@Autowired
	UserCurdRepository userCurdRepo;

	public void saveUser(UserData user) {
		this.userCurdRepo.save(user);
	}

	public UserData getUser(String userName, String password) {
		System.out.println("---checking authontication in DB---");
		List users = this.userRepo.findByNameMatch(userName, password);
		return !users.isEmpty() ? (UserData) users.get(0) : null;
	}
}