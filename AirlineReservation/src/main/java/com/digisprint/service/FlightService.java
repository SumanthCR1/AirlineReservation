package com.digisprint.service;

import java.util.ArrayList;

import java.util.List;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.digisprint.model.*;
import com.digisprint.repository.Flightrepository;

@Component
@Service
public class FlightService {

	@Autowired
	Flightrepository flightrepository;

	public List<Flight> flightlist() {
		  
		  List<Flight> flight = new ArrayList<Flight>();
		  flightrepository.findAll().forEach(flight1 -> flight.add(flight1));
		return flight;
	
}

	

/*
 * public List<Flight> flightlistffetch() {
 * 
 * List<Flight> flight = new ArrayList<Flight>();
 * flightrepository.findAll().forEach(flight1 -> flight.add(flight1)); return
 * flight;
 * 
 * }
 */
 
}