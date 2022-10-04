package com.mmt.flights.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmt.bookedFlight.dao.BookedFlightDao;
import com.mmt.bookedFlight.model.BookedFlight;
import com.mmt.flights.dao.FlightDao;
import com.mmt.flights.model.Flight;
import com.mmt.user.model.User;



@Service
public class FlightService implements FlightServiceInterface {
	
	@Autowired
	private FlightDao fd;
	
	@Autowired
	private BookedFlightDao bd;
	
	
	
	@Override
	public List<Flight> flight() {	
		return fd.findAll();
	}



	@Override
	public List<Flight> flightFromStartCityToDestinationCityInOrder(String startCity, String endCity) {
		
		return fd.findByFlightSourceAndFlightDestination(startCity, endCity);
	}



	



	@Override
	public boolean bookFlight(User user, String flightId, int noOfSeats) {
		Flight flight = fd.findById(flightId).get();
		int emptySeats = flight.getNoOfSeats();
		if(emptySeats < noOfSeats) return false;
		BookedFlight book = new BookedFlight();
		book.setBookedFlightId(flightId);
		book.setUser(user);
		book.setNoOfSeats(noOfSeats);
		book.setPrice(noOfSeats * flight.getPricePerSeat());
		bd.save(book);
		List<BookedFlight> list = user.getFlight();
		list.add(book);
		flight.setNoOfSeats(emptySeats - noOfSeats);
		fd.save(flight);
		return true;
	}



	@Override
	public int noOfSeats(String flightId) {
		
		Flight flight = fd.findById(flightId).get();
		return flight.getNoOfSeats();
	}



	@Override
	public boolean isSeatsAvilable(String flightId, int noOfSeatsRequired) {
		
		if(noOfSeatsRequired > noOfSeats(flightId))
			return false;
		return true;
	}



	

}
