package com.rent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rent.model.Admin;
import com.rent.service.AdminService;


@RestController
public class AdminController {  
	
	@Autowired
	private AdminService adminService;
	
	@CrossOrigin(origins ="http://localhost:3000")
	@GetMapping(value="/admin")
	public Admin createAdmin() {
		return adminService.createAdmin();
	}
}
