package com.mmt.admin.exceptions;

public class AdminNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public AdminNotFoundException(String msg) {
		super(msg);
	}
}
