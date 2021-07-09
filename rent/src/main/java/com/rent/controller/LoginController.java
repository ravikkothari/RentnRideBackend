//package com.rent.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.rent.model.Login;
//import com.rent.service.LoginService;
//
//@RestController
//public class LoginController {
// 
//	@Autowired
//	LoginService loginService;
//	
//	@PostMapping("/login")
//	public String login(@RequestBody Login login) {
//		return loginService.login(login);
//	}
//}
