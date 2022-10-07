package com.mmt.flights.services;



import java.util.List;

import com.mmt.flights.model.Flight;
import com.mmt.payment.CardDetails;

public interface FlightServiceInterface {
	public List<Flight> flight();
	public boolean bookFlight(String userId , String flightId, int noOfSeats);
	public List<Flight> flightFromStartCityToDestinationCityInOrder(String startCity , String endCity);
	public int noOfSeats(String flightId );
	public boolean isSeatsAvilable(String flightId , int noOfSeats);
	public boolean cancelFlight(String bookingId);
	public Flight viewFlightDetails(String flight);
	public boolean isPaymentDoneFlight(CardDetails cd);
	public float flightPrice(String flightId , int noOfSeats);
}
