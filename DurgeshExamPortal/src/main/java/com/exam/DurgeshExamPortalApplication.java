package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.Service.UserService;
import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;

@SpringBootApplication
public class DurgeshExamPortalApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(DurgeshExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
		
//		User user = new User();
//		
//		user.setFirstName("Amol");
//		user.setLastName("Ghanekar");
//		user.setUsername("amol279");
//		user.setPassword("1234");
//		user.setEmail("amol@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet = new HashSet<UserRole>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
		
		
		
	}

}
