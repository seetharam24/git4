package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/world")
	public String getMessage(){
	

		return "Hello Mule World";
	}
	
	
	@RequestMapping("/save/{userName}/{password}")
	public String saveUser(@PathVariable("userName") String username,@PathVariable("password") String password){
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		//user.setId(1l);
		userService.saveUser(user);
		return "User Saved :"+username;
	}
	
	@RequestMapping(value="/user/{id}")
	public String getUser(@PathVariable("id") String id ){
		System.out.println("---getting user id:"+id);
		return userService.getUser(Long.parseLong(id)).getUsername();
	}
	
	@RequestMapping(value="/userObj/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUserObj(@PathVariable("id") String id ){
		System.out.println("---getting user id:"+id);
		return new ResponseEntity<User>(userService.getUser(Long.parseLong(id)),HttpStatus.OK);
	}
	
	
	
}
