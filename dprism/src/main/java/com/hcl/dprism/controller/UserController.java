package com.hcl.dprism.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dprism.service.CommonService;
import com.hcl.dprism.service.UserService;

@RestController

@RequestMapping("/api")
public class UserController {
	@Autowired
	private CommonService userService;
	@Autowired
	private UserService   usrservice;

	@GetMapping("/userName")
	public String getUserName() {

		return userService.userService() +"bikash";
	}
	
	@GetMapping("/getloggedinuser")
	public String getLoggedinUserName() {

		return userService.userService() + "logged Bikash";
	}
	@CrossOrigin(origins="*")
	@GetMapping("/userDetails")
	public List<User> getUserDetail() {

		return usrservice.getAllUser();
	}
	@CrossOrigin(origins="*")
	@PostMapping(path = "/userDetails", consumes = "application/json", produces = "application/json")
	public void addUser
	(@RequestBody User user){
		usrservice.addUser(user);
	}

}
