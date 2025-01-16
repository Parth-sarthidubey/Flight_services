package com.react.flightservices.api;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.react.flightservices.dto.CreateReservationRequest;
import com.react.flightservices.dto.updateReservationRequest;
import com.react.flightservices.entities.Flight;
import com.react.flightservices.entities.Passenger;
import com.react.flightservices.entities.Reservation;
import com.react.flightservices.repositories.FlightRepository;
import com.react.flightservices.repositories.PassengerRepository;
import com.react.flightservices.repositories.ReservationRepository;

@RestController
public class ReservationRestController {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@GetMapping("/flights")
	public List<Flight> findFlights(@RequestParam("from")String from, @RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate){
		return flightRepository.findFlights(from,to,departureDate);
		
	}
	
	@GetMapping("/flights/{id}")
	public Flight findFlight(@PathVariable("id") int id) {
		return flightRepository.findById(id).get();
	}
	
	
	@PostMapping("/reservations")
	@Transactional
	public Reservation saveReservation(@RequestBody CreateReservationRequest request) {
		
		Flight flight = flightRepository.findById(request.getFlightId()).get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setMiddleName(request.getPassengerMiddleName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		
		Passenger savePassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savePassenger);
		reservation.setCheckedIn(false);
		
		 return reservationRepository.save(reservation);
		
		
	}
	
	@RequestMapping(value = "/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") int id) {
		
		return reservationRepository.findById(id).get();
	}
	
	@PutMapping("/reservations")
	public Reservation updateReservation(@RequestBody updateReservationRequest request) {
		
		Reservation reservation = reservationRepository.findById(request.getId()).get();
		reservation.setNumberOfBags(request.getNoOfBags());
		reservation.setCheckedIn(request.isCheckedIn());
		
		return reservationRepository.save(reservation);
		
	}
	
}
