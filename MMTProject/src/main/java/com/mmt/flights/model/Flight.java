package com.mmt.flights.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator;

@Entity
@Table(name = "flightdetails")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flights_seq")
	@GenericGenerator(name = "flights_seq", strategy = "com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "Flight_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String flightId;
	@NotEmpty
	private String flightNumber;
	@NotEmpty(message = "Airline Number must not be empty!")
	private String airlineName;
//	@NotEmpty
//	private String flightDuration;
	@NotEmpty
	private String flightDeparture;
	@NotEmpty
	private String flightArrival;
	@NotEmpty
	private String flightSource;
	@NotEmpty
	private String flightDestination;
	@Min(value = 0)
	@Max(value = 250)
	private int noOfSeats ;
	private int noOfAvilableSeats;
	@NotNull
	private int pricePerSeat;
	
	

	

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	
	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfAvilableSeats() {
		return noOfAvilableSeats;
	}
	

	

	public int getPricePerSeat() {
		return pricePerSeat;
	}

	public void setPricePerSeat(int pricePerSeat) {
		this.pricePerSeat = pricePerSeat;
	}

	public void setNoOfAvilableSeats(int noOfAvilableSeats) {
		this.noOfAvilableSeats = noOfAvilableSeats;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

//	public String getFlightDuration() {
//		return flightDuration;
//	}
//
//	public void setFlightDuration(String flightDuration) {
//		this.flightDuration = flightDuration;
//	}

	public String getFlightDeparture() {
		return flightDeparture;
	}

	public void setFlightDeparture(String flightDeparture) {
		this.flightDeparture = flightDeparture;
	}

	public String getFlightArrival() {
		return flightArrival;
	}

	public void setFlightArrival(String flightArrival) {
		this.flightArrival = flightArrival;
	}

	

}
