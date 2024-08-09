package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.UserEntity;
import com.repository.UserRepo;

@Controller
public class UserController {

	@GetMapping("/adduser")
	public String addUser() {
		return "UserAdd";
	}
	
	@Autowired
	UserRepo urepo;
	
	@PostMapping("/adduser")
	public String getUser(UserEntity uentity) {
		System.out.println("FirstName:"+uentity.getFirstname());
		System.out.println("Email:"+uentity.getEmail());
		System.out.println("Password:"+uentity.getPassword());
		urepo.save(uentity);	
		return "UserAdd";
	}
}
