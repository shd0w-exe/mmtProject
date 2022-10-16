package com.mmt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mmt.admin.dao.AdminDao;
import com.mmt.admin.model.Admin;
import com.mmt.flights.dao.FlightDao;
import com.mmt.flights.model.Flight;
import com.mmt.hotels.dao.HotelDao;
import com.mmt.hotels.model.Hotel;
import com.mmt.user.dao.UserDao;
import com.mmt.user.model.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MmtProjectApplicationTests {

	@Autowired
	private UserDao ud;

	@Autowired
	private AdminDao ad;

	@Autowired
	private FlightDao fd;

	@Autowired
	private HotelDao hd;

	@Test
	public void testAdminLogin() {
		Admin admin = ad.findByAdminIdAndAdminPassword("ankury", "1234");
		String id = admin.getAdminId();
		String pass = admin.getAdminPassword();

		assertEquals("ankury", id);
		assertEquals("1234", pass);
	}

	@Test
	public void testUserLogin() {
		User user = ud.findByMailIDAndPassword("ankur@gmail.com", "Ankur@321");
		String id = user.getMailID();
		String pass = user.getPassword();

		assertEquals("ankur@gmail.com", id);
		assertEquals("Ankur@321", pass);
	}

	@Test
	public void testFlightPresent() {

		Flight flight = fd.findById("Flight_00001").get();
		String id = flight.getFlightId();
		assertEquals("Flight_00001", id);
	}

	@Test
	public void testHotelPresent() {
		Hotel hotel = hd.findById("hotel_00001").get();
		String id = hotel.getHotelId();
		assertEquals("hotel_00001", id);
	}

}
