package com.exam.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.Service.UserService;
import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	
	//creating user
	@PostMapping("/") //RequestBody is used to get data in json form
	public User userCreate(@RequestBody User user) throws Exception {
	
		user.setProfile("default.png");
		
		Set<UserRole> userRoleSet = new HashSet<UserRole>();
		
		Role role2 = new Role();
		role2.setRoleId(45L);
		role2.setRoleName("NORMAL");
		
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role2);
		
		userRoleSet.add(userRole);
		return this.userService.createUser(user, userRoleSet);
	}
	
	
	@GetMapping("/{username}") //for getting user by username we need to use pathvariable
	public User getUser(@PathVariable("username") String username) {
		
		return this.userService.getUser(username);
	}
	
	@DeleteMapping("{id}")
	public void deleteUser(@PathVariable ("id") Long id) {
		this.userService.deleteUser(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
