package com.mmt.hotels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mmt.hotels.dao.HotelDao;
import com.mmt.hotels.model.Hotel;

public class HotelService implements HotelServiceInterface {
	
	@Autowired
	private HotelDao hd;
	@Override
	public List<Hotel> allHotels() {
		// TODO Auto-generated method stub
		return hd.findAll();
	}

	@Override
	public List<Hotel> hotelAtDestinationCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> hotelAtDestinationCityAc(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookHotel(String hotelId, int noOfRooms, boolean isAc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelHotelBooking(String transactionId) {
		// TODO Auto-generated method stub
		return false;
	}

}
