package com.fabricio.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabricio.rest.business.UserService;
import com.fabricio.rest.data.User;



@RestController
public class UserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> gerUsers() {
		logger.info("Getting users");
		return userService.getUsers();
	}
	
	@GetMapping("/user/{id}")	
	public User gerUsers(@PathVariable Integer id) {
		logger.info("Getting user: " + id);
		return userService.getUser(id);
	}
	
	@PostMapping("/user")	
	User setUser(@RequestBody User user) {
		logger.info("Setting user: " + user.getId());
		return userService.setUser(user);
	}
	
	@PutMapping("/updateUser")
	User updateUser(@RequestBody User user) {
		logger.info("updating user: " + user.getId());
		return userService.updateUser(user);
	}
}
