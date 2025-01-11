package com.react.flightservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.react.flightservices.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
