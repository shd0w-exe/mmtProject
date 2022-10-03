package com.mmt.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmt.booking.model.Booking;

public interface BookingDao extends JpaRepository<Booking, String> {

}
