package com.mmt.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mmt.admin.service.AdminServiceInterface;
import com.mmt.flights.model.Flight;

@Controller
public class EditDeleteFlightController {
	@Autowired
	private AdminServiceInterface as;
	
	@RequestMapping("updateFlight") //-- updateFlightPage
	public String updateFlight(Flight  flight , Model m) {
		if(as.updateFlight(flight)) {
			m.addAttribute("message" , "flight updated");
			return "updateFlightPage";
		}
		m.addAttribute("message" , "flight not found");
		return "updateFlightPage";
	}
	
	@RequestMapping("deleteFlight") // -- deleteFlightpage
	public String deleteFlight(@RequestParam("flightId")String flightId , Model m) {
		if(as.removeFlight(flightId)) {
			m.addAttribute("message" , "flight Deleted");
			return "removeFlightPage";
		}
		m.addAttribute("message" , "flight not found");
		return "removeFlightPage";
	}
}
