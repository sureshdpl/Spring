package com.java.form.service;

import java.util.List;

import com.java.form.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	
}