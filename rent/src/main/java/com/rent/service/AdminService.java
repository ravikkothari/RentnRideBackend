package com.rent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rent.model.Admin;
import com.rent.model.Username;
import com.rent.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	
public Admin createAdmin() { 
		  Admin admin=adminRepository.save(new Admin("admin@rentride.com","admin")); 
		  return admin; 
		  }
	 
	
	
}
