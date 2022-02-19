package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserRole {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long UserRoleId;
	
	//many roles can be assigned to one user (roles n : 1 user)
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	@ManyToOne
	private Role role;
	
	

	public UserRole(Long userRoleId, User user, Role role) {
		super();
		UserRoleId = userRoleId;
		this.user = user;
		this.role = role;
	}

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUserRoleId() {
		return UserRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		UserRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}
