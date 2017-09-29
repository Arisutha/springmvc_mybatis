package com.suta.mybatis.service;

import java.util.List;

import com.suta.mybatis.model.User;

public interface UserService {

	public List<User> getAllUser() throws Exception;
	
	public User getSingleUser(int id) throws Exception;
	
	public boolean insert(User user) throws Exception;
	
	public boolean update(User user) throws Exception;
	
	public boolean delete(int id) throws Exception;
}
