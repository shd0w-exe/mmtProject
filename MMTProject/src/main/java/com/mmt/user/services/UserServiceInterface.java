package com.mmt.user.services;

import java.util.List;

import com.mmt.booking.model.Booking;
import com.mmt.flights.model.Flight;
import com.mmt.hotels.model.Hotel;
import com.mmt.transaction.model.Transaction;
import com.mmt.user.model.User;

public interface UserServiceInterface{
	public List<User> allUsers();
	public boolean createuser(User user);
	public boolean userLogin(User user);
	public boolean userLogout();
	public boolean deleteUser(String userId);
	public boolean updateUser(User user);
	public List<User> userByNoOfBookings();
	public User viewUser(String userId);
	public Booking viewLastBooking(String bookingID);
	public boolean updateBooking(Booking booking);
	public List<Booking> allBookings(String userId);
	public List<Transaction> allTransactionByUser(String userId);
	public List<Hotel> allBookedHotels(String userId);
	public List<Flight> allBookedFlight(String userId);
}
