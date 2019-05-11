package com.fabricio.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fabricio.rest.business.UserService;
import com.fabricio.rest.data.User;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> gerUsers() {		
		return userService.getUsers();
	}
	
	@GetMapping("/user/{id}")	
	public User gerUsers(@PathVariable Integer id) {		
		return userService.getUser(id);
	}
}
