package com.digisprint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.digisprint.model.Flight;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public interface FlightFilterRepository extends JpaRepository<Flight, Integer> {
 
	public Flight findByFlightNumber(int flightNumber);
	
}
