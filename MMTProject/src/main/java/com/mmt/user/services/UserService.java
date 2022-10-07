package com.mmt.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmt.address.dao.AddressDao;

import com.mmt.bookedFlight.dao.BookedFlightDao;
import com.mmt.bookedFlight.model.BookedFlight;
import com.mmt.bookedHotel.dao.BookedHotelDao;
import com.mmt.bookedHotel.model.BookedHotel;
import com.mmt.user.dao.UserDao;
import com.mmt.user.model.User;

@Service
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
		User existUser= ud.findByMailIDAndPassword(user.getMailID(), user.getPassword());
		if(existUser==null) return false;
		return true;
	}

	@Override
	public boolean userLogout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String userId , String password) {
		User existUser= ud.findByUserIdAndPassword(userId, password);
		if(existUser==null) return false;
			ud.deleteById(userId);
			return true;
	}

	@Override
	public boolean updateUser(User user , String userId) {
	
		User existUser = ud.findById(userId).get();
		if(user.getMobileNumber() != null) {
			existUser.setMobileNumber(user.getMobileNumber());
		}
//		if(user.getAddress()!=null) {
//			existUser.setAddress(user.getAddress());
//		}
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
		
		User user = ud.findById(userId).get();
		return bhd.findByUser(user);
	}

	@Override
	public List<BookedFlight> allBookedFlight(String userId) {
		User user = ud.findById(userId).get();
		return bfd.findByUser(user);
	}
	
	

//	@Override
//	public boolean updateUserAddress(Address address, String userId) {
//		User user = ud.findById(userId).get();
//		Address oldAddress = ad.findByUserdUserId(userId);
//			if(address.getArea()!=null) oldAddress.setArea(address.getArea());
//			if(address.getCity()!=null) oldAddress.setCity(address.getCity());
//			if(address.getCountry()!=null)oldAddress.setCountry(address.getCountry());
//			if(address.getHouseNo()!=null) oldAddress.setHouseNo(address.getHouseNo());
//			if(address.getPinCode()==0) oldAddress.setPinCode(address.getPinCode());
//			if(address.getState()!=null) oldAddress.setState(address.getState());
//			if(address.getStreetName()!=null) oldAddress.setStreetName(address.getStreetName());
//		user.setAddress(oldAddress);
//		ud.save(user);
//		ad.save(oldAddress);
//		return false;
//	}

//	@Override
//	public Address viewAddress(String userId) {
//		
//		return  ad.findByUserdUserId(userId);
//	}

	@Override
	public String userName(String email, String password) {
		User user = ud.findByMailIDAndPassword(email, password);
		return user.getUserId();
	}

//	@Override
//	public boolean addAddress(Address address, String userId) {
//		User user = ud.findById(userId).get();
//		Address oldAddress = new Address();
//		oldAddress = new Address();
//		oldAddress.setArea(address.getArea());
//		oldAddress.setCity(address.getCity());
//		oldAddress.setCountry(address.getCountry());
//		oldAddress.setHouseNo(address.getHouseNo());
//		oldAddress.setPinCode(address.getPinCode());
//		oldAddress.setState(address.getState());
//		oldAddress.setStreetName(address.getStreetName());
//		oldAddress.setUserd(user);
//		user.setAddress(oldAddress);
//		ud.save(user);
//		ad.save(oldAddress);
//		return false;
//	}
	
	

}
