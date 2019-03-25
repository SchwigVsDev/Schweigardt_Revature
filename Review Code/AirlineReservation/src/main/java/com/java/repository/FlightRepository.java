package com.java.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.dto.Flight;
import com.java.exception.DatabaseException;
import com.java.util.DBUtil;

public class FlightRepository {
	//Flight: 1d, Customer, BookFlight
	public void bookFlight(Flight flight) throws DatabaseException{
		//Try with a resource block, it will automatically close the resource
		//once u exit the try blok
		//Class must implement AutoCloseable interface
		try(Connection con=DBUtil.getInstance();
			Statement st= con.createStatement();	){
			
		}
		//Flight: update no of seats available
		//customer table
 catch (SQLException e) {
			throw new DatabaseException("Unable to book a flight! Try again later!!");
		}
	
		
	}

}
//Database: Flight, Customer(detail), booking_history, 
//Flight: id, totalSeats, seatsAvailable, source, destination
//123: 9am-> 12pm delhi -> pune	12:30 pm -> 2:30 pune -> delhi 3 pm -> 6 pm delhi-bangalore
