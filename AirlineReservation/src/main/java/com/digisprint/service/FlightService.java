package com.digisprint.service;

import java.sql.Time;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.model.*;
import com.digisprint.repository.FlightRepository;

@Component
@Service
public class FlightService {

	FlightRepository flightRepository;

	public FlightService(FlightRepository flightRepository) {
	
		this.flightRepository = flightRepository;
	}
	public List<Flight> allFlightList() {
		  
		  List<Flight> flight = new ArrayList<Flight>();
		  flightRepository.findAll().forEach(flights -> flight.add(flights));
		return flight;
	
}
	public ModelAndView addFlights(int flightNumber, String flightName, String startsFrom, String destination,
			Time arrivalTime, Time departureTime, Time travelTime, int totalCapacity,
			 int numberOfSeatsAvailable, String typesOfSeatsAvailable, int price, ModelMap map) {

		Flight flight=new Flight();
		
		flight.setFlightNumber(flightNumber);
		flight.setFlightName(flightName);
		flight.setStartsFrom(startsFrom);
		flight.setDestination(destination);
		flight.setArrivalTime(arrivalTime);
		flight.setDepartureTime(departureTime);
		flight.setTravelTime(travelTime);
		flight.setTotalCapacity(totalCapacity);
		flight.setNumberOfSeatsAvailable(numberOfSeatsAvailable);
		flight.setTypesOfSeatsAvailable(typesOfSeatsAvailable);
		flight.setPrice(price);
		
		this.flightRepository.save(flight);
		
		map.put("flightNumber", flightNumber);
		map.put("flightName",flightName);
		map.put("startsFrom", startsFrom);
		map.put("destination", destination);
		map.put("arrivalTime", arrivalTime);
		map.put("departureTime", departureTime);
		map.put("travelTime", travelTime);
		map.put("totalCapacity", totalCapacity);
		map.put("numberOfSeatsAvailable", numberOfSeatsAvailable);
		map.put("typesOfSeatsAvailable", typesOfSeatsAvailable);
		map.put("price", price);
		
		ModelAndView madel= new ModelAndView("flightAddedSuccess");
		return madel;
		
	}
	public List<Flight> flightlistfilter(String from, String to) {

		  List<Flight> flight = new ArrayList<Flight>();
		  flightRepository.findAll().forEach(flights -> flight.add(flights));
		
		return flight;
	}
	
 
}