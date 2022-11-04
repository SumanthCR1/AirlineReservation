package com.digisprint.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.repository.FlightRepository;
import com.digisprint.service.FlightService;

@RestController
public class FlightController {

	FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}

	@GetMapping("/fetchFlights")
	public ModelAndView fetchAllFlights() {
		ModelAndView model = new ModelAndView("addNewFlight");
		return model;
	}

	@PostMapping("/addNewFlight")
	public ModelAndView addFlights(@RequestParam("flightNumber") int flightNumber,
			@RequestParam("flightName") String flightName, @RequestParam("startsFrom") String startsFrom,
			@RequestParam("destination") String destination, @RequestParam("arrivalTime") Time arrivalTime,
			@RequestParam("departureTime") Time departureTime, @RequestParam("travelTime") Time travelTime,
			@RequestParam("totalCapacity") int totalCapacity,
			@RequestParam("numberOfSeatsAvailable") int numberOfSeatsAvailable,
			@RequestParam("typesOfSeatsAvailable") String typesOfSeatsAvailable, @RequestParam("price") int price,
			ModelMap map) {

		return flightService.addFlights(flightNumber, flightName, startsFrom, destination, arrivalTime, departureTime,
				travelTime, totalCapacity, numberOfSeatsAvailable, typesOfSeatsAvailable, price, map);
	}

	@GetMapping("/fetchAllFlightDetails")
	public ModelAndView fetchallRows(HttpServletRequest request) {
		ModelAndView map = new ModelAndView("getFlight");
		;
		List<Flight> allFlights = flightService.allFlightList();
		request.setAttribute("result", allFlights);
		return map;
	}

	@GetMapping("/fetchFlightDetails")
	public ModelAndView fetchRows(HttpServletRequest request, @RequestParam("from") String from,
			@RequestParam("to") String to, ModelMap map) {
		ModelAndView model = new ModelAndView("getFlight");

		List<Flight> flight = flightService.allFlightList();
		List<Flight> result = flight.stream()
				.filter(i -> i.getStartsFrom().equalsIgnoreCase(from) && i.getDestination().equalsIgnoreCase(to))
				.collect(Collectors.toList()); // .filter(a->a.getDestination().equalsIgnoreCase(to)).collect(Collectors.toList());
		request.setAttribute("result", result);
		map.put("from", from);
		map.put("to", to);
		return model;
	}

	@GetMapping("/fetchFlightDetailsLogin")
	public ModelAndView fetchRowsLogin(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("indexFormAfterLogin");
		return model;
	}

	@GetMapping("/fetchFlightDetailsLoginIndex")
	public ModelAndView fetchRowsAfterLogin(HttpServletRequest request, @RequestParam("from") String from,
			@RequestParam("to") String to, @RequestParam("number") String number, @RequestParam("date") Date date,
			ModelMap map) {
		ModelAndView mv = new ModelAndView("loginSuccess");
		List<Flight> flightlist = flightService.allFlightList();
		List<Flight> flight = flightlist.stream()
				.filter(i -> i.getStartsFrom().startsWith(from) && i.getDestination().startsWith(to))
				.collect(Collectors.toList());
		map.put("from", from);
		map.put("to", to);
		map.put("date", date);
		map.put("number", number);

		request.setAttribute("resultlogin", flight);
		request.setAttribute("flight1", flightlist.get(1));
		return mv;
	}

	@GetMapping("failed")
	public ModelAndView loginFailed() {
		ModelAndView model = new ModelAndView("loginFailed");
		return model;
	}

	@GetMapping("/fetchFlightDetailsFromAdmin")
	public ModelAndView fetchFlightDetailsFromAdmin(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("fetchFlightByAdmin");
		List<Flight> flight = flightService.allFlightList();
		request.setAttribute("fromAdmin", flight);
		return model;
	}

}
