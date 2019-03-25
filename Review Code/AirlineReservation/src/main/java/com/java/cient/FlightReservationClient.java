package com.java.cient;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.java.dto.BookFlight;

public class FlightReservationClient {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		displayMainMenu();
	}

	private static void displayMainMenu() {
		System.out.println("1. Book a flight");
		System.out.println("2. Update a reservation");
		System.out.println("3. Delete reservation");
		System.out.println("4. Search a flight");
		System.out.println("5. Find all flights");
		System.out.println("6. Exit");
		int inputOne = 0;
		do {
			String input = scanner.nextLine();
			try {
				inputOne = Integer.parseInt(input);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid input (1/2/3/4/5/6)");
			}
		} while (true);
		switch (inputOne) {
		case 1:
			bookFlight();
			break;
		case 2:
			updateReservation();
			break;
		case 3:
			deleteReservation();
			break;
		case 4:
			searchFlight();
			break;
		case 5:
			findAllFlights();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Please enter a valid input");
			displayMainMenu();
		}
	}

	private static void findAllFlights() {
		// TODO Auto-generated method stub

	}

	private static void searchFlight() {
		// TODO Auto-generated method stub

	}

	private static void deleteReservation() {
		// TODO Auto-generated method stub

	}

	private static void updateReservation() {
		// TODO Auto-generated method stub

	}

	private static void bookFlight() {
		BookFlight booking = null;
		System.out.println("One Way/ Return");
		String choice = scanner.nextLine();
		System.out.println("Enter from");
		String from = scanner.nextLine();
		System.out.println("Enter to");
		String to = scanner.nextLine();
		System.out.println("Enter number of passengers");
		String snoOfPassengers = scanner.nextLine();
		byte noOfPassengers = 0;
		while (true) {
			try {
				noOfPassengers = Byte.parseByte(snoOfPassengers);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Enter the no of passengers. Should be numeric");
			}
		}
		LocalDate dateOfJourney = null;
		while (true) {
			try {
				System.out.println("Enter date (yyyy-MM-dd) ");
				String flightDate = scanner.nextLine();
				dateOfJourney = LocalDate.parse(flightDate);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Enter date in a proper format (yyyy-MM-dd)");
			}
		}

		if ("One way".equalsIgnoreCase(choice)) {
			booking = new BookFlight(from, to, dateOfJourney, noOfPassengers);
		} else {
			LocalDate rDateOfJourner = null;
			while (true) {
				try {
					System.out.println("Enter return date (yyyy-MM-dd) ");
					String returnDate = scanner.nextLine();
					rDateOfJourner = LocalDate.parse(returnDate);
					break;
				} catch (DateTimeParseException e) {
					System.out.println("Enter date in a proper format (yyyy-MM-dd)");
				}
			}
			booking = new BookFlight(from, to, dateOfJourney, rDateOfJourner, noOfPassengers);
			
		}
	}
}
