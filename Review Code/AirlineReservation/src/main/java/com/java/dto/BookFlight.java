package com.java.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookFlight {

	private String from, to;
	private boolean twoWay;
	private LocalDate dateOfJourney, returnDate;
	private byte noOfPassengers;

	public BookFlight(String from, String to, LocalDate dateOfJourney, byte noOfPassengers) {
		this.from = from;
		this.to = to;
		this.dateOfJourney = dateOfJourney;
		this.noOfPassengers = noOfPassengers;
		twoWay = false;
	}

	public BookFlight(String from, String to, LocalDate dateOfJourney, LocalDate returnDate, byte noOfPassengers) {
		this.from = from;
		this.to = to;
		this.dateOfJourney = dateOfJourney;
		this.noOfPassengers = noOfPassengers;
		twoWay = true;
		this.returnDate = returnDate;
	}

}
