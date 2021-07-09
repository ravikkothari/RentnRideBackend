package com.rent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rent.model.Username;
import com.rent.repository.UsernameRepository;



@Service
@Transactional
public class UsernameService {

	@Autowired
	UsernameRepository usernameRepository;
	
	//Username username = new Username();
	
	public Username createUser(Username username) {
		
		
			Username user=usernameRepository.save(username);
			
				return user;
	}
	
	public List<Username> getAllUser() {
		List<Username> allUsers = usernameRepository.findAll();
		
		return allUsers;
	}
	
	 public Username loginUser(String email, String password) { 
		 return usernameRepository.loginUser(email, password); }
	 
	
}