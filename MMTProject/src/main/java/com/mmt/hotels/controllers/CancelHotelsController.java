package com.mmt.hotels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mmt.hotels.services.HotelServiceInterface;

@Controller
public class CancelHotelsController {
	
	@Autowired
	private HotelServiceInterface hs;
	
	@RequestMapping("cancelHotelBooking") //--------- cancelHotelBookingPage
	public String cancelHotelBooking(String TransactionId) {
		hs.cancelHotelBooking(TransactionId);
		return "cancelHotelBookingSuccessfully";
	}
}
