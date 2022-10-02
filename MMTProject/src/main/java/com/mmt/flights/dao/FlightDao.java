package com.mmt.flights.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmt.flights.model.Flight;

public interface FlightDao extends JpaRepository<Flight, String> {

}
