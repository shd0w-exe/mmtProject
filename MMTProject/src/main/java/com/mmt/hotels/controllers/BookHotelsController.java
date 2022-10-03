package com.mmt.hotels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mmt.hotels.services.HotelServiceInterface;

@Controller
public class BookHotelsController {
	@Autowired 
	private HotelServiceInterface hs;
	
	
	
	@RequestMapping("bookHotel") //--------bookHotelForm
	public String bookHotel(String HotelId , int noOfRooms , boolean isAc) {
		hs.bookHotel(HotelId, noOfRooms, isAc);
		return "bookHotelSuccessfully";
	}
	
	
}
