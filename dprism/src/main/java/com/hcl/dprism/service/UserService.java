package com.hcl.dprism.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.dprism.controller.User;

@Service
public class UserService {
	private List<User> user = new ArrayList<>(Arrays.asList(new User("Parag", 21, "Dprizm"), new User("Pallav", 23, "DryIce"),
			new User("Ankit", 12, "Cloud"))
			);
	
	public  List<User> getAllUser(){
		return user;
		
	}

	public void addUser(User user2) {
		user.add(user2);
		
	}

//	public void addUser(User user) {
//		((List<User>) user).add(user);
//		
//	}

}
