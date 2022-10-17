package com.mmt.flights.exception;

public class FlightNotFoundForSourceToDestinationException extends Exception {

	private static final long serialVersionUID = 11L;

	public FlightNotFoundForSourceToDestinationException(String msg , String source , String destinaion) {
		super(msg);
	}

}
