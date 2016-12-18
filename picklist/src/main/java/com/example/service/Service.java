package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.Address;
import com.example.entity.Student;
import com.example.repository.AddressRepo;
import com.example.repository.Repository;

@Component
public class Service {

	@Autowired
	private Repository repo;
	
	@Autowired
	private AddressRepo addrRepo;
	
	public Student saveStudent(Student student){
		return repo.save(student);
	}
	
	public Address saveAddress(Address address){
		return addrRepo.save(address);
	}
}
