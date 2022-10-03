package com.mmt.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator;

@Entity
@Table(name = "bookingdetails")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookings_seq")
	@GenericGenerator(name = "bookings_seq", strategy = "com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "Booking_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String bookingId;
	
	private String type;
	
	
	

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	
	
}
