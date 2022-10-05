package com.mmt.flights.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mmt.flights.model.Flight;
import com.mmt.flights.services.FlightService;



@Controller
public class BookFlightController {
	@Autowired
	private FlightService fs;
	
	
	@RequestMapping("bookFlight") //-- bookFlightPage
	public String bookFlight(Flight flight , @RequestParam("noOfSeats")int noOfSeats ,@RequestParam("flightId")String flightId ,HttpSession session) {
		String userId = (String) session.getAttribute("user");
		if(userId== null) return "userLoginPage";
		if(fs.bookFlight(userId, flightId, noOfSeats)) return "succesfullyBookedFlight";
		return "BookedFlightFailed";
	}
}
