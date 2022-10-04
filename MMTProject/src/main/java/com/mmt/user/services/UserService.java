package com.mmt.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mmt.bookedFlight.dao.BookedFlightDao;
import com.mmt.bookedFlight.model.BookedFlight;
import com.mmt.bookedHotel.dao.BookedHotelDao;
import com.mmt.bookedHotel.model.BookedHotel;

import com.mmt.user.dao.UserDao;
import com.mmt.user.model.User;

public class UserService implements UserServiceInterface{
	
	@Autowired
	private UserDao ud;
	
	@Autowired
	private BookedFlightDao bfd;
	
	@Autowired
	private BookedHotelDao bhd;
	@Override
	public List<User> allUsers() {
		return ud.findAll();
	}

	@Override
	public boolean createuser(User user) {
		ud.save(user);
		return false;
	}

	@Override
	public boolean userLogin(User user) {
		return ud.findByUserIdAndPassword(user.getUserId(), user.getPassword());
	}

	@Override
	public boolean userLogout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String userId) {
		ud.deleteById(userId);
		return false;
	}

	@Override
	public boolean updateUser(User user) {
	
		User existUser = ud.findById(user.getUserId()).get();
		if(user.getMobileNumber() != null) {
			existUser.setMobileNumber(user.getMobileNumber());
		}
		if(user.getAddress()!=null) {
			existUser.setAddress(user.getAddress());
		}
		if(user.getFirstName()!=null) {
			existUser.setFirstName(user.getFirstName());
		}
		if(user.getLastName()!=null) {
			existUser.setLastName(user.getLastName());
		}
		if(user.getMailID()!=null) {
			existUser.setMailID(user.getMailID());
		}
		if(user.getMiddleName()!=null) {
			existUser.setMiddleName(user.getMiddleName());
		}
		if(user.getPassword()!=null) {
			existUser.setPassword(user.getPassword());
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
		
		return ud.findById(userId).get();
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

	@Override
	public List<BookedHotel> allBookedHotels(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookedFlight> allBookedFlight(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
