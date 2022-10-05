package com.mmt.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mmt.admin.service.AdminServiceInterface;
import com.mmt.flights.model.Flight;

@Controller
public class AddFlightController {
    @Autowired
    private AdminServiceInterface as;

    @RequestMapping("addFlight") // -- addFFlightPage
    public String addHotel(Flight flight) {
        as.addFlight(flight);
        return "hotelAddedSuccessfully";
    }
}
