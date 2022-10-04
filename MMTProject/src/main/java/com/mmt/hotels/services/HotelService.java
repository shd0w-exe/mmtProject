package com.mmt.hotels.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mmt.bookedHotel.dao.BookedHotelDao;
import com.mmt.bookedHotel.model.BookedHotel;
import com.mmt.hotels.dao.HotelDao;
import com.mmt.hotels.model.Hotel;
import com.mmt.user.dao.UserDao;
import com.mmt.user.model.User;

public class HotelService implements HotelServiceInterface {
	
	@Autowired
	private HotelDao hd;
	
	@Autowired
	private BookedHotelDao bd;
	
	@Autowired
	private UserDao ud;
	
	@Override
	public List<Hotel> allHotels() {
		
		return hd.findAll();
	}

	@Override
	public List<Hotel> hotelAtDestinationCity(String city) {
		
		return hd.findByHotelCity(city);
	}

	@Override
	public List<Hotel> hotelAtDestinationCityAc(String city) {
		
		return hd.findByHotelCityAndisAcTrue(city);
	}

	@Override
	public boolean bookHotel(String hotelId,String userId, int noOfRooms, boolean isAc) {
		// TODO Auto-generated method stub
		Hotel hotel = hd.findById(hotelId).get();
		User user = ud.findById(userId).get(); 
		float price = 0;
		BookedHotel book = new BookedHotel();
		if(isAc ) {
			if(hotel.getNoOfAvilableAcRoom() < noOfRooms) return false;
			hotel.setNoOfAvilableAcRoom(hotel.getNoOfAcRooms() - noOfRooms);
			book.setAc(true);
			price = noOfRooms * hotel.getPriceAcRoom();
		}else if(!isAc) {
			if(hotel.getNoOfAvilableNonAcRoom() < noOfRooms) return false;
			hotel.setNoOfNonAcRooms(hotel.getNoOfAvilableNonAcRoom() - noOfRooms);
			book.setAc(false);
			price = noOfRooms * hotel.getPriceNonAcRoom();
		}
		book.setHotel(hotel);
		book.setPrice(price);
		bd.save(book);
		List<BookedHotel> bookHotel = user.getHotel();
		bookHotel.add(book);
		ud.save(user);
		return true;
	}

	@Override
	public boolean cancelHotelBooking(String transactionId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hotel viewHotel(String hotelId) {
		
		return hd.findById(hotelId).get();
	}

	@Override
	public int noOfRoomsAvilable(String hotelId, boolean isAc) {
		
		Hotel hotel = hd.findById(hotelId).get();
		if(isAc) return hotel.getNoOfAvilableAcRoom();
		
		return hotel.getNoOfAvilableNonAcRoom();
	}

	@Override
	public List<Hotel> hotelAtDestinationCityNonAc(String city) {
		return hd.findByHotelCityAndisAcFalse(city);
	}

}
