package com.mmt.flights.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mmt.flights.exception.FlightNotFoundForSourceToDestinationException;
import com.mmt.flights.model.Flight;
import com.mmt.flights.services.FlightServiceInterface;

@Controller
public class ViewFlightsController {

	@Autowired
	private FlightServiceInterface fs;

	Logger logger = LoggerFactory.getLogger(ViewFlightsController.class);

	@ExceptionHandler(value = FlightNotFoundForSourceToDestinationException.class)
	public String FlightNotFoundForSourceToDestinationException(Model m) {
		m.addAttribute("message", "No Flight Found");
		return "resultFlightPage";
	}

	@RequestMapping("viewFlightSourceToDestination")
	public String sourceToDestinationFlight(@RequestParam("source") String source,
			@RequestParam("destination") String destination, Model m , HttpSession session)
			throws FlightNotFoundForSourceToDestinationException {
		List<Flight> list = fs.flightFromStartCityToDestinationCityInOrder(source, destination);
		if (list.size() > 0) {
			m.addAttribute("flightList", list);
			return "resultFlightPage";
		}
		String userId = (String) session.getAttribute("userId");
		logger.error("Flight not found source : " +source+" to "+destination +" searched by "+userId );
		throw new FlightNotFoundForSourceToDestinationException("no Flight for destination" ,source, destination);
	}

	@RequestMapping("checkFlight")
	public String checkFlight(@RequestParam("flightId") String flightId, Model m) {
		Flight flight = fs.viewFlightDetails(flightId);
		m.addAttribute("flight", flight);
		return "bookFlightPage";
	}
}
