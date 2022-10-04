package com.mmt.hotels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mmt.hotels.services.HotelServiceInterface;

@Controller
public class BookHotelsController {
	@Autowired 
	private HotelServiceInterface hs;
	
	
	
	@RequestMapping("bookHotel") //--------bookHotelForm
	public String bookHotel(@RequestParam("hotelId")String hotelId , @RequestParam("noOfRooms")int noOfRooms, @RequestParam("isAc")boolean isAc) {
		hs.bookHotel(hotelId, noOfRooms, isAc);
		return "bookHotelSuccessfully";
	}
	
	
}
