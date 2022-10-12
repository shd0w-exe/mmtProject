package com.mmt.user.exceptions;

public class NoBookingFoundException extends Exception {
	private static final long serialVersionUID = 9L;

	public NoBookingFoundException(String msg) {
		super(msg);
	}
}
