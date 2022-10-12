package com.mmt.user.exceptions;

public class NoFlightBookingException extends Exception {
	private static final long serialVersionUID = 10L;

	public NoFlightBookingException(String msg) {
		super(msg);
	}

}
