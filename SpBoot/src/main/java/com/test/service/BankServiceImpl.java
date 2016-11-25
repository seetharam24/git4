package com.test.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.beans.UserData;
import com.test.repository.UserCurdRepository;
import com.test.repository.UserRepository;

@Service
@Component
public class BankServiceImpl implements BankService{

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserCurdRepository userCurdRepo;
	
	
	@Override
	public void saveUser(UserData user) {
		userCurdRepo.save(user);
		
	}


	@Override
	public UserData getUser(String userName, String password) {
		System.out.println("---checking authontication in DB---");
		List<UserData> users=userRepo.findByNameMatch(userName, password);
		if(!users.isEmpty()){
			return (UserData)users.get(0);
		}
		return null;
	}

	

}
