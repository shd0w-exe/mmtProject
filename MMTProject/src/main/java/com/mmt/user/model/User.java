package com.mmt.user.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import com.mmt.bookedFlight.model.BookedFlight;
import com.mmt.bookedHotel.model.BookedHotel;
import com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator;

@Entity
@Table(name = "userdetails")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
	@GenericGenerator(name = "users_seq", strategy = "com.mmt.sequencegenerator.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "User_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String userId;
	@NotNull
	@Size(min=3 , max =30)
	private String firstName;
	private String middleName;
	@Size(min=3 , max =30)
	private String lastName;
	@Pattern(regexp="(^$|[0-9]{10})")
	private String mobileNumber;
	@Email
	private String mailID;
	@Size(min=8 , max =15)
	private String password;

	@OneToMany(mappedBy = "user" , cascade=CascadeType.ALL, orphanRemoval = true)
	private List<BookedHotel> hotelBooking = new ArrayList<>();
	@OneToMany(mappedBy = "user",  cascade=CascadeType.ALL ,orphanRemoval = true)
	private List<BookedFlight> flightBooking = new ArrayList<>();

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<BookedHotel> getHotelBooking() {
		return hotelBooking;
	}
	public void setHotelBooking(List<BookedHotel> hotelBooking) {
		this.hotelBooking = hotelBooking;
	}
	public List<BookedFlight> getFlightBooking() {
		return flightBooking;
	}
	public void setFlightBooking(List<BookedFlight> flightBooking) {
		this.flightBooking = flightBooking;
	}

	

	
	
}
