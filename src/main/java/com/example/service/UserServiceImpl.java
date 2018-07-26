package com.example.service;

import com.example.model.User;

public interface UserServiceImpl {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
