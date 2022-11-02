package com.digisprint.service;

import java.sql.Time;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String addflights(@RequestParam("flightnumber") int flightnumber, @RequestParam("flightname") String flightname,
			@RequestParam("startsfrom") String startsfrom, @RequestParam("destination") String destination,
			@RequestParam("arrivaltime") Time arrivaltime, @RequestParam("departuretime") Time departuretime,
			@RequestParam("traveltime") Time traveltime, @RequestParam("totalcapacity") int totalcapacity,
			@RequestParam("numberofseatsavailable") int numberofseatsavailable, @RequestParam("typesofseatsavailable") String typesofseatsavailable,
			 @RequestParam("price") int price, ModelMap map) {

		Flight flight=new Flight();
		

		flight.setFlightnumber(flightnumber);
		flight.setFlightname(flightname);
		flight.setStartsfrom(startsfrom);
		flight.setDestination(destination);
		flight.setArrivaltime(arrivaltime);
		flight.setDeparturetime(departuretime);
		flight.setTraveltime(traveltime);
		flight.setTotalcapacity(totalcapacity);
		flight.setNumberofseatsavailable(numberofseatsavailable);
		flight.setTypesofseatsavailable(typesofseatsavailable);
		flight.setPrice(price);
		
		this.flightrepository.save(flight);
		
		map.put("flightnumber", flightnumber);
		map.put("flightname",flightname);
		map.put("startsfrom", startsfrom);
		map.put("destination", destination);
		map.put("arrivaltime", arrivaltime);
		map.put("departuretime", departuretime);
		map.put("traveltime", traveltime);
		map.put("totalcapacity", totalcapacity);
		map.put("numberofseatsavailable", numberofseatsavailable);
		map.put("typesofseatsavailable", typesofseatsavailable);
		map.put("price", price);
		
		
		return "flightaddedsuccess";
		
		
	}
	public List<Flight> flightlistfilter(String from, String to) {

		  List<Flight> flight = new ArrayList<Flight>();
		  flightrepository.findAll().forEach(flight1 -> flight.add(flight1));
		
		return flight;
	}
	
 
}