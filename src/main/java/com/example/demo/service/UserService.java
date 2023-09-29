package com.example.demo.service;

import java.util.Set;

import com.example.demo.model.User;
import com.example.demo.model.UserRole;

public interface UserService {
	
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username) throws Exception;

	public void deleteUser(Long userId) throws Exception;
}
