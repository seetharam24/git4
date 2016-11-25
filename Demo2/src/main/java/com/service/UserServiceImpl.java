package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
import com.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	
	public void saveUser(User user) {
		userRepo.save(user);
		
	}
	
	public User getUser(long id) {
		return userRepo.getOne(id);
		
	}

}
