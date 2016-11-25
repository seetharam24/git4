package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@RequestMapping("/user/{id}")
	public String getRemoteUser(@PathVariable("id") String id){
		System.out.println("--geeting user:"+id);
		RestTemplate restTemplate = new RestTemplate();
        String result=restTemplate.getForObject("http://localhost:8080/user/"+id, String.class);
        System.out.println("Result:"+result);
		return "Got user from Remote url:"+result;
	}
	
	@RequestMapping("/userObj/{id}")
	public String getRemoteUserObj(@PathVariable("id") String id){
		System.out.println("--geeting user:"+id);
		 Map<String, String> params = new HashMap<String, String>();
		    params.put("id", id);
		RestTemplate restTemplate = new RestTemplate();
        User result=restTemplate.getForObject("http://localhost:8080/userObj/{id}", User.class,params);
        System.out.println("Result:"+result);
		return "Got user from Remote url:"+result;
	}
}
