package com.java.dto;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flight {
	private int id;
	private String name;
	private Map<FlightClass, Integer> seatsAvailable = new HashMap<>();
	private Map<DayOfWeek, Set<Trip>> schedule= new HashMap<>();
	private Map<FlightClass, Integer> totalSeats= new HashMap<>();
}

enum FlightClass {
	ECONOMY, BUSINESS, FIRST_CLASS; // static, final
}