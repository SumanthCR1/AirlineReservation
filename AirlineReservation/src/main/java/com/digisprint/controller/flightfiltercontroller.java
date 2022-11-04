package com.digisprint.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.repository.FlightRepository;
import com.digisprint.repository.FlightFilterRepository;
import com.digisprint.service.FlightService;
import com.digisprint.service.FlightFilterService;

@RestController

public class FlightFilterController {

	Flight flights;
	FlightService flightService;
	FlightFilterService flightFilterService;

	public FlightFilterController(FlightService flightService, FlightFilterService flightFilterService) {

		this.flightService = flightService;
		this.flightFilterService = flightFilterService;
	}
	

	@PostMapping("/dataDisplay")
	public ModelAndView filterData(@RequestParam("data") String data, HttpServletRequest request,
			@RequestParam("from") String from, @RequestParam("to") String to, ModelMap map) {

		map.put("from", from);
		map.put("to", to);
		List<Flight> flights = flightFilterService.resultFilter(data, from, to);	
		ModelAndView model = new ModelAndView("getFlight");
		request.setAttribute("result", flights);

		return model;
	}

	@PostMapping("/dataDisplayAfterLogin")
	public ModelAndView filterAfterLogin(@RequestParam("data") String data, HttpServletRequest request,
			@RequestParam("from") String from, @RequestParam("to") String to ,ModelMap map) {
	
		map.put("from", from);
		map.put("to", to);
		
		List<Flight> flights = flightFilterService.resultFilter(data, from, to);

		ModelAndView model = new ModelAndView("loginSuccess");

		request.setAttribute("resultlogin", flights);

		return model;
	}

	@PostMapping("/filterAfterLogin")
	public ModelAndView dataFilterAfterLogin(@RequestParam("data") String data, HttpServletRequest request,
			@RequestParam("from") String from, @RequestParam("to") String to) {
		
		List<Flight> flights = flightFilterService.resultFilter(data, from, to);
		ModelAndView model = new ModelAndView("loginSuccess");
		request.setAttribute("resultlogin", flights);

		return model;
	}

	@PostMapping("/searchStatus/{flightNumber}")

	public ModelAndView flightstatus(@PathVariable int flightNumber, HttpServletRequest request, ModelMap map,
			@RequestParam("number") int number, @RequestParam("date") Date date) {
		System.out.println("Hello");
		ModelAndView model = new ModelAndView("confirmFlight");
		flights=flightFilterService.find(flightNumber);
		request.setAttribute("flightform", flights);
		map.put("date", date);
		map.put("number", number);
	
		return model;
	}

	@GetMapping("confirmingDataAfter")
	public ModelMap flightConfirmDataFinal(ModelMap map) {

		map.put("number", flights.getFlightNumber());
		map.put("name", flights.getFlightName());
		map.put("starts", flights.getStartsFrom());
		map.put("destination", flights.getDestination());
		map.put("arrivaltime", flights.getArrivalTime());
		map.put("departuretime", flights.getDepartureTime());
		map.put("price", flights.getPrice());
		return map;

	}

}