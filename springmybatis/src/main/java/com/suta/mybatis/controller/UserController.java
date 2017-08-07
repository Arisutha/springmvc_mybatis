package com.suta.mybatis.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suta.mybatis.model.User;
import com.suta.mybatis.service.UserService;

@RestController
public class UserController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/getAllUser", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUser(){
		List<User> listUser = null;
		try {
			listUser = this.userService.getAllUser();
			
			return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/user/getSingleUser", method = RequestMethod.POST)
	public ResponseEntity<User> getSingleUser(@RequestBody User temp){
		User user = null;
		try {
			user = this.userService.getSingleUser(temp.getId());
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/user/insertUser", method = RequestMethod.POST)
	public ResponseEntity<Boolean> insertUser(@RequestBody User user){
		try {
			boolean result = this.userService.insert(user);
			if(result) return new ResponseEntity<Boolean>(result, HttpStatus.OK);
			else return new ResponseEntity<Boolean>(result, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/user/updateUser", method = RequestMethod.POST)
	public ResponseEntity<Boolean> updateUser(@RequestBody User user){
		try {
			boolean result = this.userService.update(user);
			if(result) return new ResponseEntity<Boolean>(result, HttpStatus.OK);
			else return new ResponseEntity<Boolean>(result, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/user/deleteUser", method = RequestMethod.POST)
	public ResponseEntity<Boolean> deleteUser(@RequestBody User user){
		try {
			boolean result = this.userService.delete(user.getId());
			if(result) return new ResponseEntity<Boolean>(result, HttpStatus.OK);
			else return new ResponseEntity<Boolean>(result, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
