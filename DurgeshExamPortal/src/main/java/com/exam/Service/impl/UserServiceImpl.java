package com.exam.Service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.Service.UserService;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	//creating user
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		
		User local = this.userRepository.findByUsername(user.getUsername());
		if(local!=null) { //check that user is already exist or not
			System.out.println("User is already there !!");
			throw new Exception ("User already present !!");
		}else {
			//if user does not exist then create new user
			for(UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}
	
	
	//getting user by username
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}

	//deleting user by id
	@Override
	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
