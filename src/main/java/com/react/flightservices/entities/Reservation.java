package com.react.flightservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {

	private boolean checkIn;
	private int noOfBags;

	@OneToOne
	private Flight flight;
	@OneToOne
	private Passenger passenger;

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public int getNoOfBags() {
		return noOfBags;
	}

	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}
