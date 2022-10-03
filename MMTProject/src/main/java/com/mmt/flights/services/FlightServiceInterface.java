package com.mmt.flights.services;



import java.util.List;

import com.mmt.flights.model.Flight;
import com.mmt.user.model.User;

public interface FlightServiceInterface {
	public List<Flight> flight();
	public boolean bookFlight(User user , String flightId, int noOfSeats);
//	public List<Flight> flightByDestination(String destination);
	public List<Flight> flightFromStartCityToDestinationCityInOrder(String startCity , String endCity);
	
	
}
