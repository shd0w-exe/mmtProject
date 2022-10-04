package com.mmt.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mmt.bookedFlight.model.BookedFlight;
import com.mmt.bookedHotel.model.BookedHotel;
import com.mmt.flights.model.Flight;
import com.mmt.hotels.model.Hotel;
import com.mmt.transaction.model.Transaction;
import com.mmt.user.dao.UserDao;
import com.mmt.user.model.User;

public class UserService implements UserServiceInterface{
	
	@Autowired
	private UserDao ud;
	@Override
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createuser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userLogin(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userLogout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		User existUser = ud.findById(user.getUserId()).get();
		if(user.getMobileNumber() != null) {
			existUser.setMobileNumber(user.getMobileNumber());
		}
		if(user.getAddress()!=null) {
			existUser.setAddress(user.getAddress());
		}
		
		ud.save(existUser);
		return false;
	}

	@Override
	public List<User> userByNoOfBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User viewUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Transaction> allTransactionByUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> allBookedHotels(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> allBookedFlight(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookedFlight viewLastFlightBooking(String bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookedHotel viewLastHotelBooking(String bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateBookingFlight(BookedFlight booking) {
		// TODO Auto-generated method stub
		return false;
	}

}
