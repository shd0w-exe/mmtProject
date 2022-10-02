package com.mmt.booking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	private String bookingId;
	
	private String type;
	
	

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	
	
}
