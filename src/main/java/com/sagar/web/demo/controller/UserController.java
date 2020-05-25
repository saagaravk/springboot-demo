package com.sagar.web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sagar.web.demo.entity.User;
import com.sagar.web.demo.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping()
	public ResponseEntity<Object> addCategory(@RequestBody User user) {
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
