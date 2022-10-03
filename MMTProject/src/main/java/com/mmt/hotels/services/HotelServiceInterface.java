package com.mmt.hotels.services;

import java.util.List;

import com.mmt.hotels.model.Hotel;

public interface HotelServiceInterface {
	public List<Hotel> allHotels();
	public List<Hotel> hotelAtDestinationCity(String city);
	public List<Hotel>hotelAtDestinationCityAc(String city);
	public boolean bookHotel(String hotelId , int noOfRooms , boolean isAc);
	public boolean cancelHotelBooking(String transactionId);
}
