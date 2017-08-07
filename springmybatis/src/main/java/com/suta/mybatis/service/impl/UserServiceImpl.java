package com.suta.mybatis.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.suta.mybatis.mapper.UserMapper;
import com.suta.mybatis.model.User;
import com.suta.mybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public ArrayList<User> getAllUser() throws Exception {
		return this.userMapper.getAllUser();
	}

	@Override
	public User getSingleUser(int id) throws Exception {
		return this.userMapper.getSingleUser(id);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public boolean insert(User user) throws Exception {
		return this.userMapper.insert(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public boolean update(User user) throws Exception {
		return this.userMapper.update(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public boolean delete(int id) throws Exception {
		return this.userMapper.delete(id);
	}
}
