package com.mmt.user.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mmt.address.model.Address;
import com.mmt.user.model.User;
import com.mmt.user.services.UserServiceInterface;

@Controller
public class UpdateDetailsController {
	@Autowired
	private UserServiceInterface us;
	
	@RequestMapping("updateUserDetails")
	public String updateUserDetails(User user , HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		user.setUserId(userId);
		us.updateUser(user);
		return "updatePage";
	}
	
	@RequestMapping("updateUserAddress")
	public String updateUserAddress(Address address,HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		us.updateUserAddress(address, userId);
		return "userDetailPage";
	}
	
}
