/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.test.controller;

import com.test.beans.UserData;
import com.test.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	UserData user;
	@Autowired
	private BankService service;

	@RequestMapping({ "/hello" })
	public String getName() {
		System.out.println("----hello-----");
		return "success";
	}

	@RequestMapping({ "/" })
	public String getIndex() {
		System.out.println("----hello-----");
		return "index";
	}

	@RequestMapping({ "/start" })
	public String startPage() {
		System.out.println("----hello-----");
		return "index";
	}

	@RequestMapping({ "/newUser" })
	public String addNewUser(Model model) {
		this.user = new UserData();
		model.addAttribute("userForm", this.user);
		System.out.println("----hello-----");
		return "addUser";
	}

	@RequestMapping({ "/saveUser" })
	public String saveUser(@ModelAttribute("userForm") UserData user) {
		System.out.println("----saving user-----" + user.getUserName());
		this.service.saveUser(user);
		return "success";
	}

	@RequestMapping({ "/login" })
	public String loginPage(Model model) {
		this.user = new UserData();
		model.addAttribute("userForm", this.user);
		System.out.println("----hello-----");
		return "login";
	}

	@RequestMapping({ "/logout" })
	public String logoutPage(Model model) {
		model.addAttribute("userForm", this.user);
		System.out.println("----hello-----");
		return "index";
	}

	@RequestMapping({ "/home" })
	public String homePage(@ModelAttribute("userForm") UserData user, Model model) {
		model.addAttribute("userName", user.getUserName());
		user = this.service.getUser(user.getUserName(), user.getPassword());
		if (user != null) {
			System.out.println("----hello-----");
			return "home";
		} else {
			return "loginError";
		}
	}

	@RequestMapping({ "/checkBal" })
	public String checkBalance(@ModelAttribute("userForm") UserData user, Model model) {
		model.addAttribute("userName", user.getUserName());
		System.out.println("----hello-----");
		return "checkBalance";
	}

	@RequestMapping({ "/loadUpdateProfile" })
	public String updateProfile(Model model) {
		model.addAttribute("userForm", this.user);
		System.out.println("----loadUpdateProfile-----" + this.user.getUserName());
		return "updateProfile";
	}
}