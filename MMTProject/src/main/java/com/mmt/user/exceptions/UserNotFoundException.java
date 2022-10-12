package com.mmt.user.exceptions;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 7L;

	public UserNotFoundException(String message) {
		super(message);
	}
}