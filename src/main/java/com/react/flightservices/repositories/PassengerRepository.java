package com.react.flightservices.repositories;


import org.springframework.data.jpa.repository.JpaRepository;


import com.react.flightservices.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
