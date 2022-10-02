package com.mmt.hotels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmt.hotels.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, String> {
	
}
