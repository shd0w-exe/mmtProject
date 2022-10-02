package com.mmt.flights.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmt.flights.dao.FlightDao;
import com.mmt.flights.model.Flight;


@Service
public class FlightService implements FlightServiceInterface {
	
	@Autowired
	private FlightDao fd;
	
	
	@Override
	public List<Flight> flight() {	
		return fd.findAll();
	}

	@Override
	public List<Flight> flightByDestination(String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> flightFromStartCityToDestinationCityInOrder(String startCity, String endCity) {
		// TODO Auto-generated method stub
		return fd.findByFlightSourceAndFlightDestination(startCity, endCity);
	}

}
