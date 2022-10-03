package com.mmt.flights.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator;


public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flights_seq")
	@GenericGenerator(name = "flights_seq", strategy = "com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "Flight_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String flightId;
	private String flightNumber;
	private String airlineName;
	private Time flightDuration;
	private Time flightDeparture;
	private Time flightArrival;
	private String flightSource;
	private String flightDestination;
	
	
	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
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

	public Time getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(Time flightDuration) {
		this.flightDuration = flightDuration;
	}

	public Time getFlightDeparture() {
		return flightDeparture;
	}

	public void setFlightDeparture(Time flightDeparture) {
		this.flightDeparture = flightDeparture;
	}

	public Time getFlightArrival() {
		return flightArrival;
	}

	public void setFlightArrival(Time flightArrival) {
		this.flightArrival = flightArrival;
	}

	
	
}
