package com.mmt.flights.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmt.booking.dao.BookingDao;
import com.mmt.booking.model.Booking;
import com.mmt.flights.dao.FlightDao;
import com.mmt.flights.model.Flight;
import com.mmt.user.model.User;



@Service
public class FlightService implements FlightServiceInterface {
	
	@Autowired
	private FlightDao fd;
	
	@Autowired
	private BookingDao bd;
	
	
	@Override
	public List<Flight> flight() {	
		return fd.findAll();
	}



	@Override
	public List<Flight> flightFromStartCityToDestinationCityInOrder(String startCity, String endCity) {
		// TODO Auto-generated method stub
		return fd.findByFlightSourceAndFlightDestination(startCity, endCity);
	}



	



	@Override
	public boolean bookFlight(User user, String flightId, int noOfSeats) {
		Flight flight = fd.findById(flightId).get();
		int emptySeats = flight.getNoOfSeats();
		if(emptySeats < noOfSeats) return false;
		Booking book = new Booking();
		book.setType("Flight");
		book.setUser(user);
		bd.save(book);
		List<Booking> list = user.getBooking();
		list.add(book);
		flight.setNoOfSeats(emptySeats - noOfSeats);
		fd.save(flight);
		return true;
	}

}
