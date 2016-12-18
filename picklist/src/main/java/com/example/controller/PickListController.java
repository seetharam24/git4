package com.example.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Address;
import com.example.entity.PickList;
import com.example.entity.Student;
import com.example.service.Service;


@RestController
public class PickListController {
	
	
	@Autowired
	private Service service;
	
	@GetMapping(value="/start/{stuclass}/{name}/{school}/{country}/{city}/{street}" ,produces="application/json")
	public @ResponseBody Address startPage(@PathVariable String stuclass,@PathVariable String name,@PathVariable String school,
			@PathVariable String country,@PathVariable String city,@PathVariable String street){
		
		
		System.out.println("----start----");
		Student stu=new Student();
		stu.setStuclass(stuclass);
		stu.setStuname(name);
		stu.setSchool(school);
		stu.setCity(city);
		stu.setCountry(country);
		
		Student stu1=new Student();
		stu1.setStuclass("first");
		stu1.setStuname("sandhya");
		stu1.setSchool("zphs");
		stu1.setCity(city);
		stu1.setCountry(country);
		
		//service.saveStudent(stu);
		
		
		Address addr=new Address();
		addr.setCountry(country);
		addr.setCity(city);
		addr.setStreet(street);
		
		Set<Student> students=new HashSet<Student>();
		students.add(stu);
		students.add(stu1);
		addr.setStudent(students);
		service.saveAddress(addr);
		return addr;
	}
	
	@PutMapping(value="/save",consumes="application/json")
	public @ResponseBody PickList savePickList(@RequestBody PickList pickList){
		return pickList;
	}
	
	

}
