package com.rent.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.rent.model.Username;
import com.rent.service.UsernameService;

import io.swagger.annotations.Api;

@RestController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of User.")
public class UsernameController {

	private static final Logger logger = LoggerFactory.getLogger(UsernameController.class);

	@Autowired
	UsernameService usernameService;

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/createuser")
	public ResponseEntity<String> createUser(@RequestBody Username username) {
		usernameService.createUser(username);
		return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/allusers")
	public ResponseEntity<List<Username>> allUsers() {
		List<Username> users = usernameService.getAllUser();

		return new ResponseEntity<>(users, HttpStatus.OK);
	}


	@CrossOrigin(origins = "http://localhost:3000")

	@PostMapping("/user/login") 
	public ResponseEntity<String> loginUser(@RequestParam String email,@RequestParam String password )
	{
		logger.info("User Login Method Started!"); 
		Username user =usernameService.loginUser(email,password); 
		if (user !=null) { 
			return new ResponseEntity<String>("User Login Successfull!!!", HttpStatus.OK); 
		}
		else {
			return new ResponseEntity<String>("User Login Failed!!!",	HttpStatus.BAD_REQUEST);
		}
	}

}
