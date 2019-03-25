package com.java.service;

import com.java.exception.DatabaseException;
import com.java.repository.FlightRepository;

public class FlightService {

	
	FlightRepository rep= new FlightRepository();
	
	void bookFlight() throws DatabaseException {
		rep.bookFlight(null);
	}
}
