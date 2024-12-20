package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.entity.User;
import com.ms.repo.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("save")
	public ResponseEntity<?> savEntity(@RequestBody User user){
		return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
	}

}
