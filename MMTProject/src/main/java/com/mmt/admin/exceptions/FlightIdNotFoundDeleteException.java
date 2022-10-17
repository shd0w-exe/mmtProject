package com.mmt.admin.exceptions;

public class FlightIdNotFoundDeleteException extends Exception {
	private static final long serialVersionUID = 5L;
	public FlightIdNotFoundDeleteException(String msg , String  flightId) {
		super(msg);
	}
}
