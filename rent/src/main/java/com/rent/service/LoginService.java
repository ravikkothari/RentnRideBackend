//package com.rent.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.rent.model.Login;
//import com.rent.model.Username;
//import com.rent.repository.UsernameRepository;
//
//
//@Service
//public class LoginService {
//	
//	@Autowired
//	UsernameRepository usernameRepository;
//
//	public String login(Login login) 
//    {
//        List<Username> users = usernameRepository.findAll();
//        boolean flag=false;
//        for (Username user : users)
//        {
//            if (user.getPassword().equals(login.getPassword()) && user.getUserLoginId().equals(login.getUserId()))
//            {
//                flag=true;
//                break;
//            }
//            
//        }
//        if(flag)             
//			return login.getUserId() + ", Login Successful";
//		else
//			//return "Login UnSuccessful As Wrong Credentials";
//			return "Invalid userId or password";
//	}
//	
//}
