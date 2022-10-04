package com.mmt.bookedFlight;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.mmt.flights.model.Flight;
import com.mmt.user.model.User;

@Entity
public class BookedFlight {
	@Id
	private String bookedFlightId;
	private int noOfSeats;
	private int price;
	private Flight flight;
	private User user;
}
