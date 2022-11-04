package com.digisprint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.digisprint.model.Flight;

@Repository
public interface FlightRepository  extends JpaRepository<Flight,Integer> {
	
	public List <Flight> findAllByflightNumber(int flightNumber);

}
