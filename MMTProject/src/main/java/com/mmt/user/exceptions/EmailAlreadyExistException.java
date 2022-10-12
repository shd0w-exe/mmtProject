package com.mmt.user.exceptions;

public class EmailAlreadyExistException extends Exception {
	private static final long serialVersionUID = 7L;

	public EmailAlreadyExistException(String msg) {

		super(msg);
	}
}
