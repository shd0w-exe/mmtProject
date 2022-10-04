package com.mmt.hotels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mmt.hotels.services.HotelServiceInterface;

@Controller
public class ViewHotelsController {
	@Autowired
	private HotelServiceInterface hs;
	
	@RequestMapping("viewHotel") //-- viewHotelpage
	public String viewHotel(Model m) {
		m.addAttribute("hotelList" ,hs.allHotels() );
		return "hotelView";
	}
}
