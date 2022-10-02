package com.mmt.flights.services;


import java.sql.Time;
import java.util.List;

import com.mmt.flights.model.Flight;

public interface FlightServiceInterface {
	public List<Flight> flight();
	public List<Flight> flightByDestination(String destination);
	public List<Flight> flightByArrivalTime(Time time);
	public List<Flight> flightFromStartCityToDestinationCityInOrder(String startCity , String endCity);
	
	
}
