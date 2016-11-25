package com.test.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.beans.UserData;
import com.test.service.BankService;

@Controller
public class HomeController {
	
	

	UserData user;
	
	@Autowired
	private BankService service;
	
	
	@RequestMapping("/hello")
	public String getName(){
		System.out.println("----hello-----");
		return "success";
	}
	
	@RequestMapping("/")
	public String getIndex(){
		System.out.println("----hello-----");
		return "index";
	}
	
	@RequestMapping("/start")
	public String startPage(){
		System.out.println("----hello-----");
		return "index";
	}
	
	
	@RequestMapping("/newUser")
	public String addNewUser(Model model){
		user=new UserData();
		model.addAttribute("userForm", user);
		System.out.println("----hello-----");
		return "addUser";
	}
	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("userForm") UserData user){
		System.out.println("----saving user-----"+user.getUserName());
		service.saveUser(user);
		return "success";
	}
	
	@RequestMapping("/login")
	public String loginPage(Model model){
		user=new UserData();
		model.addAttribute("userForm", user);
		System.out.println("----hello-----");
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logoutPage(Model model){
		model.addAttribute("userForm", user);
		System.out.println("----hello-----");
		return "index";
	}
	
	@RequestMapping("/home")
	public String homePage(@ModelAttribute("userForm") UserData user,Model model){
		model.addAttribute("userName", user.getUserName());
		user=service.getUser(user.getUserName(),user.getPassword());
		if(user!=null){
			System.out.println("----hello-----");
			return "home";
		}else{
			return "loginError";
		}
		
	}
	
	@RequestMapping("/checkBal")
	public String checkBalance(@ModelAttribute("userForm") UserData user,Model model){
		model.addAttribute("userName", user.getUserName());
		System.out.println("----hello-----");
		return "checkBalance";
	}
	
	@RequestMapping("/loadUpdateProfile")
	public String updateProfile(Model model){
		model.addAttribute("userForm", user);
		System.out.println("----loadUpdateProfile-----"+user.getUserName());
		return "updateProfile";
	}
	
}
