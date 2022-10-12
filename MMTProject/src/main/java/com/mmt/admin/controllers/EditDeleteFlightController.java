package com.mmt.admin.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mmt.admin.exceptions.FlightIdNotFoundDeleteException;
import com.mmt.admin.exceptions.FlightIdNotFoundException;
import com.mmt.admin.service.AdminServiceInterface;
import com.mmt.flights.model.Flight;

@Controller
public class EditDeleteFlightController {
	@Autowired
	private AdminServiceInterface as;

	Logger logger = LoggerFactory.getLogger(FlightIdNotFoundException.class);

	@ExceptionHandler(value = FlightIdNotFoundException.class)
	public String flightIdNotFoundExceptionHandler(Model m) {
		m.addAttribute("message", "flight not found");
		logger.error("Flight Not Found");
		return "flightNotPresentAlert";
	}

	@ExceptionHandler(value = FlightIdNotFoundDeleteException.class)
	public String flightIdDeleteNotFoundExceptionHandler(Model m) {
		m.addAttribute("message", "flight not found");
		logger.error("Flight Not Found");
		return "removeFlightPage";
	}

	@RequestMapping("updateFlight") // -- updateFlightPage
	public String updateFlight(@Valid @ModelAttribute("updateFlight") Flight flight, BindingResult br, Model m)
			throws FlightIdNotFoundException {
		if (br.hasErrors())
			return "updateFlightPage";
		if (as.updateFlight(flight)) {
			m.addAttribute("message", "flight updated");
			return "updateFlightPage";
		}
		throw new FlightIdNotFoundException("Flight Not Found");
	}

	@RequestMapping("deleteFlight") // -- deleteFlightpage
	public String deleteFlight(@RequestParam("flightId") String flightId, Model m)
			throws FlightIdNotFoundDeleteException {
		if (as.removeFlight(flightId)) {
			m.addAttribute("message", "flight Deleted");
			return "removeFlightPage";
		} else {
			System.out.println("delted");
			throw new FlightIdNotFoundDeleteException("Flight Not Found");
		}
	}
}
