package com.mmt.user.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mmt.user.model.User;


@Controller
public class UserNavigationsController {
	
	@RequestMapping("updateUserDetailsPage")
	public String updateUserDetailsPage() {
		return "userUpdateDetails";
	}
	
	@RequestMapping("userSignUp")
	public String userSignUpPage(Model m) {
		m.addAttribute("user" ,new User());
		return "userSignUpPage";
	}
	
	@RequestMapping("userLoginNav")
	public String userLoginNav(Model m) {
		m.addAttribute("user" , new User());
		return "userLoginPage";
	}
	
	@RequestMapping("homeNav")
	public String userHomeNav(HttpSession session) {
		return "userHome";
	}
	
//	@RequestMapping("homeNav")
//	public String userLogout(HttpSession session) {
//		session.removeAttribute("userId");
//		return "userHome";
//	}
	
	
	

}
